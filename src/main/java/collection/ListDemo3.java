package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List提供了获取子集的方法：
 *
 * List subList(int start,int end)
 * 获取当前集合中指定下标范围内的子集（含头不含尾）
 */
public class ListDemo3 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println(list);

        List<Integer>subList=list.subList(3,8);
        for(int i=0;i<subList.size();i++){
            int a=subList.get(i)*10;
            subList.set(i,a);
        }
        System.out.println(subList);
        /*
            原集合对应的元素也跟着发生改变
            因此对子集的操作就是对原集合对应元素的操作
         */
        System.out.println(list);

        list.subList(2,9).clear();
        System.out.println(list);

    }
}
