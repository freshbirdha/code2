package interfaceProgram;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class Main_0_2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("���������̽���");
		frame.setSize(400,250);
		frame.setVisible(true);
		
		JPanel jPanel = new JPanel();
	
		JLabel jLabel = new JLabel("��Һ�");
	//	frame.add(jLabel);
		frame.getContentPane().add(jLabel);  //�൱��HTML��body�����
	}
}
