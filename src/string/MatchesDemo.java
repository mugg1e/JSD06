package string;
/**
 * 	java字符串支持正则表达式操作的方法一：
 * 	boolean mateches(String regex)
 * 	用给定的正则表达式验证当前字符串是否匹配，
 * 	匹配则返回true
 * 	@author muggle
 *
 */
public class MatchesDemo {
	public static void main(String[] args) {
		/*
		 * 	验证email
		 * 	email的正则表达式：
		 * 	[a-zA-Z0-9]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
		 */
		String email = "fan_tastic@baby.com.cn";
		String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-z]+)+";
		boolean match = email.matches(regex);
		if(match) {
			System.out.println("是邮箱！");
		}else {
			System.out.println("不是邮箱！");
		}
	}
}
