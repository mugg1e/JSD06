package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 	由于英文数字和符号都是单字节的编码，所以如果是读取
 * 	这些内容
 * 	@author muggle
 *
 */
public class FISDemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("fos2.txt");
		int d;
		while((d = fis.read()) != -1) {
			System.out.println((char)d);
		}
		fis.close();
	}
}
