package lession08;
/**
 * 作业类型：代码填空
 * 作业内容：另行参考作业描述！
 * 
 * @author banma
 */
public class Main_0_0 {

	public static void main(String[] args) {
		//1.请观察17行以后的代码
		//2.请将小学生跟大学生 2个类的共有属性和方法 抽离出来存入到一个类中（例如学生类）
		//3.请将 小学生/大学生类继承第2步创建的学生类。
		//4. 请理解 1-3步 为什么要用继承思想来改造 小学生类跟大学生类，好处有什么？
	}

}


/**																				
 * 小学生																				
 * @author zouzhenxing																				
 *																				
 */																				
class SmallStudent {																				
	public String sex;																			
	public void study() {																			
		System.out.println("学习小学课本");																		
	}																			
	public String getSex() {																			
		return this.sex;																		
	}																			
}																				
																				
/**																				
 * 大学生类																				
 * @author zouzhenxing																				
 *																				
 */																				
class BigStudent {																				
	public String sex;																			
	public void study() {																			
		System.out.println("学习大学课本");																		
	}																			
	public String getSex() {																			
		return this.sex;																		
	}																			
}																				
