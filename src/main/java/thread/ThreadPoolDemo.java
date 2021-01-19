package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 线程池是线程的管理机制，主要解决两个问题
 * 1：重用线程
 * 2：控制线程数量
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        for(int i=0;i<5;i++){
            Runnable run=new Runnable() {
                @Override
                public void run() {
                    Thread t=Thread.currentThread();
                    System.out.println(t.getName()+"正在执行任务...");
                    try {
                        Thread.sleep(5000);
                        System.out.println(t.getName()+"执行完毕！！！");
                    } catch (InterruptedException e) {
                        System.out.println("中断了！");
                    }
                }
            };
            threadPool.execute(run);
            System.out.println("指派了一个任务给线程池...");
        }
    }
}
