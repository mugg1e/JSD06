package lambda;
import java.io.File;
import java.io.FileFilter;
/**
 * 	lambda表达式		JDK8之后推出的特性
 * 
 * 	在java中使用lambda可以用精简的语法创建匿名内部类
 * 	语法：
 * 	（参数）->{
 * 		方法体
 * }
 * 
 * 	lambda创建的匿名内部类所实现的接口只能有一个抽象方法。
 * 	
 * 	@author muggle
 *
 */
public class LambdaDemo1 {
	public static void main(String[] args) {
		//匿名内部类创建FileFilter
		FileFilter filte1r = new FileFilter() {
			public boolean accept(File file) {
				return file.getName().startsWith(".");
			}
		};
		/*
		 *	lambda表达式是java编译器认可的，最终编译成class
		 *	文件后会改为内部类形式创建。
		 *	编译器会结合代码分析出创建的时哪个类的实例，由于
		 *	要求接口只有一个抽象方法，所以能断定重写的哪个方法 
		 */
		//lambda
		FileFilter filter2 = (file)->{
			return file.getName().startsWith(".");
		};
		/*
		 * 	如果方法体中只有一句代码，那么lambda表达式中的
		 * 	{}是可以省略的，如果这句代码有return，则该
		 * 	关键字也要一同省略
		 */
		FileFilter filter3 = 
				(file)->file.getName().startsWith(".");
				
		File dir = new File(".");
		dir.listFiles(
				(file)->file.getName().startsWith("."));
		
		/*
		 * 	获取./src目录中的所有的名字中含有"a"的子项
		 */
		File dir1 = new File("./src");
		if(dir1.isDirectory()) {
			File[] sub = dir1.listFiles();
			System.out.println("./src目录中的所有子项:");
			for(int i=0;i<sub.length;i++) {
				System.out.println(sub[i].getName());
			}
			System.out.println();
			File[] arr = dir1.listFiles((file)->file.getName().indexOf("a")!=-1);
			System.out.println("./src目录中含有a的子项：");			
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i].getName());			
			}
		}
	}
}
