import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;


public class MainEmployee_Test2 {

	public static void main(String[] args) {
		//∑¥–Ú¡–ªØ
		Employee e = null;
	
		
		try {
			FileInputStream fileIn = new FileInputStream("employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (Employee) in.readObject();
			
			in.close();
			fileIn.close();
		
			
		} catch (IOException i) {
			// TODO: handle exception
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			System.out.println("Employee class not found");
			e1.printStackTrace();
			return;
		}
		
		System.out.println("Deseriazed Employee...");
		System.out.println("Name:" + e.name);
		System.out.println("Adress:" + e.address);
		System.out.println("SSN:" + e.SSN);
		System.out.println("Number:" + e.number);
		
	}

}
