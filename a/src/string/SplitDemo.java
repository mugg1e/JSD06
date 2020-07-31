package string;
/**
 * 	字符串支持正则表达式的方法二：
 * 	String[] split(String regex)
 * 	将当前字符串按照满足正则表达式的部分拆分，将拆分出来的
 * 	每一段都存入数组并将数组返回。
 * 	@author muggle
 *
 */
/**
 * 	打扫房间考虑到
 * 	@author muggle
 *
 */
public class SplitDemo {
	public static void main(String[] args) {
		String str = "abc,def,ghi,jkl";
		//按照", "拆分字符串
		String[] data = str.split(",");
		System.out.println(data.length);
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
		System.out.println();
		str = "abc.def.ghi.jkl";
		//按照"."拆分
		data = str.split("\\.");
		System.out.println(data.length);
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
		System.out.println();
		str = "abc123def4560ghi789jkl";
		/*
		 * 	按照一个数字拆分的话，那么abc和def之间的123
		 * 	会被拆分出两个空字符串。
		 * 	注：当split拆分时发现可以连续进行拆分时，那么
		 * 	这两个可被拆分的内容之间会产生一个空字符串。
		 * 	但是如果在字符串末尾如果连续拆分出来多个空字符串
		 * 	则都会忽略
		 * 	abc123def456ghi789jkl11111111111111
		 * 	上面的字符串如果按\\d拆分，后面一堆1之间的
		 * 	空字符串全部会被忽略
		 */
		//data = str.split("\\d");
		data = str.split("[0-9]+");
		System.out.println(data.length);
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
	}
}
