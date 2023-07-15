import java.util.Random;

public class Test23 {
	 public static void main(String[] args) { 
		 Random r = new Random();
		 int [][] arr = new int[5][5];
		 int xx = r.nextInt(5);  // ·¶Î§0-4
		 int yy = r.nextInt(5); // 0-4
		 arr[xx][yy] = 1;
		 
		
		  xx = r.nextInt(5);  // ·¶Î§0-4
		  yy = r.nextInt(5); // 0-4
		 arr[xx][yy] = 1;
		 
	
		  xx = r.nextInt(5);  // ·¶Î§0-4
		  yy = r.nextInt(5); // 0-4
		 arr[xx][yy] = 1;
		
		 for(int x = 0; x < arr.length; x++) {
			 for(int y = 0; y < arr[x].length; y++) {
				 System.out.print(arr[x][y] + " ");
		
			 }
			 System.out.println();
		 }
		 		 		 			
	}

}
