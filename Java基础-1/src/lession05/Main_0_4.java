package lession05;
/**
 * 作业类型：代码填空
 * 作业内容：另行参考作业描述！
 * 
 * @author banma
 */
public class Main_0_4 {

	public static void main(String[] args) {
		// 分析下面2个方法 理解 方法的重载
		
		// 然后在这里分别 对下面2个add 方法进行调用 并输出各自方法的结果
	}
	
	
	/**
	 *  该方法可以将传入的任意个数进行加法运算，并将结果返回
	 * @param arr int类型数组
	 * @return int类型的相加结果
	 */
	public static int add(int...arr) {
		int sum = 0;
		for(int i = 0;i < arr.length;i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	
	
	/**
	 *  该方法可以将传入的任意个数进行加法运算，并将结果返回
	 * @param arr double类型数组
	 * @return double类型的相加结果
	 */
	public static double add(double...arr) {
		double sum = 0;
		for(int i = 0;i < arr.length;i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

}
