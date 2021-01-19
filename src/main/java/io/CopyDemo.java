package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流完成文件的复制操作
 * 思路：
 * 1：创建一个文件输入流读取原文件
 * 2：创建一个文件输出流用于写复制的文件
 * 3：利用块读写的方法循环从原文件一次读取10K数据并写入到复制文件中
 * 4：复制完毕后关闭两个流
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
//        FileInputStream fos=new FileInputStream("fos.txt");
//        FileOutputStream foscp=new FileOutputStream("fos_cp.txt",true);
//        byte[]data=new byte[1024*10];
//        int len=fos.read(data);
//        String str=new String(data,0,len,"UTF-8");
//        foscp.write(str.getBytes("UTF-8"));
//        System.out.println("复制完成！");
//        fos.close();
//        foscp.close();
        FileInputStream src=new FileInputStream("./qrcode.jpg");
        FileOutputStream desc=new FileOutputStream("./qrcode_cp.jpg");
        int len;
        byte[]data=new byte[1024*10];
        while ((len=src.read(data))!=-1){
            desc.write(data,0,len);
        }
        System.out.println("复制完毕！");

        src.close();
        desc.close();


    }
}
