package file;

import java.io.File;

/**
 * 创建一个目录
 */
public class MkDirDemo {
    public static void main(String[] args) {
        //在当前目录下新建一个目录：demo
        File dir=new File("a/b/c/d/f");
        if(dir.exists()){
            System.out.println("已存在");
        }else{
            dir.mkdirs();
            System.out.println("创建成功");
        }
    }
}
