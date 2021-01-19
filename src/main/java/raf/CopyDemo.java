package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 文件的复制
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src=new RandomAccessFile("./bullet1.png","r");
        RandomAccessFile desc=new RandomAccessFile("./bullet1_cp.png","rw");
        int d;
        long start=System.currentTimeMillis();
        while ((d=src.read())!=-1){
            desc.write(d);
        }
        System.out.println("复制完毕！");
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        src.close();
        desc.close();



    }
}
