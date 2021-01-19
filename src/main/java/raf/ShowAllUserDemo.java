package raf;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 将user.dat文件中所有记录读取出来并输出到控制台
 */
public class ShowAllUserDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf=new RandomAccessFile("ueser.dat","r");
        for(int i=0;i<raf.length()/100;i++) {
            byte[] data = new byte[32];
            raf.read(data);
            String username = new String(data, "UTF-8").trim();
            raf.read(data);
            String password = new String(data, "UTF-8").trim();
            raf.read(data);
            String nickname = new String(data, "UTF-8").trim();
            int a = raf.readInt();
            System.out.println("名字" + username + "密码" + password + "昵称" + nickname + "年龄" + a);
        }
    }
}
