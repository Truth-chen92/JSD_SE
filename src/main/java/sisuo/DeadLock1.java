package sisuo;

public class DeadLock1 extends Thread{
    public void run(){
        try{
            System.out.println("A运行...");
            while (true){
                synchronized (Client.str1){
                    System.out.println("A锁了s1");
                    Thread.sleep(100);
                    System.out.println("A去锁S2");
                    synchronized (Client.str2){
                        System.out.println("A锁了S2");
                    }
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }



    }
}
