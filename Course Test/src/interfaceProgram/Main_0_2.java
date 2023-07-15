package interfaceProgram;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class Main_0_2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("东京斑马编程教室");
		frame.setSize(400,250);
		frame.setVisible(true);
		
		JPanel jPanel = new JPanel();
	
		JLabel jLabel = new JLabel("大家好");
	//	frame.add(jLabel);
		frame.getContentPane().add(jLabel);  //相当于HTML的body里添加
	}
}
