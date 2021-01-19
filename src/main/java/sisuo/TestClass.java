package sisuo;

public class TestClass {
    public synchronized void method(TestClass clazz) {
        System.out.println("TestClass method in");
        clazz.method2();
        System.out.println("TestClass method out");
    }

    public synchronized void method2() {
        System.out.println("TestClass method2");
    }
}
