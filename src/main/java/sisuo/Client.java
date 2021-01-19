package sisuo;

public class Client {
    public static final String str1="something1";
    public static final String str2="something2";

    public static void main(String[] args) {
        new DeadLock1().start();
        new DeadLock2().start();
    }
}
