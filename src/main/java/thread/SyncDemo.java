package thread;

/**
 * 多线程并发安全问题
 * 当多个线程并发操作同一临界资源，由于线程切换时机不确定
 * 导致操作顺序出现了混乱而产生错误
 * 严重时可能导致系统瘫痪
 *
 * 临界资源：操作该资源的整个过程同时只能被单个线程进行的资源
 */
public class SyncDemo {
    public static void main(String[] args) {
        Table table=new Table();
        Thread t1=new Thread(){
            public void run(){
                while(true){
                    int bean=table.getBeans();
                    System.out.println(getName()+":"+bean);
                }
            }
        };
        Thread t2=new Thread(){
            public void run(){
                while(true){
                    int bean=table.getBeans();
                    System.out.println(getName()+":"+bean);
                }
            }
        };
        t1.start();
        t2.start();
    }
}
class  Table{
    private int beans=20;
    /**
     * 当一个方法使用synchronized修饰后，这个方法称为同步方法
     * 多个线程不能同时在方法内部执行，只能一个一个执行
     * 将并发操作改为同步操作可以解决并发安全问题
     */
    public synchronized int getBeans(){
        if (beans==0){
            throw new RuntimeException("没有豆子了");
        }
        //判断后，但beans还没有--操作前切换线程，会出现并发安全问题
        Thread.yield();//主动让出CPU时间，模拟到这没有时间了
        return beans--;
    }
}