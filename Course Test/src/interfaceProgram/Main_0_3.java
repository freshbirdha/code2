package interfaceProgram;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Main_0_3 extends JFrame implements ActionListener {

		public Main_0_3(String string) {
			super(string);
		}
		
		public static void main(String[] args) {
			
			Main_0_3 frame = new Main_0_3("东京斑马编程教室");
			frame.setSize(400,200);
			
			
			JButton jButton = new JButton("click");
			jButton.setBounds(0, 0, 100, 50);
			jButton.addActionListener(frame);
		
			
			frame.getContentPane().setLayout(null);
			
			frame.getContentPane().add(jButton);
			
			frame.setVisible(true);
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			frame.addWindowFocusListener(new WindowFocusListener() {
				
				@Override
				public void windowLostFocus(WindowEvent e) {
					// TODO Auto-generated method stub
					System.out.println("失去焦点");
				}
				
				@Override
				public void windowGainedFocus(WindowEvent e) {
					// TODO Auto-generated method stub
					System.out.println("获得焦点");
				}
			});
			
		}
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("点击了");
			}
			
	
}
