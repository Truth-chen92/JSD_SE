package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 棧結構
 * 棧可以保存一組元素，存取元素必須遵循先進後出原則
 * 使用棧通常用來完成“後退”功能
 * 雙端隊列接口提供了棧方法，因此我們可以使用雙端隊列完成棧操作
 */
public class StackDemo {
    public static void main(String[] args) {
        Deque<String>stack=new LinkedList<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

        for (String s:stack){
            System.out.println(s);
        }

        while (stack.size()>0){
            System.out.println(stack.pop());
        }
        System.out.println(stack);
    }
}
