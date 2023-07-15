
public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperation mathOperation = (a,b) -> a+b;
		int sum = mathOperation.operation(1, 2);
		System.out.println(sum);

	}

}
interface MathOperation{
	int operation(int a,int b);
}