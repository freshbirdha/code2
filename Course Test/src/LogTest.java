import org.apache.log4j.Logger;

public class LogTest {
	private static final Logger logger = Logger.getLogger(LogTest.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(3.14,5.13);

	}

	private static int add(int i, int j) {
		// TODO Auto-generated method stub
		logger.debug("��ʼ����add(i,j)���� x =" + i + ",j =" + j);
		int sum = i + j;
		logger.debug("����add(i,j)���� ����sum =" + sum);
		return sum;
		
	}
	
	private static double add(double i, double j) {
		// TODO Auto-generated method stub
		logger.info("��ʼ����add(double i,double j)���� x =" + i + ",j =" + j);;
		double sum = i + j;
		logger.info("����add(double i,double j)���� ����sum =" + sum);
		return sum;
		
	}

}
