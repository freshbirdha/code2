
public class Test21 {
	 public static void main(String[] args) { 
		 int [][] arr = new int[5][5];
		 int xx = 2;
		 int yy = 4;
		 arr[xx][yy] = 1;
		
		 for(int x = 0; x < arr.length; x++) {
			 for(int y = 0; y < arr[x].length; y++) {
				 System.out.print(arr[x][y] + " ");
		
			 }
			 System.out.println();
		 }
		 		 		 			
	}

}
