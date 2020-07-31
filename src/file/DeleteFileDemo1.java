package file;
import java.io.File;
import java.io.FileFilter;

public class DeleteFileDemo1 {
	public static void main(String[] args) {
		File dir = new File(".");
		FileFilter filter = new FileFilter() {
			@Override
			public boolean accept(File f) {
				boolean tf = dir.getName().indexOf(".txt")!=-1; 
				return tf;
			}
		};
		File[] df = dir.listFiles(filter);
		System.out.println(df.length);
		for(int i=0;i<df.length;i++) {
			System.out.println(df[i].getName());
		}
		
//		for(int i=0;i<df.length;i++) {
//			if(df[i].isFile()) {
//				df[i].delete();
//			}
//		}
	}
}
