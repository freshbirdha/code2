/**
 * 
 * @author USER
 *
 */

public class Test35 {
	
	 public static void main(String[] args) {   
		int[] a = {1,2,3};
		banma(a);     //传入的是数组的地址,其他数据类型传入的话不会改变参数，只是复制
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a);         // 打印的是数组的地址
				 		 		 			
	} //main end;
	 
	 public static void banma(int[] arr) {   
		arr[0] = 4;
		arr[1] = 5;
		arr[2] = 6;
		
		
		
	 }
	 
}//class end
	 
	


