package thread;

/**
 * 线程提供了一个方法：join,可以用来协调线程之间的同步运行
 *
 * 同步运行：多个线程执行存在先后顺序
 * 异步运行：多个线程各干各的，互不打扰，并发本身就是异步的
 *
 * join方法可以让调用这个方法的线程进入阻塞状态，直到方法所属线程结束后
 * 才会接解除阻塞
 *
 */
public class JoinDemo {
    //表示图片是否下载完毕
    public static boolean isFinish=false;
    public static void main(String[] args) {
        /*
            当一个方法的局部内部类中想使用这个方法的其他局部变量时
            这个变量必须的final，这源自JVM的内存分配问题
         */
         Thread down=new Thread(){
           public void run(){
               System.out.println("down:开始下载图片");
               for (int i=1;i<=100;i++){
                   System.out.println("down:"+i+"%");
                   try {
                       Thread.sleep(50);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
               System.out.println("down:下载完毕！");
               isFinish=true;
           }
         };
        Thread show=new Thread(){
          public void run(){
              try {
                  System.out.println("show:开始显示文字");
                  Thread.sleep(3000);
                  System.out.println("show:文字显示完毕！");
                  //先等待down工作完毕
                  down.join();
                  System.out.println("show:开始显示图片");
                  if(!isFinish){
                      throw new RuntimeException("show:图片加载失败");
                  }
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
        };
        down.start();
        show.start();


    }
}
