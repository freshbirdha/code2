package lession09;

import lession09.Main_1_4.InnerA;

/**
 * 作业类型：代码纠错
 * 作业内容：另行参考作业描述！
 * 
 * @author banma
 */
public class Main_1_5 {

	public class InnerB{
		private InnerB() {}
		public InnerB(String url) {
			this.url = url;
		}
		public String url = "www.banma-school.com";
	}

	public static void main(String[] args) {
		//下面25行 本想实例化 成员内部类 InnerB，结果发现会报错，请解决该问题让能成功实例化，并输出 url的内容
		InnerB a = new Main_1_5.new InnerB();
		System.out.println(a.url);
	}
}
