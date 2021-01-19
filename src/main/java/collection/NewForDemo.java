package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 新循环
 * JDK5之后推出了一个特性：增强型for循坏，也称为新循环
 * 新循环不取代传统的for循环工作，它仅用来使用相同的语法遍历集合或数组
 */
public class NewForDemo {
    public static void main(String[] args) {
        String[]array={"one","two","three","four","five"};
        for(String str:array){
            System.out.println(str);
        }

        Collection<String>c=new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);
        /*
            使用新循坏遍历集合时，编译器会将代码改为使用迭代器进行遍历
            所以要注意，遍历的过程中不能使用集合的方法增删元素
            否则会抛出异常
         */
        for (String str:c){
            System.out.println(str);
        }


    }
}
