package lession08;

import java.util.Arrays;

/**
 * 作业类型：代码填空
 * 作业内容：另行参考作业描述！
 * 
 * @author banma
 */
public class Main_0_2 {

	public static void main(String[] args) {
		//看以下代码并运行观察其结果，说出输出结果的原因

		A a = new A();																						
		System.out.println(a.i);																						
		System.out.println(a.j);																						
		System.out.println(a.s);																						
		System.out.println(a.c);																						
		//Arrays.toString方法用来将数组内容打印出来																						
		System.out.println(Arrays.toString(a.arr));		
	}

}

class A {																								
	public int i;																							
	public float j;																							
	public String s;																							
	public int[] arr;																							
	public char c;																								
}																								
