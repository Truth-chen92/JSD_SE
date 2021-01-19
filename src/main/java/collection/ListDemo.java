package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List接口
 * List集合继承自Collection,是最常用的一类集合
 * List的特点是可以放重复元素并且有序，在List接口中定义了一组
 * 通过下标操作元素的方法
 *
 * 常用实现类：
 * java.util.ArrayList:使用数组实现，查询性能更好
 * java.util.LinkedList：使用链表实现，增删性能好，收尾增删性能最佳
 * 在没有对性能有特别苛刻要求下，通常使用ArrayList即可
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        /*
            E get(int index)
            获取给定下标处对应的元素
         */
        System.out.println(list.get(3));
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        for(String str:list){
            System.out.println(str);
        }

        System.out.println(list.set(1,"2"));//返回被替换的值
        System.out.println(list);

        for(int i=0;i<list.size()/2;i++){
            String str=list.set(i,list.get(list.size()-1-i));
            list.set(list.size()-1-i,str);
        }
        System.out.println(list);
        /*
            将集合元素反转
            不能创建新集合
         */



    }
}
