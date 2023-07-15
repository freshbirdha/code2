import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Numericalprocessing2 {
	 public static void main(String[] args) {
		
		
		BigDecimal bigDec = new BigDecimal("1.234");
		BigDecimal bigDec2 = new BigDecimal("2");
		
		System.out.println(bigDec.add(bigDec2));
		
		System.out.println(bigDec.subtract(bigDec2));
		
		System.out.println(bigDec.multiply(bigDec2));
		
		System.out.println(bigDec.divide(bigDec2));
		
		
		//取余
		System.out.println(bigDec.remainder(bigDec2));
		
		
		BigDecimal bdNum1 = new BigDecimal("12.234");
		
		BigDecimal result1 = bdNum1.setScale(2,BigDecimal.ROUND_CEILING);
		
		System.out.println(result1);
		
		BigDecimal plusBigDecimal = new BigDecimal("123456.12");
		BigDecimal minusBigDecimal = new BigDecimal("-123456.12");
		
		DecimalFormat df1 = new DecimalFormat("#,###.##");
		
		DecimalFormat df2 = new DecimalFormat("#,###.000");
		
		DecimalFormat df3 = new DecimalFormat("#,###.00;-#,###.00");
		
		DecimalFormat df4 = new DecimalFormat("#,##.00;#,###.00-");
		
		System.out.println(df1.format(plusBigDecimal));
		
		System.out.println(df2.format(plusBigDecimal));
		
		System.out.println(df3.format(plusBigDecimal));
		
		System.out.println(df4.format(plusBigDecimal));
		
		System.out.println(df4.format(minusBigDecimal));
		
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();//建立货币格式化引用；
		NumberFormat percentFormat = NumberFormat.getPercentInstance();
		percentFormat.setMaximumFractionDigits(3); //百分比小数点最多3位；
		
		BigDecimal loanAmountBigDecimal = new BigDecimal("15000.48");
		BigDecimal interestRateBigDecimal = new BigDecimal("0.008");
		BigDecimal interestBigDecimal  = loanAmountBigDecimal.multiply(interestRateBigDecimal);
		
		
		System.out.println("贷款金额:\t" + currencyFormat.format(loanAmountBigDecimal));
		
		System.out.println("利率:\t" + percentFormat.format(interestRateBigDecimal));
		
		System.out.println("利息:\t" + currencyFormat.format(interestBigDecimal));
		
		
		
			
	}


}


		
			
			
	