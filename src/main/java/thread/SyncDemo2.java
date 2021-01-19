package thread;

/**
 * 有效的缩小同步（排队）的范围可以在保证并发安全的前提下尽可能的提高并发效率
 *
 * 同步块
 * synchronized（同步监视器对象）{
 *     需要多个线程同步执行的代码片段
 * }
 */
public class SyncDemo2 {
    public static void main(String[] args) {
        shop shop=new shop();
//        shop shop2=new shop();
        Thread t1=new Thread(){
            public void run(){
                shop.buy();
            }
        };
        Thread t2=new Thread(){
            public void run(){
                shop.buy();
            }
        };
        t1.start();
        t2.start();

    }
}
class shop{
//  在方法上使用synchronized时，同步监视器对象就是该方法所属对象，即this
    public  void buy(){
        try{
            Thread t=Thread.currentThread();

            System.out.println(t.getName()+":正在挑衣服...");
            Thread.sleep(5000);
            /*同步块在使用时必须制定同步监视器对象（上锁的对象）
             它可以是java忠任何引用类型的实例
             只要保证多个需要同步运行该同步块内容的线程看到的对象是同一个即可
             否则没有效果
             */
            synchronized(this){
                System.out.println(t.getName()+":正在换衣服...");
                Thread.sleep(5000);
            }

            System.out.println(t.getName()+":结账离开.");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}