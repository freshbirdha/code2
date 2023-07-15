package lession10;
/**
 * 作业类型：代码填空
 * 作业内容：另行参考作业描述！
 * 
 * @author banma
 */
public class Main_0_3 {

	public static void main(String[] args) {
		//请理解 为什么这次返回的值是2 而不是1
		int i = test();
		System.out.println(i);
	}
	
	public static int test() {
		
		int a = 0;
		try {
			a = 1;
			if(a == 1) {
				throw new Exception();
			}
		} catch (Exception e) {
			return a; //在方法中 遇到 return 关键字，会将 返回的值给记录下来，类似于子弹上膛。
		}finally {
			a = 2;
			if(a == 2) {
				return a;//在方法还未正真实现返回的时候，如果又遇到return 关键字，相当于给抢又上了一次膛
			}
		}
		
		return a;
	}


}
