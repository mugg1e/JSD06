package day03;
import java.io.File;
import java.io.FileFilter;

/**
 * 列出当前目录中所有名字包含s的子项。
 * 
 * 使用匿名内部类和lambda两种写法
 * 
 * 单词记一记:
 * FileFilter   文件过滤器
 * accept       接受
 * 
 * @author Xiloer
 *
 */
public class Test02 {
	public static void main(String[] args) {
		File dir = new File(".");
		FileFilter filter = new FileFilter() {
			public boolean accept(File file) {
				String name = file.getName();
				return name.indexOf("s")!=-1;
			}
		};
		if(dir.isDirectory()) {
			File[] arr = dir.listFiles(filter);
			System.out.println("包含s的子项：");
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i].getName());
			}
			
		}
	}
}
