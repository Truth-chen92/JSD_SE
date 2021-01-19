package thread;

public class test2 {
    public static void main(String[] args) {
        Person p=new Person();

        Thread t1=new Thread(){
          public void run(){
            p.move();
          }
        };
        Thread t2=new Thread(){
            public void run(){
                p.move();
            }
        };
        t1.start();
        t2.start();
    }
}
class Person{
    public void move(){
        Thread t=Thread.currentThread();
        System.out.println(t.getName()+"看電視！");
        try {
            t.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this){
            System.out.println(t.getName()+"在上廁所");
            try {
                t.sleep(10000);
                System.out.println(t.getName()+"上完了!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

