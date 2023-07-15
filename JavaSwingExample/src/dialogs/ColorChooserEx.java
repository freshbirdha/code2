package dialogs;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import java.awt.Color;
import java.awt.Container;

import static javax.swing.GroupLayout.DEFAULT_SIZE;

public class ColorChooserEx extends JFrame {

    private JPanel colourPanel;

    public ColorChooserEx() {

        initUI();
    }

    private void initUI() {

        colourPanel = new JPanel();
        colourPanel.setBackground(Color.WHITE);

        JToolBar  toolbar = createToolBar();

        createLayout(toolbar, colourPanel);

        setTitle("JColorChooser");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private JToolBar createToolBar() {

    	ImageIcon openIcon = new ImageIcon("src/resources/colourdlg.png");

    	JToolBar toolbar = new JToolBar();
    	JButton openBtn = new JButton(openIcon);

        openBtn.addActionListener(e -> {

            Color color = JColorChooser.showDialog(colourPanel,
                    "Choose colour", Color.white);
            colourPanel.setBackground(color);
        });

        toolbar.add(openBtn);

        return toolbar;
    }

    private void createLayout(JComponent... arg) {

        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setHorizontalGroup(gl.createParallelGroup()
                .addComponent(arg[0], DEFAULT_SIZE, DEFAULT_SIZE,
                        Short.MAX_VALUE)
                .addGroup(gl.createSequentialGroup()
                        .addGap(30)
                        .addComponent(arg[1])
                        .addGap(30))
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
                .addGap(30)
                .addComponent(arg[1])
                .addGap(30)
        );

        pack();
    }

    public static void main(String[] args) {

    	ColorChooserEx ex = new ColorChooserEx();
        ex.setVisible(true);
        
    }
}
