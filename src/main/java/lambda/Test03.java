package lambda;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 将当前目录下的所有文件都复制一份，复制的文件命名为:原
 * 文件名_cp.后缀
 * 比如原文件为:test.dat
 * 复制后的文件为:test_cp.dat
 *
 *
 * @author Xiloer
 *
 */
public class Test03 {
	public static void main(String[] args) throws IOException {
		File dir=new File("./");
		if(dir.isDirectory()){
			File[]subs=dir.listFiles(pathname -> pathname.isFile());
			for(int i=0;i<subs.length;i++){

				RandomAccessFile a=new RandomAccessFile(subs[i].getName(),"rw");
				RandomAccessFile b=new RandomAccessFile(subs[i].getName().replaceAll("\\.","_cp."),"rw");
				int d;
				while ((d=a.read())!=-1){
					b.write(d);
				}
				System.out.println("复制完毕！");
				a.close();
				b.close();
			}
		}

	}
}




/**
 * 思路:
 * 分为几部分考虑.
 * 第一个是要获取到当前目录中的所有文件(思考哪个API可以解决)
 * 第二个是获取到的每一个文件都要复制(复制用什么API)
 * 第三个是复制的文件名，如何重新组建xxx_cp.xxx的名字?
 *      这里要将原文件名拆开后想办法拼接_cp.
 */


