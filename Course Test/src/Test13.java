import java.util.Random;

public class Test13 {
	 public static void main(String[] args) {
		 Random r = new Random();
		 int sum = 0;
		 int count = 0;
		 while(true) {
			 count++;
			 int a = r.nextInt();
			 if(a % 2 == 0) {
				 sum++;
			 }else {
				 continue;
			 }
			 if(sum > 200) {
				 break;
			 }
		 }
		 System.out.println("count:"+ count +",sum:" + sum);
		 		 			
	}

}
