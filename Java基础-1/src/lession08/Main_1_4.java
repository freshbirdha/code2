package lession08;
/**
 * 作业类型：代码纠错
 * 作业内容：另行参考作业描述！
 * 
 * @author banma
 */
public class Main_1_4 {

	public static void main(String[] args) {
		//看以下代码并运行观察其结果，思考代码执行顺序，说出结果和原因。
		F a = new F();	
		System.out.println(a.num);
	}

}

class E {																							
	public E() {																						
		System.out.println("E");																					
	}																						
}																							
																							
class G {																							
	public G() {																						
		System.out.println("G");																					
	}																						
}																							
																							
class F extends E{																							
	public G b = new G();																						
	int num = 10;																						
	public F() {																						
       num = 100;																							
		System.out.println("F");																					
	}																																												
}																							

