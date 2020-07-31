package day03;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
 * 程序启动后，要求用户输入一个文件名，如果文件存在则提示
 * 并要求用户更换，直到该文件还不存在为止，然后将这个文件
 * 在当前目录中创建出来。
 * 
 * 单词记一记:
 * exsits 存在
 * create 创建
 * new    新的
 * 
 * @author Xiloer
 *
 */
public class Test01 {
	public static void main(String[] args) throws IOException {
		while(true) {
			System.out.println("输入一个文件名！");
			Scanner scan = new Scanner(System.in);
			String input = "./"+scan.nextLine();
			File file = new File(input);
			if(file.exists()) {
				System.out.println("文件已存在！请重新输入。。。");
			}else {
				file.createNewFile();
				System.out.println("文件创建成功！");
				break;
			}
		}
		
	}
}
