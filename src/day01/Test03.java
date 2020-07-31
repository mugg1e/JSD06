package day01;
/**
 * 修改下面代码的错误
 * 
 * 下面代码完成的功能是输出字符串中的每一个字符
 * 
 * 1.string str  第一个s应该大写
 * 2.for循环的方法体括号没把方法给括起来
 * 3.for循环里 str.length 后面加()
 * 4.char r = i.charAt(i);  第一个i改成str
 * 5.运行后报StringIndexOutOfBoundsException异常     在str.length()后加  -1
 * 6.System.err.println(); 输出红字
 * 
 * @author Xiloer
 *
 */
public class Test03 {
	public static void main(String[] args) {
		String str = "hello world! i love java!";
		for(int i = 0;i<str.length();i++) {			
			char c = str.charAt(i);
			System.out.println(c);
		}

	}
}






