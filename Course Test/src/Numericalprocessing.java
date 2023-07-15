import java.math.BigDecimal;
import java.math.BigInteger;

public class Numericalprocessing {
	 public static void main(String[] args) {
		 //Math类
		double a = 1.6;
		
		System.out.println(Math.abs(a));
		
		System.out.println(Math.ceil(a));
		
		System.out.println(Math.floor(a)); //表示四舍五入，算法为Math.fllor(x+0.5)
		
		System.out.println(Math.PI);
		
		BigInteger bigInt = new BigInteger("123456789012345678901234567890");
		BigDecimal bigDec = new BigDecimal("1.0e500");
		
		System.out.println(bigInt);
		System.out.println(bigDec);
		
		BigInteger bigInt2 = BigInteger.valueOf(1234567890123456789L);
		BigDecimal bigDec2 = BigDecimal.valueOf(1.234567890123456789);
		
		System.out.println(bigInt2);
		System.out.println(bigDec2);
		
		
		
		
			
	}


}


		
			
			
	