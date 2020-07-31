package day04;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 用户登录功能
 * 程序启动后，要求用户输入用户名和密码
 * 然后去user.dat文件中比对
 * 成功则输出:登录成功
 * 失败则输出:登录失败，用户名或密码不正确
 * 
 * 登录失败的条件:用户名输入正确但是密码不正确，或者用户名
 * 输入不正确(user.dat文件中没有此人)
 * 
 * @author Xiloer
 *
 */
public class Test03 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("user.dat","r");
		System.out.println("输入用户名：");
		Scanner scan = new Scanner(System.in);
		String username = scan.nextLine();
		System.out.println("请输入密码：");
		String password = scan.nextLine();
		String output = "登录失败，用户名或密码不正确";
		for(int i=0;i<raf.length()/100;i++) {
			raf.seek((long)(100*i));
			byte[] data = new byte[32];
			raf.read(data);
			String strusername = new String(data,"utf-8").trim();
			if(username.equals(strusername)) {
				raf.seek((long)(raf.getFilePointer()));
				raf.read(data);
				String strpassword = new String(data,"utf-8").trim();
				if(password.equals(strpassword)) {
					output = "登录成功";
				}
			}	
		}
		System.out.println(output);
	}
}
