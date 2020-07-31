package file;
import java.io.File;
import java.io.IOException;
/**
 * 	使用File创建一个文件
 * 	
 * 	create:创建
 * 	@author muggle
 *
 */
public class CreatNewFileDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 	在当前目录选新建一个文件：demo.txt
		 */
		File file = new File("./asd.txt");
		/*
		 * 	boolean exists();
		 * 	判断当前File表示的文件或目录是否真实存在，存在
		 * 	则返回true
		 */
		if(!file.exists()) {
			/*
			 * 	eclipse提示：
			 * 	Unhandled exception type IOException
			 * 	未处理		异常		类型		（具体类型）
			 */
			file.createNewFile();
			System.out.println("文件已创建！");
		}else {
			System.out.println("文件已存在！");
		}
	}
}
