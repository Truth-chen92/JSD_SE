package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 當元素已經實現了Comparable接口，但是該比較規則不滿足
 * 我們排序需求時，也可以用重載的sort方法排序
 */
public class SortListDemo3 {
    public static void main(String[] args) {
        List<String >list=new ArrayList<>();
//        list.add("tom");
//        list.add("jack");
//        list.add("rose");
//        list.add("jane");
//        list.add("mike");
//        list.add("tony");
        list.add("一二三");
        list.add("一");
        list.add("一二");
        System.out.println(list);
//        Collections.sort(list,new Comparator<String>(){
//            public int compare(String o1, String o2) {
//                int len1=o1.length();
//                int len2=o2.length();
//                return len1-len2;
//            }
//        });
        Collections.sort(list,((o1, o2) -> o1.length()-o2.length() ));
        System.out.println(list);

    }
}
