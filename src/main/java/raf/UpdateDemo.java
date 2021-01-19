package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 修改昵称功能
 * 程序启动后，要求用户输入用户名和新昵称，然后将user.dat文件中该用户的
 * 昵称进行修改，如果输入的用户名不存在则输入“查无此人”
 *
 * 思路：
 * 首先循环读取user.dat文件中每个用户的用户名进行比对，如果找到该用户
 * 则将指针移动到该条记录的昵称位置，然后将新的昵称转换为字节数组后扩容到
 * 32字节并写入覆盖原昵称信息
 */
public class UpdateDemo {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入用户名：");
        RandomAccessFile raf=new RandomAccessFile("ueser.dat","rw");
        String username=scanner.nextLine();
        boolean a=false;
        for (int i = 0; i < raf.length() / 100; i++) {
            byte[] data = new byte[32];
            raf.seek(i * 100);
            raf.read(data);
            String user = new String(data, "UTF-8").trim();
            if (username.equals(user)) {
                System.out.println("请输入修改后的昵称：");
                String b = scanner.nextLine();
                data = b.getBytes("UTF-8");
                data = Arrays.copyOf(data, 32);
                raf.seek(i * 100 + 64);
                raf.write(data);
                raf.close();
                a=true;
                System.out.println("修改完成");
                break;
            }
        }
        if(!a){
            System.out.println("查无此人");
        }
    }
}
