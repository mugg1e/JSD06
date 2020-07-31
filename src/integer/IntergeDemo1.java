package integer;
/**
 * 	包装类：解决基本类型不能直接参与面向对象开发的问题，
 * 	使得基本类型可以以“对象”的形式表示。
 * 	
 * 	@author muggle
 *
 */
public class IntergeDemo1 {
	public static void main(String[] args) {
		/*
		 * 	基本类型转换为包装类建议使用valueOf方法
		 */
		double d = 123.123;
		//从基本类型转换为对应的包装类
		Double d1 = Double.valueOf(d);
		//从包装类转换回基本类型
		int n = d1.intValue();
		double dou = d1.doubleValue();
		long lon = d1.longValue();
		System.out.println(n);
		System.out.println(dou);
		System.out.println(lon);
	}
}
