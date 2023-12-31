package basiclayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;

public class BorderLayoutEx extends JFrame {

    public BorderLayoutEx() {

        initUI();
    }

    private void initUI() {

    	JPanel bottomPanel = new JPanel(new BorderLayout());
    	JPanel topPanel = new JPanel();

        topPanel.setBackground(Color.gray);
        topPanel.setPreferredSize(new Dimension(250, 150));
        bottomPanel.add(topPanel);

        bottomPanel.setBorder(new EmptyBorder(new Insets(20, 20, 20, 20)));

        add(bottomPanel);

        pack();

        setTitle("BorderLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

    	BorderLayoutEx ex = new BorderLayoutEx();
        ex.setVisible(true);
 
    }
}
