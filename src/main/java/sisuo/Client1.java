package sisuo;

public class Client1 {
    public static void main(String[] ars) {
        TestClass classA = new TestClass();
        TestClass classB = new TestClass();
        new TestLock(classA, classB).start();
        new TestLock(classB, classA).start();
    }
}
