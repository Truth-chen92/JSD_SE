package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RAF读写基本类型数据，以及RAF基于指针的读写操作
 */
public class RAFDemo3 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf=new RandomAccessFile("raf.dat","rw");
        long pos=raf.getFilePointer();
        //创建RAF后指针默认在文件的最开始处。位置的表示与数组下标一样从0开始
        System.out.println("pos:"+pos);

        int max=Integer.MAX_VALUE;
        raf.write(max>>>24);
        System.out.println("pos:"+raf.getFilePointer());
        raf.write(max>>>16);
        raf.write(max>>>8);
        raf.write(max);
        System.out.println("pos:"+raf.getFilePointer());
        raf.writeInt(max);
        System.out.println("pos:"+raf.getFilePointer());
        raf.writeLong(123456789);
        System.out.println("pos:"+raf.getFilePointer());
        raf.writeDouble(1.23);
        System.out.println("pos:"+raf.getFilePointer());

        raf.seek(0);
        int d=raf.readInt();
        System.out.println(d);
        raf.seek(8);
        long l=raf.readLong();
        System.out.println(l);
        double dou=raf.readDouble();
        System.out.println(dou);
        /*
            readInt这些方法在读取相应的字节数的过程中如果
            读取到了文件末尾则会直接抛出EOFException。并不是再用-1
            表示读到了末尾
        */
        raf.close();

    }
}
