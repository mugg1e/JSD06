package file;
import java.io.File;
import java.io.FileFilter;
/**
 * 	获取当前目录中名字中含有"s"的子项
 * 	@author muggle
 *
 */
public class Test {
	public static void main(String[] args) {
		FileFilter filter = new FileFilter() {
			public boolean accept(File file) {
				String name = file.getName();
				return name.indexOf("s")!=-1;
			}
		};
		File dir = new File(".");
		if(dir.isDirectory()) {
			File[] subs = dir.listFiles(filter);
			for(int i=0;i<subs.length;i++) {
				System.out.println(subs[i].getName());
			}
		}
	}
}
