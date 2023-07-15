package dragdrop;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;

import javax.swing.DefaultListModel;
import javax.swing.DropMode;
import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.TransferHandler;

public class ListDnD extends JFrame {

    private JTextField field;
    private DefaultListModel model;

    public ListDnD() {

        initUI();
    }

    private void initUI() {

    	JScrollPane scrollPane = new JScrollPane();
        scrollPane.setPreferredSize(new Dimension(180, 150));

        model = new DefaultListModel();
        JList myList = new JList(model);

        myList.setDropMode(DropMode.INSERT);
        myList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        myList.setTransferHandler(new ListHandler());

        field = new JTextField(15);
        field.setDragEnabled(true);

        scrollPane.getViewport().add(myList);

        createLayout(field, scrollPane);

        setTitle("ListDrop");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private class ListHandler extends TransferHandler {

        public boolean canImport(TransferSupport support) {

            if (!support.isDrop()) {
                return false;
            }

            return support.isDataFlavorSupported(DataFlavor.stringFlavor);
        }

        public boolean importData(TransferSupport support) {

            if (!canImport(support)) {
                return false;
            }

            Transferable transferable = support.getTransferable();
            String line;

            try {
                line = (String) transferable.getTransferData(DataFlavor.stringFlavor);
            } catch (Exception e) {
                return false;
            }

            JList.DropLocation dl = (JList.DropLocation) support.getDropLocation();
            int index = dl.getIndex();

            String[] data = line.split("[,\\s]");

            for (String item : data) {

                if (!item.isEmpty())
                    model.add(index++, item.trim());
            }

            return true;
        }
    }

    private void createLayout(JComponent... arg) {

        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);
        gl.setAutoCreateGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
                .addComponent(arg[1])
        );

        gl.setVerticalGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(arg[0])
                .addComponent(arg[1])
        );

        pack();
    }

    public static void main(String[] args) {
    	ListDnD ex = new ListDnD();
        ex.setVisible(true);
    }
}
