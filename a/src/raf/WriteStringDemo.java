package raf;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
/**
 * 	项文件中写入文本数据
 * 	@author muggle
 *
 */
public class WriteStringDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("./raf.txt","rw");
		String str = "鹌鹑安知鸿鹄之志哉";
		/*
		 * 	当指定的字符集拼写不正确时，下面的代码会抛出异常：
		 * 	java.io.UnsupportedEncodingException:uft-8
		 */
		//byte[] data = str.getBytes("uft-8");
		byte[] data = str.getBytes("utf-8");
		raf.write(data);
		System.out.println("OK了！");
		raf.close();
	}
}
