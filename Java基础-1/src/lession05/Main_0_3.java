package lession05;
/**
 * 作业类型：代码填空
 * 作业内容：另行参考作业描述！
 * 
 * @author banma
 */
public class Main_0_3 {

	public static void main(String[] args) {
		//请在这里尝试调用下面的 add方法,记得带上参数
		
		//在这里请将调用add方法的结果给打印出来进行查看！
	}
	
	/**
	 *  该方法可以将传入的任意个数进行加法运算，并将结果返回
	 * @param arr int类型数组
	 * @return 相加结果
	 */
	public static int add(int...arr) {
		int sum = 0;
		for(int i = 0;i < arr.length;i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

}
