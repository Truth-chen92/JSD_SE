package io;

import java.io.*;

/**
 * 使用流链接创建PrintWrite
 */
public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        FileOutputStream fos=new FileOutputStream("pw2.txt");
        OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
        BufferedWriter bw=new BufferedWriter(osw);
        PrintWriter pw=new PrintWriter(bw);

        pw.println("我想睡觉");
        pw.println("我不想醒");

        pw.close();


    }
}
