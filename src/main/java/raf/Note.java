package raf;

import java.io.*;
import java.util.Scanner;

/**
 * 完成简易记事本工具
 * 程序启动后要求用户输入一个文件名，然后对该文件进行写操作
 * 之后用户在控制台输入的每一行内容都要写入到文件中
 * 当用户单独输入“exit"时程序退出
 *
 * 注：写入文件中的数据不需要考虑换行问题
 */
public class Note {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入文件名:");
        File file=new File(scanner.nextLine()+".txt");
        System.out.println("请输入内容：");
        String put=scanner.nextLine();
        RandomAccessFile raf=new RandomAccessFile(file.getName(),"rw");
        while (!put.equals("exit")){
            byte[]data=put.getBytes("UTF-8");
            raf.write(data);
            put=scanner.nextLine();
        }
        if(put.equals("exit")){
            System.out.println("退出程序");
            raf.close();
        }
//        String filename=scanner.nextLine();
//        RandomAccessFile raf=new RandomAccessFile(filename,"rw");
//        System.out.println("请开始输入内容，单独输入exit退出");
//        while(true){
//            String line=scanner.nextLine();
//            if("exit".equals(line)){
//                break;
//            }
//            byte[]data=line.getBytes("UTF-8");
//            raf.write(data);
//        }
//        System.out.println("再见");
//        raf.close();
    }
}
