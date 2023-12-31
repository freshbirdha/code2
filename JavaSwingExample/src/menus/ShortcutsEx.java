package menus;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class ShortcutsEx extends JFrame {

	public ShortcutsEx() {

		initUI();
	}

	private void initUI() {

		createMenuBar();

		setTitle("Mnemonics and accelerators");
		setSize(360, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void createMenuBar() {

		JMenuBar menuBar = new JMenuBar();

		ImageIcon iconNew = new ImageIcon("src/resources/new.png");
		ImageIcon iconOpen = new ImageIcon("src/resources/open.png");
		ImageIcon iconSave = new ImageIcon("src/resources/save.png");
		ImageIcon iconExit = new ImageIcon("src/resources/exit.png");

		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);

		JMenuItem newMenuItem = new JMenuItem(new MenuItemAction("New", iconNew, KeyEvent.VK_N));

		JMenuItem openMenuItem = new JMenuItem(new MenuItemAction("Open", iconOpen, KeyEvent.VK_O));

		JMenuItem saveMenuItem = new JMenuItem(new MenuItemAction("Save", iconSave, KeyEvent.VK_S));

		JMenuItem exitMenuItem = new JMenuItem("Exit", iconExit);
		exitMenuItem.setMnemonic(KeyEvent.VK_E);
		exitMenuItem.setToolTipText("Exit application");
		exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, InputEvent.CTRL_DOWN_MASK));

		exitMenuItem.addActionListener((event) -> System.exit(0));

		fileMenu.add(newMenuItem);
		fileMenu.add(openMenuItem);
		fileMenu.add(saveMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(exitMenuItem);

		menuBar.add(fileMenu);

		setJMenuBar(menuBar);
	}

	private class MenuItemAction extends AbstractAction {

		public MenuItemAction(String text, ImageIcon icon, Integer mnemonic) {
			super(text);

			putValue(SMALL_ICON, icon);
			putValue(MNEMONIC_KEY, mnemonic);
		}

		@Override
		public void actionPerformed(ActionEvent e) {

			System.out.println(e.getActionCommand());
		}
	}

	public static void main(String[] args) {

		ShortcutsEx ex = new ShortcutsEx();
		ex.setVisible(true);
	}
}
