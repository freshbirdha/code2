import org.apache.log4j.Logger;

public class LogTest {
	private static final Logger logger = Logger.getLogger(LogTest.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(3.14,5.13);

	}

	private static int add(int i, int j) {
		// TODO Auto-generated method stub
		logger.debug("开始运行add(i,j)方法 x =" + i + ",j =" + j);
		int sum = i + j;
		logger.debug("结束add(i,j)方法 返回sum =" + sum);
		return sum;
		
	}
	
	private static double add(double i, double j) {
		// TODO Auto-generated method stub
		logger.info("开始运行add(double i,double j)方法 x =" + i + ",j =" + j);;
		double sum = i + j;
		logger.info("结束add(double i,double j)方法 返回sum =" + sum);
		return sum;
		
	}

}
