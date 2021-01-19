package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List提供了一堆重载的add,remove方法
 */
public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        System.out.println(list);

        list.add(2,"6");
        System.out.println(list);

        String old=list.remove(3);
        System.out.println(list);
        System.out.println("删除的是"+old);

    }
}
