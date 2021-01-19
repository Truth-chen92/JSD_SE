package file;

import java.io.File;

/**
 * 删除目录
 */
public class DeleteDirDemo {
    public static void main(String[] args) {
        //删除demo目录
        File dir=new File("a");
        if(dir.exists()){
            dir.delete();//删除空目录
            System.out.println("目录删除成功");
        }else {
            System.out.println("目录不存在");
        }
    }
}
