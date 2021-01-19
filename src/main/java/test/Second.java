package test;

import sun.net.www.content.image.png;

import java.util.ArrayList;
import java.util.List;

public class Second {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("ok.txt");
        list.add("hello.jpg");
        list.add("day01.rar");
        list.add("world.jpg");
        list.add("no.txt");
        System.out.println(list);
        List<String>sublist=new ArrayList<>();
        sublist=list.subList(1,4);
        System.out.println(sublist);
        for (int i=0;i<sublist.size();i++){
            if(sublist.get(i).contains("jpg")){
               sublist.set(i,sublist.get(i).replaceAll("jpg","png"));
            }
        }
        System.out.println(sublist);
        System.out.println(list);
    }
}
