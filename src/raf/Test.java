package raf;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
/**
 * 	程序启动后，要求在控制台输入一个文件名，然后对该文件
 * 	进行写操作
 * 	之后用户输入的每一行字符串都写入到这个文件中（文件中的
 * 	内容先不考虑换行问题）
 * 	当用户单独输入exit是程序退出
 * 	@author muggle
 *
 */
public class Test {
	public static void main(String[] args) throws IOException{
		System.out.println("输入一个文件名：");
		Scanner scan = new Scanner(System.in);
		String filename = scan.nextLine();
		RandomAccessFile raf = new RandomAccessFile(filename,"rw");		
		System.out.println("创建文件成功！");
		System.out.println("请输入文本：（退出文本输入模式请输入exit）");
		while(true) {
			String input = scan.nextLine();
			if("exit".equals(input)) {
				break;
			}
			byte[] data = input.getBytes("utf-8");
			raf.write(data);
		}
		raf.close();
		System.out.println("已退出输入。");
	}
}
