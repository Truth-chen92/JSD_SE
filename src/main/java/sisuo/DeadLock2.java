package sisuo;

public class DeadLock2 extends Thread {
    public void run(){
        try{
            System.out.println("B运行...");
            while (true){
                synchronized (Client.str2){
                    System.out.println("B锁了s2");
                    Thread.sleep(100);
                    System.out.println("B去锁S1");
                    synchronized (Client.str1){
                        System.out.println("B锁了s1");
                    }
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
