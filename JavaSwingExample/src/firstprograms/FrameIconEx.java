package firstprograms;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FrameIconEx extends JFrame {

	public FrameIconEx() {

		initUI();
	}

	private void initUI() {

		ImageIcon webIcon = new ImageIcon("src/resources/web.png");

		setIconImage(webIcon.getImage());

		setTitle("Icon");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		FrameIconEx ex = new FrameIconEx();
		ex.setVisible(true);
	}
}
