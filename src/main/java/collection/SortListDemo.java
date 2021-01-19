package collection;
/**
 * 排序自定义元素
 */

import java.util.*;

public class SortListDemo {
    public static void main(String[] args) {
        List<Point>list=new ArrayList<>();
        list.add(new Point(3,5));
        list.add(new Point(10,5));
        list.add(new Point(5,6));
        list.add(new Point(2,6));
        list.add(new Point(9,0));
        System.out.println(list);
        /*
            该sort方法要求集合元素必须实现Comparable接口
            否則編譯不通過
            如果這個sort方法不能直接使用就不使用這個方法了，因為
            它會讓我們的代碼產生了侵入性

            侵入性：當我們調用某個方法功能時，該方法要求我們還要為其
            修改其他地方的代碼時就是侵入性，改的越多侵入性越強
            侵入性不利於代碼的後期維護
         */
//        Collections.sort(list);
//        MyComparator c=new MyComparator();
//        Comparator c=new Comparator<Point>(){
//            public int compare(Point o1, Point o2) {
//                int len1=o1.getX()*o1.getX()+o1.getY()*o1.getY();
//                int len2=o2.getX()*o2.getX()+o2.getY()*o2.getY();
//
//                return len1-len2;
//            }
//        };
        /*
            重載的sort方法允許我們臨時傳入一個比較器作為元素的比較規則
            此時我們可以在排序時通過匿名內部類形式創建一個比較器，為集合元素排序提供比較規則
            實現Comparator接口要重寫方法compare，該方法就是用來定義兩個元素之間
            的大小關係，返回值：
            當返回值>0時，表示o1>o2
            當返回值<0時，表示o1<o2
            當返回值=0時，表示o1=o2
         */
        Collections.sort(list,new Comparator<Point>(){
            public int compare(Point o1, Point o2) {
                int len1=o1.getX()*o1.getX()+o1.getY()*o1.getY();
                int len2=o2.getX()*o2.getX()+o2.getY()*o2.getY();

                return len1-len2;
            }
        });
        System.out.println(list);
    }
}
//class MyComparator implements Comparator<Point> {
//
//
//    @Override
//    public int compare(Point o1, Point o2) {
//        int len1=o1.getX()*o1.getX()+o1.getY()*o1.getY();
//        int len2=o2.getX()*o2.getX()+o2.getY()*o2.getY();
//
//        return len1-len2;
//    }
//}
