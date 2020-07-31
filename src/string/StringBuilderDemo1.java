package string;
/**
 * java.lang.StringBuilder
 * StringBuilder是专门设计为了解决字符串修改内容的API。
 * 里面提供了修改字符串的常用操作，比如：增，删，改，插等。
 * StringBuilder内部维护一个可变的char数组 ，因此不会
 * 每次修改内容都创建新对象，所以效率高，开销小。
 * @author muggle
 *
 */
public class StringBuilderDemo1 {
	public static void main(String[] args) {
		System.out.println("增操作：");
		//默认表示空字符串：" "
		//StringBuilder builder = new StringBuilder();
		
		String str = "好好学习java";
		//也可以基于某个字符串创建
		StringBuilder builder = new StringBuilder(str);
		System.out.println(builder);
		
		//StringBuffer是线程安全，StringBuilder不是。两者其它操作都一样。
		//StringBuffer buffer = new StringBuffer(str);
		/*
		 * 增操作 append():将指定内容追加到字符串末尾
		 */
		builder.append(",为了找个好工作。");
		System.out.println(str);	//str还未修改
		System.out.println(builder);
		//通过toString方法获取修改都的字符串
		str = builder.toString();
		System.out.println(str);
		System.out.println();
		
		/*
		 * 	好好学习java，为了找个好工作。
		 * 	好好学习java，就是为了改变世界。
		 * 
		 *	replace(int start,int end,String str)
		 *	将当前字符串中指定范围的内容换成给定的字符串。 
		 */
		System.out.println("改操作：");
		builder.replace(9, 16, "就是为了改变世界");
		System.out.println(builder);
		System.out.println();
		
		/*
		 * 	好好学习java，就是为了改变世界！
		 * 	，就是为了改变世界。
		 * 	删除当前字符串中指定范围内容的内容。
		 */
		System.out.println("删除操作：");
		builder.delete(0, 8);
		System.out.println(builder);
		System.out.println();
		
		/*
		 * 	，就是为了改变世界。
		 * 	活着，就是为了改变世界。
		 * 	insert(int index,String str)
		 * 	将给定的内容插入到指定位置。
		 */
		System.out.println("插入操作：");
		builder.insert(0, "活着");
		System.out.println(builder);
		System.out.println();
		
		//翻转字符串
		builder.reverse();
		System.out.println(builder);
	}
}
