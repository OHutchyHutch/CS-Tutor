import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class recExample extends JPanel {
    private static JTextField box;
    private static JButton start;
    private static JTextArea example, output;


    public static void main(String[] args)
    {
        start();
    }
    public static void start()
    {
        JFrame recursiveexample = new JFrame("Recursive Example");
        recursiveexample.setSize(new Dimension(600, 500));
        recursiveexample.setMinimumSize(new Dimension(600, 500));
        recursiveexample.setLocationRelativeTo(null);
        recursiveexample.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel recPan = new JPanel(new GridBagLayout());
        GridBagConstraints r = new GridBagConstraints();
        r.gridy=0;
        r.gridx=0;
        box = new JTextField("Enter an int here!", 10);
        box.addActionListener(new ButtonListenerRec());
        box.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                box.setText("");
            }
        });
        start = new JButton("Go!");
        example = new JTextArea(12,30);
        setTextArea(example);
        String RECEXAMPLE = "What will be ran when you enter everything: \n" +
                "public static String recgo(int n)\n" +
                "    {\n" +
                "        if (n==0)\n" +
                "        {\n" +
                "            return \" We are now at zero!\";\n" +
                "        } else\n" +
                "        {\n" +
                "            return n + \",\" + recgo(n-1);\n" +
                "        }\n" +
                "    }";
        example.setText(RECEXAMPLE);
        output = new JTextArea("Output: ");
        start.addActionListener(new recExample.ButtonListenerRec());
        recPan.add(box,r);
        r.gridx++;
        recPan.add(start,r);
        r.gridx--;
        r.gridy++;
        recPan.add(example,r );
        r.gridy++;
        recPan.add(output, r);
        recursiveexample.getContentPane().add(recPan);

        recursiveexample.pack();
        recursiveexample.setVisible(true);
    }
    private static class ButtonListenerRec implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            int index0;
            String field0 = box.getText();
            index0 = Integer.parseInt(field0);

            recstart(index0);
        }
    }
    public static void recstart(int n)
    {
        output.setText("Output: " + recgo(n));
    }
    public static String recgo(int n)
    {
        if (n==0)
        {
            return " We are now at zero!";
        } else
        {
            return  + n + "," + recgo(n-1);
        }
    }
    private static void setTextArea(JTextArea x) {
        x.setEditable(false);
        x.setOpaque(false);
        x.setBackground(new Color(0, 0, 0, 0));
        x.setLineWrap(true);
        x.setWrapStyleWord(true);
    }

}