package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.SplittableRandom;

/**
 * java.util.Queue隊列
 * Queue接口繼承自Collection,所以隊列也是一種集合
 * 隊列可以保存一組元素，但是存取元素必須遵循先進先出原則
 * 常見實現類：java.util.LinkerList
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
        queue.offer("4");
        queue.offer("5");
        System.out.println(queue);
        String str=queue.poll();
        System.out.println(str);
        System.out.println(queue);
        /*
            引用隊首元素，獲取後該元素不會從隊列中刪除
         */
        str=queue.peek();
        System.out.println(str);
        System.out.println(queue);

        for(String s:queue){
            System.out.println(s);
        }
        System.out.println(queue);

        while(queue.size()>0){
            String s=queue.poll();
            System.out.println(s);
        }
    }
}
