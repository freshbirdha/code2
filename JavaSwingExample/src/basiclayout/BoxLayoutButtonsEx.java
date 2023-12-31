package basiclayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;

public class BoxLayoutButtonsEx extends JFrame {

    public BoxLayoutButtonsEx() {

        initUI();
    }

    private void initUI() {

    	JPanel basePanel = new JPanel();
        basePanel.setLayout(new BoxLayout(basePanel, BoxLayout.Y_AXIS));
        add(basePanel);

        basePanel.add(Box.createVerticalGlue());

        JPanel bottomPanel = new JPanel();
        bottomPanel.setAlignmentX(1f);
        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.X_AXIS));

        JButton okBtn = new JButton("OK");
        JButton closeBtn = new JButton("Close");

        bottomPanel.add(okBtn);
        bottomPanel.add(Box.createRigidArea(new Dimension(5, 0)));
        bottomPanel.add(closeBtn);
        bottomPanel.add(Box.createRigidArea(new Dimension(15, 0)));

        basePanel.add(bottomPanel);
        basePanel.add(Box.createRigidArea(new Dimension(0, 15)));

        setTitle("Two Buttons");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

		BoxLayoutButtonsEx ex = new BoxLayoutButtonsEx();
        ex.setVisible(true);
   
    }
}
