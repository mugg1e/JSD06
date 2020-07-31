package day04;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * 完成修改昵称工作
 * 
 * 程序启动后，要求用户输入用户名和新的昵称
 * 然后修改user.dat文件中该用户的昵称
 * 如果输入的用户不存在，则输出"查无此人"
 * @author Xiloer
 *
 */
public class Test02 {
	public static void main(String[] args) throws IOException {
		System.out.println("输入用户名：");
		Scanner scan = new Scanner(System.in);
		String username = scan.nextLine();
		RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
		byte[] data = new byte[32];
		String tip = "查无此人";
		//System.out.println(raf.getFilePointer());
		for(int i=0;i<raf.length()/100;i++) {
			raf.seek((long)((i)*100));
			raf.read(data);
			String strusername = new String(data,"utf-8").trim();
			//System.out.println(raf.getFilePointer());
			if(username.equals(strusername)) {
				System.out.println("输入新昵称：");
				raf.seek((long)(raf.getFilePointer()+32));
				//System.out.println(raf.getFilePointer());
				String nickname = scan.nextLine();
				data = nickname.getBytes("utf-8");
				data = Arrays.copyOf(data, 32);
				raf.write(data);
				System.out.println("修改成功！");
				tip = "";
			}
		}
		System.out.println(tip);
		raf.close();
	}
}
