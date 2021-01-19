package thread;

/**
 * 获取线程相关信息的方法
 */
public class ThreadInfoDemo {
    public static void main(String[] args) {
        //获取主线程
        Thread main=Thread.currentThread();

        String name=main.getName();
        System.out.println(name);

        long id=main.getId();
        System.out.println(id);

        int pri=main.getPriority();
        System.out.println("优先级："+pri);

        boolean isA=main.isAlive();
        //线程是否为守护线程
        boolean isD=main.isDaemon();
        //线程是否被中断
        boolean isI=main.isInterrupted();
        System.out.println(isA);
        System.out.println(isD);
        System.out.println(isI);


    }
}
