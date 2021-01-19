package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 雙端隊列：java.util.Deque接口
 * Deque繼承自Queue，雙端隊列是隊列兩端都可以做出入隊操作的隊列
 * 實現類：java.uutil.LinkedList
 */
public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque=new LinkedList<>();
        deque.offer("1");
        deque.offer("2");
        deque.offer("3");
        System.out.println(deque);
        deque.offerFirst("4");
        System.out.println(deque);
        deque.offerLast("5");
        System.out.println(deque);
        deque.pollFirst();
        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);






    }

}
