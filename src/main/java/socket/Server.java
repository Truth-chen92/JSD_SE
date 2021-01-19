package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * 聊天室服务端
 */
public class Server {
    /*
        java.net.ServerSocket是运行在服务端的，如果我们把Socket
        比喻为“电话”，那么ServerSocket则比喻为“总机”
        ServerSocket主要有两个工作：
        1：向服务端的操作系统申请服务端口，客户端就是通过这个端口与
           ServerSocket建立链接的
        2：监听服务端口，一旦一个客户端尝试建立链接，此时会立即创建一个
        Socket（相当于接电话），然后通过这个Socket就可以与建立链接
        的客户端交互了。
     */
    private ServerSocket serverSocket;
    /*
        该数组用于保存所有ClientHandler对应的客户端的输出流
        便于他们之间互相广播消息使用
     */
//    private PrintWriter[] allOut={};
    private Collection<PrintWriter>allOut=new ArrayList<>();
    public Server(){
        System.out.println("正在启动服务端...");
        /*
            创建SeverSocket时要指定服务端口，该端口不能与系统
            中其他程序的端口冲突，否则会抛出异常：
            java.net.BindException:address already in use
         */
        try {
            serverSocket=new ServerSocket(8088);
            System.out.println("服务端启动完毕！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        try {
            /*
                ServerSocket提供的方法：
                Socket accept()
                该方法是一个阻塞方法，调用后程序“卡住”，直到一个客户端
                与服务端建立链接，此时accept方法会立即返回一个Socket
                通过这个Socket就可以和该客户端交互了
                多次调用这个方法就可以让多个客户端建立链接
             */

            while (true) {
                System.out.println("等待客户端链接....");
                Socket socket = serverSocket.accept();
                System.out.println( "客户端链接了...");
                ClientHandler clientHandler=new ClientHandler(socket);
                Thread t=new Thread(clientHandler);
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server =new Server();
        server.start();
    }
    /*
        该线程任务是负责与指定的客户端进行交互
     */
    public class ClientHandler implements Runnable{
        private Socket socket;
        private String host;//远端计算机地址信息（客户端）
        public ClientHandler(Socket socket){
            this.socket=socket;
            //通过获取客户端IP地址字符串形式
            host=socket.getInetAddress().getHostAddress();
        }
        public void run(){
            PrintWriter pw=null;
            try{
                /*
                InputStream getInputStream()
                通过Socket的这个方法可以获取一个字节输入流，读取的就是
                远端计算机发送过来的数据。
             */
//                InputStream is = socket.getInputStream();
//                InputStreamReader isr = new InputStreamReader(is, "UTF-8");
//                BufferedReader br = new BufferedReader(isr);
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
                //通过socket获取输出流，用于给客户端发送消息
//                OutputStream out=socket.getOutputStream();
//                OutputStreamWriter osw=new OutputStreamWriter(out,"UTF-8");
//                BufferedWriter bw=new BufferedWriter(osw);
                BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"));
                pw=new PrintWriter(bw,true);
                //将对应当前客户端的输出流存入allOut,以便其他ClientHandler可以将消息转发给当前客户端
                synchronized (Server.this) {
//                    allOut = Arrays.copyOf(allOut, allOut.length + 1);
//                    allOut[allOut.length - 1] = pw;
                    allOut.add(pw);
                }
//                System.out.println(host+"上线了，当前在线人数："+allOut.length);
                System.out.println(host+"上线了，当前在线人数："+allOut.size());
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(host+"客户端说："+line);
                    //将消息回复给客户端
                    synchronized (Server.this){
//                        for(int i=0;i<allOut.length;i++){
//                            allOut[i].println(host+"说："+line);
//                        }
                        for(PrintWriter p:allOut){
                            p.println(host+"说："+line);
                        }
                    }
                }
            }catch(IOException e){
//                e.printStackTrace();
            }finally {
                //当客户端断开后要进行的相关处理
                synchronized (Server.this) {
//                    for (int i = 0; i < allOut.length; i++) {
//                        if (allOut[i] == pw) {
//                            allOut[i] = allOut[allOut.length - 1];
//                            allOut = Arrays.copyOf(allOut, allOut.length - 1);
//                            break;
//                        }
//                    }
                    allOut.remove(pw);
                }
                System.out.println(host+"下线了，当前在线人数："+allOut.size());
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
