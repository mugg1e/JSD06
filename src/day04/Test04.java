package day04;

import java.io.File;

/**
 * 在当前项目目录下新建目录:myBlog
 * 复制当前项目目录下的datasource中所有非md
 * 文件到myBlog中
 * 需求:
 * 根据datasource目录中的子目录名在myBlog目录
 * 中新建对应的子目录，名字为原目录中的英文部分
 * 如:
 * datasource下的子目录分别是:
 * it_科技，life_生活
 * 则就要在myBlog目录下新建子目录:
 * it,life
 * 
 * 并且将datasource下每个子目录中的非md文件都
 * 复制到myBlog对应的目录中
 * 
 * 
 * 实现思路:
 * 可以分步实现:
 * 1:首先的需求是要创建myBlog目录，由于程序
 *   可以多次运行，所以这个目录存在就没有必要
 *   在创建(思考用什么API创建目录，以及怎么
 *   判断这个目录是否存在)
 * 
 * 2:根据需求，要在myBlog目录下创建子目录，
 *   那首先我们要先得到datasource目录下的所有
 *   子目录。有几个子目录就要在myBlog中也创建
 *   几个子目录
 *   思考问题:
 *   1:怎么获取datasource目录下的所有子目录?
 *     
 *   Test05中实现 
 *   2:我们要获取每个子目录名字中英文部分，而
 *     子目录名字的格式如:it_科技。
 *     首先用怎么获取到目录的名字?其次用哪个
 *     API可以获取到it这部分?
 *     
 *   3:获取到英文部分后，怎么在myBlog中创建
 *     这个目录?
 * 
 * Test06实现
 * 3:上述功能做好后，在继续后续工作，在获取到
 *   datasource中每个子目录后并遍历每一个子
 *   目录时，拿到这个子目录就获取它里面所有的
 *   非.md文件(怎么获取到一个目录中符合特定
 *   条件的子项)
 *   拿到后在myBlog创建对应目录后，将这个文件
 *   复制到myBlog目录中即可
 *  
 * 最终在Test06中完成所有功能
 * 
 * 
 * @author Xiloer
 *
 */
public class Test04 {
	public static void main(String[] args) {
		createMyBlogDir();
		File[] subs = getSubFiles();
		System.out.println(subs);
	}
	/**
	 * 在当前项目目录下新建目录myBlog,如果该
	 * 目录存在则不需任何操作
	 */
	public static void createMyBlogDir() {
		
	}
	/**
	 * 获取datasource目录下的所有子目录
	 * 返回的数组中不包含datasource下的文件
	 * @return
	 */
	public static File[] getSubFiles(){
		return null;
	}
}





