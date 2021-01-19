package file;
import java.io.File;

/**
 * java.io.File
 * File用于表示硬盘上的一个文件或目录（实际上表示的是一个抽象路径）
 * 使用File可以：
 * 1：访问其表示的文件或目录的属性（名字，大小，权限等）
 * 2：创建，删除文件或目录
 * 3：访问一个目录中的子项
 *
 * 但是File不能访问文件数据
 */
public class FileDemo {
    public static void main(String[] args) {
        /*
            写程序时需要制定路径时通常使用相对路径，虽然看起来模糊，但是它有更好的跨平台性
            “/.”在相对目录中的意思是“当前目录”，这个目录具体指哪里要视当前程序的运行环境
            而定。对于idea和eclipse而言，当前目录制定的是当前程序所在的项目目录
         */
        File file=new File("./demo.txt");
        String  name=file.getName();
        System.out.println(name);
        //返回文件的大小（文件占用的字节量）
        long length=file.length();
        System.out.println(length);

        boolean cr=file.canRead();
        System.out.println(cr);
        boolean cw= file.canRead();
        System.out.println(cw);
        boolean ih=file.isHidden();
        System.out.println(ih);



    }
}
