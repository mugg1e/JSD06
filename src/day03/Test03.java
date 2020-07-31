package day03;
import java.io.File;
import java.io.FileFilter;
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
	public static void main(String[] args) throws IOException{
		File dir = new File("./a");
		File[] f = dir.listFiles();
		for(int i=0;i<f.length;i++) {
			System.out.println(f[i].getName());
		}
		System.out.println();
		for(int i=0;i<f.length;i++) {
			RandomAccessFile src = new RandomAccessFile(f[i],"r");
			//f[i].getName().lastIndexOf(".");
			String str = f[i].getName().substring(0,f[i].getName().lastIndexOf("."));
			String str1 = f[i].getName().substring(f[i].getName().lastIndexOf("."),f[i].getName().length());
			RandomAccessFile desc = new RandomAccessFile(str+"_cp"+str1,"rw");
			int d;
			if((d=src.read())!=-1) {
				desc.write(d);
			}
		}
		File[] f1 = dir.listFiles();
		for(int i=0;i<f1.length;i++) {
			System.out.println(f1[i].getName());
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


