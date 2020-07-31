package integer;
/**
 * 	JDK1.5之后推出了一个特性：自动拆装箱
 * 	该特性是编译器特性，即：编译器源程序时如果发现
 * 	有需要基本类型和引用类型直接互相使用会自动补充代码
 * 	完成他们之间的转换。
 * 	补充代码从基本类型转换为引用类型称为自动装箱
 * 	反之，称为拆箱
 * 	@author muggle
 *
 */
public class IntegerDemo3 {
	public static void main(String[] args) {
		int d = 123;
		/*
		 * 	自动装箱
		 * 	下面代码会被编译器编译后的class中改为：
		 * 	Integer in = Integer.valueOf(d);
		 */
		Integer in = d;
		/*
		 * 	自动拆箱
		 * 	d = in.valueOf();
		 */
		d = in;
		System.out.println(d);
		System.out.println(in);
	}
	public static void dosome(Object o) {
		
	}
}
