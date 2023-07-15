import java.util.ArrayList;
import java.util.List;



public class JRE8Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.stream().filter(s -> s.isEmpty());
	}

}
