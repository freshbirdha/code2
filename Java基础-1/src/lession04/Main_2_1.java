package lession04;
/**
 * 作业类型：代码优化
 * 作业内容：另行参考作业描述！
 * 
 * @author banma
 */
public class Main_2_1 {

	public static void main(String[] args) {
		boolean f = true;
		if(f == false) {// if括号中的条件可以优化，你是否能看出来？
			System.out.println("不满足条件");
		}else {
			System.out.println("满足条件");
		}
	}

}
