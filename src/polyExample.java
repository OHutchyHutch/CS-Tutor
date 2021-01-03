import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class polyExample {
    public static JTextField box, box1;
    private static JButton start;
    private static JTextArea example, outputan, outputdodg;

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        JFrame polyExample = new JFrame("Polymorphism Example");
        polyExample.setSize(new Dimension(700, 600));
        polyExample.setMinimumSize(new Dimension(700, 600));
        polyExample.setLocationRelativeTo(null);
        polyExample.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel polyPan = new JPanel(new GridBagLayout());
        GridBagConstraints r = new GridBagConstraints();
        r.gridy = 0;
        r.gridx = 0;
        box = new JTextField("Enter what animal says here!", 15);
        box.addActionListener(new polyExample.ButtonListenerPoly());
        box.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                box.setText("");
            }
        });
        box1 = new JTextField("Enter what dog says here!", 15);
        box1.addActionListener(new polyExample.ButtonListenerPoly());
        box1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                box1.setText("");
            }
        });
        start = new JButton("Go!");
        example = new JTextArea(12, 30);
        setTextArea(example);
        String POLYEXAMPLE = "\nclass Animal" +
                "\n{" +
                "\n    public void Sound()" +
                "\n     {" +
                "\n          System.out.println(\"The animal makes a sound\");" +
                "\n     }" +
                "\n}" +
                "\n\nclass Dog extends Animal" +
                "\n{" +
                "\n    public void Sound()" +
                "\n     {" +
                "\n          System.out.println(\"The dog barks!\");" +
                "\n     }" +
                "\n}" +
                "\n\npublic class Client" +
                "\n{" +
                "\n    public static void main(String[] args)" +
                "\n     {" +
                "\n         Animal animal = new Animal();" +
                "\n         Animal dog = new Dog();" +
                "\n" +
                "\n         animal.Sound();" +
                "\n         dog.Sound(); " +
                "\n     }" +
                "\n}";
        example.setText(POLYEXAMPLE);
        outputan = new JTextArea("Anim Output: ");
        outputdodg = new JTextArea("Dog Output:");
        start.addActionListener(new polyExample.ButtonListenerPoly());
        polyPan.add(box, r);
        r.gridx++;
        polyPan.add(box1,r);
        r.gridx++;
        polyPan.add(start, r);
        r.gridx--;
        r.gridy++;
        polyPan.add(example, r);
        r.gridy++;
        polyPan.add(outputan, r);
        r.gridy++;
        polyPan.add(outputdodg,r);
        polyExample.getContentPane().add(polyPan);

        polyExample.pack();
        polyExample.setVisible(true);
    }

    private static void setTextArea(JTextArea x) {
        x.setEditable(false);
        x.setOpaque(false);
        x.setBackground(new Color(0, 0, 0, 0));
        x.setLineWrap(true);
        x.setWrapStyleWord(true);
    }
    public static class ButtonListenerPoly implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String field0 = box.getText();
            String field1 = box1.getText();

            Animal animal = new Animal();
            Animal dog = new Dog();
            outputan.setText("Animal Output: " +  animal.Sound(field0));
            outputdodg.setText("Dog Output: " +  dog.Sound(field1));
        }
    }
}

class Animal extends polyExample
{
    public String Sound(String a)
    {
        return a;
    }
}
class Dog extends Animal
{
    public String Sound(String n)
    {
        return n;
    }
}
