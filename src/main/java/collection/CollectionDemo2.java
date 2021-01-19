package collection;

import io.Person;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 除了用于判断是否为重复元素之外集合中有些操作与元素的equals息息相关
 * 常见的有：contains,remove
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add(new Point(1,2));
        c.add(new Point(3,4));
        c.add(new Point(5,6));
        c.add(new Point(7,8));
        c.add(new Point(1,2));
        /*
            集合重写了toString方法，输出的格式为：
            [元素1.toString()....]
            因此如果集合元素是自定义类型的元素，需要妥善重写元素的toString
            方法才能看到好的效果
         */
        System.out.println(c);

        Point p=new Point(1,2);
        /*
            判断当前集合是否包含给定元素
            判断的依据是看当前集合是否含有与给定元素equals比较为true
            的元素，有则认为包含
         */
        System.out.println(c.contains(p));
        /*
            删除当前集合中与给定元素equals比较为true的元素，如果对于
            List集合这样可以放重复元素的集合，只删除一个
         */
        c.remove(p);
        System.out.println(c);

    }
}
