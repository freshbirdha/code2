package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "#denglu:[banma001,123456789]";
		
			if(line.startsWith("#denglu:")) {
				String username = line.substring(line.indexOf("[") + 1,line.indexOf("]"));
			    System.out.println(username);
			}
		

	}

}
