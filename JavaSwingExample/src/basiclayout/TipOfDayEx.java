package basiclayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;


public class TipOfDayEx extends JDialog {

    public TipOfDayEx() {

        initUI();
    }

    private void initUI() {

    	JPanel basePanel = new JPanel();
        basePanel.setLayout(new BoxLayout(basePanel, BoxLayout.Y_AXIS));
        add(basePanel);

        JPanel topPanel = new JPanel(new BorderLayout(0, 0));
        topPanel.setMaximumSize(new Dimension(450, 0));

        JLabel hint = new JLabel("Productivity Hints");
        hint.setBorder(BorderFactory.createEmptyBorder(0, 25, 0, 0));
        topPanel.add(hint);

        ImageIcon icon = new ImageIcon("src/resources/coffee2.png");
        JLabel label = new JLabel(icon);
        label.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        topPanel.add(label, BorderLayout.EAST);

        JSeparator separator = new JSeparator();
        separator.setForeground(Color.gray);

        topPanel.add(separator, BorderLayout.SOUTH);

        basePanel.add(topPanel);

        JPanel textPanel = new JPanel(new BorderLayout());
        textPanel.setBorder(BorderFactory.createEmptyBorder(15, 25, 15, 25));

        JTextPane pane = new JTextPane();
        pane.setContentType("text/html");
        String text = "<p><b>Closing windows using the mouse wheel</b></p>" +
                "<p>Clicking with the mouse wheel on an editor tab closes the window. " +
                "This method works also with dockable windows or Log window tabs.</p>";
        pane.setText(text);
        pane.setEditable(false);
        textPanel.add(pane);

        basePanel.add(textPanel);

        JPanel boxPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 0));

        JCheckBox box = new JCheckBox("Show Tips at startup");
        box.setMnemonic(KeyEvent.VK_S);

        boxPanel.add(box);
        basePanel.add(boxPanel);

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        JButton tipBtn = new JButton("Next Tip");
        tipBtn.setMnemonic(KeyEvent.VK_N);

        JButton closeBtn = new JButton("Close");
        closeBtn.setMnemonic(KeyEvent.VK_C);

        bottomPanel.add(tipBtn);
        bottomPanel.add(closeBtn);
        basePanel.add(bottomPanel);

        bottomPanel.setMaximumSize(new Dimension(450, 0));

        setTitle("Tip of the Day");
        setSize(new Dimension(450, 350));
        setResizable(false);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }


    public static void main(String[] args) {

    	TipOfDayEx ex = new TipOfDayEx();
        ex.setVisible(true);
     
    }
}
