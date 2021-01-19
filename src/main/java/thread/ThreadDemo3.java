package thread;



/**
 * 使用匿名内部类完成两种线程的创建方式
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        Thread t1= new Thread() {
            public void run() {
                System.out.println("321");
            }
        };

        Runnable r2=() ->{
                System.out.println("123");
        } ;
        Thread t2=new Thread(r2);

        t1.start();
        t2.start();
    }
}
