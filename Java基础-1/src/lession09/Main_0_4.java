package lession09;
/**
 * 作业类型：代码填空
 * 作业内容：另行参考作业描述！
 * 
 * @author banma
 */
public class Main_0_4 {
	
	public static void main(String[] args) {
		//下面 利用匿名内部类的方法实例化 本次lession09包中 Main_0_1 类中定义的IUSB接口
		//请实现open方法/close方法的内容（随意输出即可）
		//然后执行本程序，观察结果即可
		new IUSB() {

			@Override
			public void open() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void close() {
				// TODO Auto-generated method stub
				
			}
			
		}.close();
			
	}

}

