package string;
/**
 * 	和谐用于
 * 	@author muggle
 *
 */
public class ReplaceAllDemo2 {
	public static void main(String[] args) {
		String regex = "(wqnmlgdsb|cnm|mdzz|nmsl|nc|djb)";
		String message = "wqnmlgdsb!你怎么这么nc，cnm！你这个djb!";
		message = message.replaceAll(regex, "***");
		System.out.println(message);
	}
}
