package integer;
/**
 * 	包装类实用功能介绍
 * 	@author muggle
 *
 */
public class IntergeDemo2 {
	public static void main(String[] args) {
		//byte的取值范围
		byte bmax = Byte.MAX_VALUE;
		byte bmin = Byte.MIN_VALUE;
		System.out.println(bmax);
		System.out.println(bmin);
		
		int imax = Integer.MAX_VALUE;
		int imin = Integer.MIN_VALUE;
		System.out.println(imax);
		System.out.println(imax);
		
		long lmax = Long.MAX_VALUE;
		long lmin = Long.MIN_VALUE;
		System.out.println(lmax);
		System.out.println(lmin);
		
		/*
		 * 	数字	     格式	异常
		 * 	NumberFormatExcepton
		 * 
		 * 	包装类都提供了一个静态方法：parseXXX(String s)
		 * 	可以将字符串转换为对应的基本类型
		 * 	前提是这个字符串正确表示了基本类型可以保存的值
		 * 	否则会抛出上述异常：NumberFormatException
		 * 	通常两种情况会引发该异常：
		 * 	1：解析时发现字符串内容不是一个数字时
		 * 	2：解析整数时发现字符串内容格式是一个小数时
		 */
		String line = "123";
//		String line = "123.123";
//		String line = "a";
		int d = Integer.parseInt(line);
		System.out.println(d);
		double dou = Double.parseDouble(line);
		System.out.println(dou);
		
		String s = String.valueOf(dou);
		System.out.println(s);
	}
}
