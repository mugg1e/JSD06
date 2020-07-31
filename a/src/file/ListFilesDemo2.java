package file;
import java.io.File;
import java.io.FileFilter;
/**
 * 	FileFiter文件过滤器
 * 	
 * 	File[] listfiles(Filter filter)
 * 	该方法是获取该目录中符合给定过滤器要求的所有子项
 * 	@author muggle
 *
 */
public class ListFilesDemo2 {
	public static void main(String[] args) {
		FileFilter file= new FileFilter() {
			/*
			 * 	获取当前目录下所有名字 "." 开始的子项
			 */
			public boolean accept(File file) {
				//过滤条件，满足：名字是"."开始的
				//1. 先获取file表示的文件或目录的名字
				String name = file.getName();
				//2. 判断该名字这个字符是否是"."开始的
				boolean starts = name.startsWith(".");
				return starts;
			}
		};
		
	}
}
