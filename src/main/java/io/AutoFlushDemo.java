package io;

import java.io.*;
import java.util.Scanner;

/**
 *
 */
public class AutoFlushDemo {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner scanner=new Scanner((System.in));
        System.out.println("请输入文件名：");
        String name=scanner.nextLine();
        FileOutputStream fos=new FileOutputStream(name);
        OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
        BufferedWriter bw=new BufferedWriter(osw);
        /*
        在流链接中穿件PrintWriter时，如果第一个参数指定要链接的流后
        可以再传入一个boolean参数，如果这个值为true
        则打开PrintWrite的自动刷新功能
        即：每当我们调用println方法后就会自动flush
        注意：调用print方法不会flush
         */
        PrintWriter pw=new PrintWriter(bw,true);
        System.out.println("请输入内容：");
        while (true){
            String line =scanner.nextLine();
            if("exit".equals(line)){
                break;
            }
            pw.println(line);
        }

        System.out.println("结束");






    }
}
