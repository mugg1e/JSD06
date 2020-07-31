package string;
/**
 * 字符串是不改变对象：字符串一旦创建，该对象内容不可改变，
 * 如果改变则会创建新对象
 * 
 * JVM的堆内存中专门有一段空间是用来缓存所有字面量形式
 * 创建的字符串对象，它称为：字符串常量池。
 * 这样的好处是，如果程序执行过程中再次使用已经缓存的字面量
 * 形式创建过的字符串对象时会重用，避免在内存中出现大量内容
 * 一样的字符串对象来减少内存开销。
 * @author muggle
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "123abc";//字面量，直接量
		String s2 = "123abc";//
		
		System.out.println(s1==s2);//true
		
		String s3 = "123abc";
		System.out.println(s2==s3);
		
		s1 = s1 +"!";
		System.out.println(s1==s2);//false
		System.out.println(s1.getBytes());
		System.out.println(s2.getBytes());	
	}
}