package io;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 缓冲字节输出流的缓冲问题
 * 	@author muggle
 *
 */
public class BOS_flushDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("bos.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String str = "你还要我怎样，要怎样";
		bos.write(str.getBytes("utf-8"));//缓冲区读取的数据不满8字节时，不会被读写。
		/*
		 * void flush()
		 * 强制将缓冲流的缓冲区中已经缓存的数据一次性写出
		 * 
		 */
		//bos.flush();
		System.out.println("写出完毕！");
		//缓冲流close时会自动调用一次flush方法
		bos.close();
	}
}
