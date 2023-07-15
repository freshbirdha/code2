
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.EventQueue;

public class AbsoluteLayoutEx extends JFrame {

    public AbsoluteLayoutEx() {

        initUI();
    }

    private void initUI() {

        setLayout(null);

        JButton okBtn = new JButton("OK");
        okBtn.setBounds(50, 50, 80, 25);

        JButton closeBtn = new JButton("Close");
        closeBtn.setBounds(150, 50, 80, 25);

        add(okBtn);
        add(closeBtn);

        setTitle("Absolute positioning");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

		AbsoluteLayoutEx ex = new AbsoluteLayoutEx();
        ex.setVisible(true);
 
    }
}
