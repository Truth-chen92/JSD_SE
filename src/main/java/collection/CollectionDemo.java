package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;

/**
 * java 集合
 * java.util.Collection接口，该接口是所有集合的顶级接口，里面定义了
 * 集合所具有的通用功能
 *
 * 集合与数组一样，可以保存一组元素，并且有多种不同的实现类表示不同种类
 * 的数据结构。对于元素的操作也都做了封装方法，使用方便
 *
 * Collection下面有两个常用的子接口
 * java.util.List：线性表，这类集合可以保存重复元素，并且有序
 * java.util.Set：这类集合不能放重复元素，大部分实现类是无序的
 * 这里集合判定重复元素的标准是依靠元素自身equals方法比较的
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        /*
            boolean add(E e)
            向当前集合中添加给定元素，如果元素成功添加则返回true
         */
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);
        /*
            int size()
            返回当前集合的元素个数
         */
        int size=c.size();
        System.out.println("个数"+size);
        /*
            boolean isEmpty()
            判断当前集合是否为空集
         */
        boolean isEmpty=c.isEmpty();
        System.out.println("是否空"+isEmpty);
        /*
            清空集合
         */
        c.clear();
        System.out.println(c);
        System.out.println("个数"+size);
        System.out.println("是否空"+isEmpty);

    }
}
