package menus;

import java.awt.EventQueue;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class RightMenuEx extends JFrame {

	public RightMenuEx() {

		initUI();
	}

	private void initUI() {

		createMenuBar();

		setTitle("Right menu");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void createMenuBar() {

		JMenuBar menuBar = new JMenuBar();

		JMenu fileMenu = new JMenu("File");
		JMenu viewMenu = new JMenu("View");
		JMenu toolsMenu = new JMenu("Tools");
		JMenu helpMenu = new JMenu("Help");

		menuBar.add(fileMenu);
		menuBar.add(viewMenu);
		menuBar.add(toolsMenu);
		menuBar.add(Box.createHorizontalGlue());
		menuBar.add(helpMenu);

		setJMenuBar(menuBar);
	}

	public static void main(String[] args) {

		RightMenuEx ex = new RightMenuEx();
		ex.setVisible(true);
	}
}
