import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;

public class arraylistExample {
    private static JTextField box;
    private static JButton add;
    private static JTextArea example, output;
    private static ArrayList<Integer> examplear = new ArrayList();

    public static void main(String[] args) { start();}

    public static void start()
    {
        JFrame arrayListExample = new JFrame("ArrayList Example");
        arrayListExample.setSize(new Dimension(700, 600));
        arrayListExample.setMinimumSize(new Dimension(700, 600));
        arrayListExample.setLocationRelativeTo(null);
        arrayListExample.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel arraylistPan = new JPanel(new GridBagLayout());
        GridBagConstraints r = new GridBagConstraints();
        r.gridy = 0;
        r.gridx = 0;
        box = new JTextField("Enter an int here!", 15);
        box.addActionListener(new polyExample.ButtonListenerPoly());
        box.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                box.setText("");
            }
        });
        add = new JButton("Add!");
        example = new JTextArea(12, 30);
        setTextArea(example);
        String ALEXAMPLE = "\nArrayList<Integer> example = new ArrayList();" +
                "\n example.add(n);";
        example.setText(ALEXAMPLE);
        output = new JTextArea("ArrayList: ");
        add.addActionListener(new arraylistExample.ButtonListenerAdd());
        arraylistPan.add(box, r);
        r.gridx++;
        arraylistPan.add(add, r);
        r.gridx--;
        r.gridy++;
        arraylistPan.add(example, r);
        r.gridy++;
        arraylistPan.add(output, r);
        arrayListExample.getContentPane().add(arraylistPan);

        arrayListExample.pack();
        arrayListExample.setVisible(true);
    }
    private static void setTextArea(JTextArea x) {
        x.setEditable(false);
        x.setOpaque(false);
        x.setBackground(new Color(0, 0, 0, 0));
        x.setLineWrap(true);
        x.setWrapStyleWord(true);
    }
    private static class ButtonListenerAdd implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            int index0;
            String field0 = box.getText();
            index0 = Integer.parseInt(field0);

            polystart(index0);
        }
    }
    public static void polystart(int n)
    {
        examplear.add(n);
        output.setText("ArrayList: " + Arrays.toString(examplear.toArray()));
    }

}
