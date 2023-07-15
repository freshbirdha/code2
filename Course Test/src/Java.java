public class Java {
	
	public static void main(String[] args) {
		System.out.println("ÄãºÃ");
		System.out.println(3+1);
		System.out.println(10%3);
		System.out.println(5*2/(10%3));
		System.out.println(10/5);
		System.out.println(0/10);
		System.out.println(3>4);
		System.out.println(3!=4);
		System.out.println(!(3<4));
		System.out.println(5>4 ? 5:4); //condition ? x1:x2;
		System.out.println(5<4 ? 5:4);
		System.out.println(((1+1)+3)+6);
		int result1 = 1+1;
		int result2 = result1 + 3;
		int result3 = result2 + 6;
		System.out.println(result3);
		
		double sum = 1+1;
		System.out.println(sum);
		
		double add;
		add = 1 + 1;
		System.out.println(add);
		
		byte b = 127;
		short s = 32767;
		int i = 321474836;
		long l = 31415926535l;
		float f = 3.14f;
		char c = 'A';
		boolean bl = false;
		String str = "aaaaaaa";
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f); 
		System.out.println(c);
		System.out.println(bl);
		System.out.println(str);
		
		// transfer
		
		byte bb = (byte)127.0;
		short ss = (short)11.1;
		int ii = (int)314.0;
		long ll = (long)39293200.1d;
		float ff = (float)3.14d;
		boolean bll = false;
		char cc = (char)66;
		
		System.out.println(bb);
		System.out.println(ss);
		System.out.println(ii);
		System.out.println(ll);
		System.out.println(ff); 
		System.out.println(bll);
		System.out.println(cc);
		
		boolean flag = false;
		
		System.out.println(!flag);
		
		String a = "hello";
		String d = "banma";
		System.out.println(a + d);
		
		int[] arr = {1,2,3,4};
		System.out.println(arr[0]);
		
		
		int[] brr = new int[6];
		
		brr[1] = 10;
		brr[5] = 20;
		
		
		System.out.println(brr[0]);
		System.out.println(brr[1]);
		System.out.println(brr[5]);
		
		double[] crr = new double[6];
		
		System.out.println(crr[0]);
		
		int e = crr.length;
		
		System.out.println(e);
		
		
	}

}
