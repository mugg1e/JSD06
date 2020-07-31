package apidoc;
/**
 * 文档注释只在三个地方使用：类上，方法上，常量上。
 * 
 * 在类上写文档注释，内容为当前类的概要，设计意义等。
 * @author TEDU
 *
 */


public class APIDoc {
	/**
	 * 常量上也可以使用文档注释，说明该常量的意义。
	 */
	public static final String INFO = "你好！";
	/**
	 * 这里用于说明当前方法的功能，例如：
	 * 返回一个含有对给定用户问候语的字符串
	 * @param name 指定的用户名
	 * @return	是一个字符串，内容为:hello! name
	 */
	public String sayHello(String name) {
		return "hello1" + name;
	}
	
	public static void main(String[] args) {
		String h = "hello";
		System.out.println(h);
		h = "hello!";
		System.out.println(h);
	}
}
