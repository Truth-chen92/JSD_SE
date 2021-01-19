package reflect;

import java.lang.reflect.Constructor;

/**
 * 使用有参构造进行实例化
 */
public class ReflectDemo3 {
    public static void main(String[] args) {
        Person p=new Person("苍老师",22);
        System.out.println(p);

        try {
            Class cls=Class.forName("reflect.Person");
            Constructor c=cls.getConstructor(String.class,int.class);
            Object o=c.newInstance("克晶",18);
            System.out.println(o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
