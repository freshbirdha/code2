package test;

public class Test00 {

	public static void main(String[] args) {
		//
		String line = "#denglu:[banma001,123456789]";
		
		if(line.startsWith("#denglu:")) {
			//ÓÃ»§µÇÂ½²Ù×÷
			String usernameString = line.substring(line.indexOf("[") + 1,line.indexOf("]"));
			System.out.println(usernameString);
			
		}

	}

}
