package thread;

/**
 * 线程的优先级
 * 线程的优先级分为10个等级，分别用整数1-10表示
 * 其中1为最低，5为默认，10为最高
 *
 * 当线程调用start方法后纳入到线程调度器中统一管理
 * 此时线程只能被动的被分配时间片进行并发运行
 * 但是优先级高的获取CPU时间陪的次数越多（处于同一个CPU核心中的线程）
 * 因此通过调整线程的优先级可以最大程度的改善线程获取CPU时间片的概率
 */
public class PriorityDemo {
    public static void main(String[] args) {
        Thread min=new Thread(){
            public void run(){
                for(int i=0;i<10000;i++){
                    System.out.println("min");
                }
            }
        };
        Thread nor=new Thread(){
            public void run(){
                for(int i=0;i<10000;i++){
                    System.out.println("nor");
                }
            }
        };
        Thread max=new Thread(){
            public void run(){
                for(int i=0;i<10000;i++){
                    System.out.println("max");
                }
            }
        };


        min.start();
        nor.start();
        max.start();
    }
}
