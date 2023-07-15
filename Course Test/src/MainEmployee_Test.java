import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainEmployee_Test {

	public static void main(String[] args) {
		//���л�
		Employee e = new Employee();
		e.name = "Reyan Ali";
		e.address = "Phokka Kuan,Ambehta Peer";
		e.SSN = 11122333;
		e.number = 101;
		
		try {
			FileOutputStream fileOut = new FileOutputStream("employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in employee.ser ");
			
		} catch (IOException i) {
			// TODO: handle exception
			i.printStackTrace();
		}
		
		
		
	}

}



