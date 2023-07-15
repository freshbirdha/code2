import java.util.Random;

public class Test24 {
	 public static void main(String[] args) { 
		 Random r = new Random();
		 int [][] arr = new int[5][5];
		 int count = 0;
		 while(count < 3) {
			 int xx = r.nextInt(5);  // ·¶Î§0-4
			 int yy = r.nextInt(5); // 0-4
			 if(arr[xx][yy] == 0) {
				 arr[xx][yy] = 1;
				 count++;
				 
			 }						 
		 }
			 		
		 for(int x = 0; x < arr.length; x++) {
			 for(int y = 0; y < arr[x].length; y++) {
				 System.out.print(arr[x][y] + " ");
		
			 }
			 System.out.println();
		 }
		 		 		 			
	}

}
