package day02;
/**
 * 执行程序，分析并解决问题
 * 
 * NumberFormatException出现的情况通常是由包装类将字符串解析为基本类型时,由于字符串内容不能正确描述基本类型导致该异常.
 * 数字    格式      异常
 * 
 * 
 * @author Xiloer
 *
 */
public class Test04 {
	public static void main(String[] args) {
		/*
		 * 原因: 字符串里有个空格
		 */
		String num = "123";
		int d = Integer.parseInt(num);
		System.out.println(d);
		
		/*
		 * 原因: 应该用Double.parseDouble();
		 */
		num = "123.456";
		double d1 = Double.parseDouble(num);
		System.out.println(d1);
		
		/*
		 * 原因:
		 */
		num = "123";
		d = Integer.parseInt(num);
		System.out.println(d);
	}
}