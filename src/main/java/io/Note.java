package io;

import java.io.*;
import java.util.Scanner;

/**
 * 程序启动后要求用户输入文件名，然后对文件进行写操作
 * 之后用户输入的每行字符串都按行写入到文件中
 * 当用户单独输入exit时程序退出
 *
 * 要求：自行组建流链接
 */
public class Note {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner scanner=new Scanner((System.in));
        System.out.println("请输入文件名：");
        String name=scanner.nextLine();
        FileOutputStream fos=new FileOutputStream(name,true);
        OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
        BufferedWriter bw=new BufferedWriter(osw);
        PrintWriter pw=new PrintWriter(name,"UTF-8");
        System.out.println("请输入内容：");
        name=scanner.nextLine();
        while (!name.equals("exit")){
            pw.println(name);
            name=scanner.nextLine();
        }

        System.out.println("结束");


        pw.close();


    }
}
