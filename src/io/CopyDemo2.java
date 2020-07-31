package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲流
 * 缓冲流是一对高级流，在流链接中的作用是加快读写效率。
 * 
 * java.io.BufferedInputStream和
 * 
 * 	@author muggle
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("introduce.rar");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("introduce_cp.rar");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int d;
		long start = System.currentTimeMillis();
//		while((d=fis.read())!=-1) {
//			fos.write(d);
//		}
		while((d=bis.read())!=-1) {
			bos.write(d);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制完成，耗时："+(end-start)+"ms");
		bis.close();
		bos.close();
	}
}
