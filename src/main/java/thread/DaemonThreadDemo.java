package thread;


/**
 * 守护线程
 * 守护线程是通过普通线程调用setDaemon()方法设置转变而来的
 * 因此在创建时与普通线程无异
 * 区别在于结束时机上的一点：
 * 当一个进程中的所有普通线程都结束时，进程就会结束，此时会
 * 杀死所有正在运行的守护线程
 */
public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread rose=new Thread(){
            public void run(){
                for(int i=0;i<5;i++){
                    System.out.println("rose:Let me go!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("rose:啊啊啊啊啊啊啊啊啊!");
                System.out.println("扑通！");

            }
        };
        Thread jack=new Thread(){
          public void run(){
              while (true){
                  System.out.println("jack:you jump!i jump!");
                  try {
                      Thread.sleep(1001);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
          }
        };
        rose.start();
        jack.setDaemon(true);//在start之前
        jack.start();
        /*
            只要还有普通线程活着，守护线程就不会被杀掉
         */


    }
}
