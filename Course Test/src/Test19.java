import java.util.Random;

public class Test19 {
	 public static void main(String[] args) {
		 Random r = new Random();
		 int [][] arr = new int[10][10];
		 for(int i = 0; i < arr.length; i++) {
			 for(int j = 0; j < arr[i].length; j++) {
				 arr[i][j] = r.nextInt(2);
			 }
		 }
		 
		 for(int i = 0; i < arr.length; i++) {
			 for(int j = 0; j < arr[i].length;j++) {
				 System.out.print(arr[i][j] + " ");
			 }
			 System.out.println();
		 }
		 		 			
	}

}
