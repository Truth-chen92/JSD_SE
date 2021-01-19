package thread;

import java.util.Scanner;

/**
 * sleep阻塞
 *
 * 线程提供了一个静态方法：
 * static void sleep(long ms)
 * 该方法可以让运行这个方法的线程进入阻塞状态指定毫秒
 * 超时后线程会自动回到RUNNABLE状态等待再次获取时间片并发运行
 */
public class SleepDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入一个数字：");
        Long time=scanner.nextLong();

        /*
            程序启动后，要求用户输入一个数字，然后每秒递减
            到0时输出时间到！
         */
        for(;time>0;time--){
            System.out.println(time);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }



        System.out.println("时间到...");


    }
}
