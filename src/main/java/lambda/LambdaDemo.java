package lambda;

import java.io.File;
import java.io.FileFilter;

/**
 * lambda表达式的引入是在JDK8之后开始的
 *
 * lambda可以让我以更精简的语法创建匿名内部类
 *
 * 语法：
 * （参数列表）->{
 *     方法体
 * }
 * lambda创建时要求实现的接口中只能有一个抽象方法！否则不可以使用！
 */
public class LambdaDemo {
    public static void main(String[] args) {
        File dir=new File(".");
        if(dir.isDirectory()){
//            FileFilter filter=(file)->{
//                return file.getName().endsWith(".txt");
//            };
//        File[]subs=dir.listFiles((file)->{
//            return file.getName().endsWith(".txt");
//        });
        File[]subs=dir.listFiles(pathname->pathname.getName().endsWith("txt"));


        System.out.println(subs.length);
        }
    }

}
