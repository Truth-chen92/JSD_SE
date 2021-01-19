package file;

import java.io.File;

/**
 * 删除一个文件
 */
public class DeleteFileDemo {
    public static void main(String[] args) {
        //将当前目录下的test.txt文件删除
        File file=new File("test.txt");
        if(file.exists()){
            file.delete();
            System.out.println("删除成功");
        }else{
            System.out.println("文件不在了");
        }
    }
}
