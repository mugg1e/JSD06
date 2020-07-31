package day03.answer;

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
		File dir = new File(".");
		File[] subs = dir.listFiles(
			(f)->f.isFile()	
		);
		
		for(int i=0;i<subs.length;i++) {
			File file = subs[i];//每个要复制的文件
			String fileName = file.getName();
			System.out.println("原文件名:"+fileName);			
			//文件名最后一个"."之前的内容
			String start = fileName.substring(0,fileName.lastIndexOf("."));
			//文件最后一个"."之后的内容(后缀)
			String end = fileName.substring(fileName.lastIndexOf(".")+1);
			fileName = start+"_cp."+end;
			System.out.println("复制文件的名字:"+fileName);
			RandomAccessFile src
				= new RandomAccessFile(file,"r");
			RandomAccessFile desc
				= new RandomAccessFile(fileName,"rw");
			int d;
			while((d = src.read())!=-1) {
				desc.write(d);
			}
			System.out.println(file.getName()+"复制完毕!");
			src.close();
			desc.close();
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


