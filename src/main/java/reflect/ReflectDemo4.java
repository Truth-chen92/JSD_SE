package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 调用方法
 */
public class ReflectDemo4 {
    public static void main(String[] args) {
        Person p=new Person();
        p.sayHello();

        try {
            Scanner scanner=new Scanner(System.in);
            System.out.println("输入类名：");
            String classname = scanner.nextLine();

            System.out.println("输入方法名：");
            String methodname=scanner.nextLine();

            Class cls=Class.forName(classname);
            Object o=cls.newInstance();
            //获取sayhello方法
            Method method=cls.getMethod(methodname);
            method.invoke(o);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
