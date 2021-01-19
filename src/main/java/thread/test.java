package thread;

public class test {
    public static void main(String[] args) {
        Thread t1=new Thread(){
          public void run(){
              try {
                  while (true){
                      System.out.println(System.currentTimeMillis());
                      sleep(2000);
                  }
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
        };
        Thread t2=new Thread(){
            public void run(){
                try {
                    sleep(10000);
                    System.out.println("線程2結束了！");
                    t1.stop();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();
        t2.start();
    }
}
