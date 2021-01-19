package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合之间的操作
 */
public class CollectionDemo4 {
    public static void main(String[] args) {
        /*
            JDK5之后，java推出了一个特性：泛型
            泛型也称为参数化类型，可以让我们在使用一个类时通过其他声明的
            泛型来指定其内部某个属性或方法的参数或返回值的类型
            使得用起来变的更加灵活
            泛型只能指定为引用类型，对于基本类型数据而言要指定对应的包装类
            如果泛型不指定，则使用默认值Object
         */
        Collection<String> c1=new ArrayList<>();
//        Collection<String> c1=new HashSet<>();
        c1.add("java");
        c1.add("c++");
        c1.add(".net");
        System.out.println("c1"+c1);

        Collection <String> c2=new ArrayList<>();
        c2.add("android");
        c2.add("ios");
        c2.add("java");
        System.out.println("c2"+c2);

        c1.addAll(c2);
        System.out.println("c1"+c1);

        Collection<String> c3=new ArrayList<>();
        c3.add("ios");
        c3.add("c++");
        c3.add("PHP");
        System.out.println(c3);
        boolean contains=c1.containsAll(c3);
        System.out.println(contains);

        c1.remove(c3);
        System.out.println("c1"+c1);
        System.out.println("c3"+c3);


    }
}
