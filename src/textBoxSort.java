import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class textBoxSort {
    public void start()
    {
        JFrame sortexample = new JFrame("Insertion Sort Example");
        sortexample.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        sortexample.setSize(new Dimension(600, 100));
        sortexample.setMinimumSize(new Dimension(600, 100));
        sortexample.setLocationRelativeTo(null);

        textBoxSortedPanel panel = new textBoxSortedPanel();
        sortexample.getContentPane().add(panel);

        sortexample.pack();
        sortexample.setVisible(true);
    }
}
class textBoxSortedPanel extends JPanel {

    private JTextField box0,box1,box2,box3,box4,box5;
    private JButton sort;
    private JLabel label;

    public textBoxSortedPanel() {

        box0 = new JTextField(5);
        box0.addActionListener(new ButtonListenerSort());
        box1 = new JTextField(5);
        box1.addActionListener(new ButtonListenerSort());
        box2 = new JTextField(5);
        box2.addActionListener(new ButtonListenerSort());
        box3 = new JTextField(5);
        box3.addActionListener(new ButtonListenerSort());
        box4 = new JTextField(5);
        box4.addActionListener(new ButtonListenerSort());
        box5 = new JTextField(5);
        box5.addActionListener(new ButtonListenerSort());


        sort = new JButton("Sort");
        label = new JLabel();
        sort.addActionListener(new ButtonListenerSort());
        add(box0);
        add(box1);
        add(box2);
        add(box3);
        add(box4);
        add(box5);
        add(sort);
        add(label);

        setPreferredSize(new Dimension(600, 100));

    }

    private class ButtonListenerSort implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            //INSERT SORT HERE
            int index0,index1,index2,index3,index4,index5;
            String field0 = box0.getText();
            String field1 = box1.getText();
            String field2 = box2.getText();
            String field3 = box3.getText();
            String field4 = box4.getText();
            String field5 = box5.getText();
            index0 = Integer.parseInt(field0);
            index1 = Integer.parseInt(field1);
            index2 = Integer.parseInt(field2);
            index3 = Integer.parseInt(field3);
            index4 = Integer.parseInt(field4);
            index5 = Integer.parseInt(field5);
            int[] array = {index0, index1, index2, index3, index4, index5};
            insertionSort(array);
            label.setText(Arrays.toString(array));

        }
    }
    public static void insertionSort(int[] A) {


        for (int i = 1; i < A.length; i++) {
            int min = A[i];
            int j = i - 1;

            while (j >= 0 && A[j] > min) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = min;
        }

    }
}
