package raf;
import java.util.Arrays;
import java.util.Scanner;
import java.io.RandomAccessFile;
import java.io.IOException;
/**
 * 	完成用户注册功能
 * 	程序启动后要求输入用户名，密码，昵称和年龄
 * 	除了年龄是int值之外剩下的三个是字符串。
 * 	然后将该用户信息写入文件user.dat中。
 * 	
 * 	设计：
 * 	user.dat文件可以保存所有注册用户，每个用户都固定的占用
 * 	100字节。其中用户名，密码，昵称为字符串，各占32字节。
 * 	年龄为int值占4个字节。
 * 	@author muggle
 *
 */
public class RegDemo {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		System.out.println("欢迎注册：");
		System.out.println("请输入用户名：");
		String username = scan.nextLine();
		System.out.println("请输入密码：");
		String password = scan.nextLine();
		System.out.println("请输入昵称：");
		String nickname = scan.nextLine();
		System.out.println("请输入年龄：");
		int age = scan.nextInt();
		System.out.println("用户名："+username+"，密码："+password+"，昵称："+nickname+"，年龄："+age);
		System.out.println("注册完毕");
		RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
		raf.seek(raf.length());
		byte[] data = username.getBytes("utf-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		data = password.getBytes("utf-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		data = nickname.getBytes("utf-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		raf.writeInt(age);
	}
}
