package object;

import java.util.Arrays;

/**
 * 	Object中常被子类重写的方法：toString和equals
 * 	@author muggle
 *
 */
public class Demo {
	public static void main(String[] args) {
		Point p1 = new Point(1,2);
		Point p2 = new Point(3,4);
		Point p3 = new Point(5,6);
		Point p4 = new Point(7,8);
		Point p5 = new Point(9,0);
		/*
		 *	String toString()
		 *	该方法是Object定义的方法，意思是将当前对象转换
		 *	为一个字符串。默认实现中返回的字符串格式为：
		 *	当前类的名字@地址
		 */
		String str = p1.toString();
		System.out.println(str);
		/*
		 * 	System.out.println(Object o)
		 * 	我们经常用此方法输出一个对象，实际上该方法输出
		 * 	到控制台的就是给定对象toString方法返回的字符串
		 */
		System.out.println(p1);
		
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		
		/*
		 * 	任何内容和字符串连接结果都是字符串，对于
		 * 	引用类型连接时，实际上就是与该对象toString
		 * 	方法返回的字符串进行的连接。
		 * 
		 * 	比如String，StingBuilder等都已经重写过该方法
		 */
		String line = "p1:" + p1;
		System.out.println(line);
		
		Point[] arr = {p1,p2,p3,p4,p5};
		System.out.println(Arrays.toString(arr));
		
		Point p = new Point(1,2);
		System.out.println("p:"+p);
		System.out.println("p1:"+p1);
		/*
		 * 	引用类型变量保存的是对象在堆里的地址。
		 * 	p==p1，首先==是值比较，比较的是p变量的值和
		 * 	p1变量的值是否相同。所有只有这两个变量的地址
		 * 	相同（指向同一个对象时）才为true。
		 * 
		 * 	equals方法表达的含义是两个对象的内容是否相同
		 * 	p.equals(p1)意思是p对象的内容和p1对象的内容
		 * 	是否相同，而不是关心他们指向的是否为同一个对象。
		 * 
		 * 	Object提供的equals方法内部仍然是用==比较的，
		 * 	因此若想让子类的equals方法发挥实际比较对象内容
		 * 	的作用就要进行重写。
		 */
		System.out.println(p==p1);	//false
		System.out.println(p.equals(p1));	//equals重写之前为false，重写后为true
	}
}
