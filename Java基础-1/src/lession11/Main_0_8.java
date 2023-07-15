package lession11;
/**
 * 作业类型：代码填空
 * 作业内容：另行参考作业描述！
 * 
 * @author banma
 */
public class Main_0_8 {


	public static void main(String[] args) {
		//请统计以下方法 执行了 多少毫秒,并打印出来
		loop();
	}
	
	private static void loop() {
		int sum = 0;
		for(int i = 0;i < 2000000000L;i++) {
			sum += i;
		}
	}

}
