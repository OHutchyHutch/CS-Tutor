import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class CSTutorMain extends JFrame implements ItemListener {

    final static String IFTHEN = "If Statements";
    final static String WHILE = "While Loops";
    final static String FORLOOPS = "For Loops";
    final static String SCANNER = "Inputs & Scanners";
    final static String CLANDOBJ = "Classes & Objects";
    final static String ARRAYS = "Arrays";
    final static String INHERITANCE = "Inheritance";
    final static String POLYMORPHISM = "Polymorphism";
    final static String SORTING = "Search & Sorts";
    final static String RECURSION = "Recursion";
    final static String BOPERATORS = "Basic Operators";
    private JButton sortex, recex, polyex, alex;
    ArrayList<JTextArea> texts = new ArrayList<>();
    JPanel codecards;
    JPanel desccards;

    public static void main(String[] args) {
        //Create a frame and run it with SwingUtilities
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CSTutorMain().setVisible(true);
            }
        });
    }

    private CSTutorMain() {
        popGUI();
        //Set a default close action
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Setting frame size
        setSize(new Dimension(1200, 800));
        setMinimumSize(new Dimension(1050, 800));
        //Set start position
        setLocationRelativeTo(null);
        //Set a title for frame
        setTitle("CS Tutor");
        //Disable resize
        setResizable(true);
    }

    private void popGUI() {
        //Creating a panel
        JPanel panel = new JPanel();
        //Add a buffer between edges
        panel.setBorder(new EmptyBorder(10, 25, 25, 25));
        //Set panel layout
        panel.setLayout(new BorderLayout());
        //Change panel color
        //panel.setBackground(Color.black);
        //Add panel to frame
        getContentPane().add(panel);

        //West
        JPanel panelWest = new JPanel(new GridBagLayout());
        panel.add(panelWest, BorderLayout.WEST);
        //Create a grid to organize structure
        GridBagConstraints w = new GridBagConstraints();
        w.gridx = 0;
        w.gridy = 4;
        //Create a dropdown menu
        panelWest.add(new JLabel("Please select a topic", JLabel.CENTER), w);
        w.gridy++;
        String comboBoxItems[] = {IFTHEN, WHILE, FORLOOPS, SCANNER, CLANDOBJ, ARRAYS, INHERITANCE, POLYMORPHISM, SORTING, RECURSION, BOPERATORS};
        JComboBox cb = new JComboBox(comboBoxItems);
        cb.setEditable(false);
        cb.addItemListener(this);
        panelWest.add(cb, w);
        //

        //North
        JPanel panelNorth = new JPanel(new GridBagLayout());
        panel.add(panelNorth, BorderLayout.NORTH);
        //Create a grid to organize structure
        GridBagConstraints n = new GridBagConstraints();
        n.gridx = 0;
        n.gridy = 0;
        panelNorth.add(new JLabel("Welcome to CS Tutor!", JLabel.CENTER), n);
        n.gridy++;
        panelNorth.add(new JLabel("Made by: Owen Hutchins", JLabel.CENTER), n);
        n.gridy++;
        panelNorth.add(new JLabel("~Computer Science Undergraduate at Georgia State University~", JLabel.CENTER), n);
        n.gridy++;
        n.gridy++;
        panelNorth.add(new JLabel("\n", JLabel.CENTER), n);

        //

        //South
        //JPanel panelSouth = new JPanel();
        //panel.add(panelSouth, BorderLayout.SOUTH);
        //Adds buttons to the panel
        //panelSouth.add(new JButton("Previous Page"));
        //panelSouth.add(new JButton("Next Page"));
        //

        //Center
        JPanel panelCenter = new JPanel();
        panel.add(panelCenter, BorderLayout.CENTER);
        //

        //East
        JPanel panelEast = new JPanel();
        panel.add(panelEast, BorderLayout.EAST);

        //Add cards into panel
        addCardsToCenterPane(panelCenter);
        addCardsToEastPane(panelEast);

    }

    private void addCardsToCenterPane(Container pane) {
        //IFTHEN Statements
        JPanel cardif = new JPanel(new GridBagLayout());
        GridBagConstraints i = new GridBagConstraints();
        i.gridx = 0;
        i.gridy = 0;
        cardif.add(new JLabel("IFTHEN STATEMENTS", SwingConstants.CENTER), i);
        i.gridy++;
        JTextArea codeif = (new JTextArea(50, 35));
        setTextArea(codeif);
        String IFTHENCODE = " If Statement: \n" +
                "     If(x == 1)" +
                "\n       { System.out.println(\'X equals 1!\'); }" +
                "\n \n \n \n" +
                "If Else Statement: \n" +
                "     If(x == 1)" +
                "\n       { System.out.println(\'X equals 1!\'); }" +
                "\n   else" +
                "\n       { System.out.println(\'X does not equal 1!\'); }" +
                "\n   System.out.println(\'I run no matter what!\');" +
                "\n \n \n \n" +
                "If Else If Statement: \n" +
                "     If(x == 1)" +
                "\n       { system.out.println(\'X equals 1!\'); }" +
                "\n   else if(x == 2)" +
                "\n       { system.out.println(\'X equals 2!\'); }" +
                "\n   else" +
                "\n       { System.out.println(\'X does not equal 1!\'); }" +
                "\n   System.out.println(\'I run no matter what!\');" +
                "\n \n \n \n" +
                "If Else If with Multiple Conditions: \n" +
                "     If(x == 1 || x == 2)" +
                "\n      { System.out.println(\'X equals 1 or 2!\'); }" +
                "\n   else if(x == 1 && y == 2 )" +
                "\n       { System.out.println(\'X equals 1 and y equals 2!\'); }" +
                "\n   else" +
                "\n       { System.out.println(\'None of the conditions are met!\'); }" +
                "\n   System.out.println(\'I run no matter what!\');" +
                "\n \n \n \n";
        codeif.setText(IFTHENCODE);
        texts.add(codeif);
        cardif.add(codeif, i);

        //WHILE Loops
        JPanel cardwhile = new JPanel(new GridBagLayout());
        i.gridy--;
        cardwhile.add(new JLabel("WHILE LOOPS", SwingConstants.CENTER), i);
        i.gridy++;
        JTextArea codewhile = (new JTextArea(50, 35));
        String WHILECODE = "While Loops: \n" +
                "          int x = 1" +
                "\n         while(x < 3)" +
                "\n           {" +
                "\n            System.out.println(\'x = \' + x);" +
                "\n            x++;" +
                "\n           }" +
                "\n            System.out.println(\'We are done with the while loop!\');" +
                "\n\n\n\nDoWhile Loops:" +
                "\n        do" +
                "\n           {" +
                "\n            System.out.println(\'x = \' + x);" +
                "\n            x++;" +
                "\n           }" +
                "\n        while(x < 3);";
        setTextArea(codewhile);
        codewhile.setText(WHILECODE);
        cardwhile.add(codewhile, i);
        texts.add(codewhile);

        //FOR LOOPS Statements
        JPanel cardfor = new JPanel(new GridBagLayout());
        i.gridy--;
        cardfor.add(new JLabel("FOR LOOPS", SwingConstants.CENTER), i);
        i.gridy++;
        JTextArea codefor = (new JTextArea(50, 30));
        String FORLOOPSCODE = "\n\n\n\n\n\n\n\n\n\n\n\nfor(int i = 0; i <= 10; i++)" +
                "\n   { System.out.println(\'Hello\'); }";
        setTextArea(codefor);
        codefor.setText(FORLOOPSCODE);
        cardfor.add(codefor, i);
        texts.add(codefor);

        //Scanners
        JPanel cardscanner = new JPanel(new GridBagLayout());
        i.gridy--;
        cardscanner.add(new JLabel("INPUTS & SCANNERS", SwingConstants.CENTER), i);
        i.gridy++;
        JTextArea codescanner = (new JTextArea(50, 30));
        String SCANNERCODE = "import java.util.Scanner;" +
                "\n\n      Scanner input = new Scanner(System.in);" +
                "\n\n\n\n      Scanner output = new Scanner(System.out);" +
                "\n\n\n\n      Scanner error = new Scanner(System.err);";
        setTextArea(codescanner);
        codescanner.setText(SCANNERCODE);
        cardscanner.add(codescanner, i);
        texts.add(codescanner);

        //Classes and objects
        JPanel cardclandobj = new JPanel(new GridBagLayout());
        i.gridy--;
        cardclandobj.add(new JLabel("CLASSES & OBJECTS", SwingConstants.CENTER), i);
        i.gridy++;
        JTextArea codeclandobj = (new JTextArea(50, 30));
        String CLANDOBJCODE = "public class CSTutor" +
                "\n{" +
                "\n      public static void Print()" +
                "\n         {" +
                "\n               System.out.println(\'Hello, world!\');" +
                "\n         }" +
                "\n}" +
                "\n\n\n\npublic class Client" +
                "\n{" +
                "\n      public static void main(String[] args)" +
                "\n         {" +
                "\n                 CSTutor example = new CSTutor;" +
                "\n                 example.Print();" +
                "\n         }" +
                "\n}";
        setTextArea(codeclandobj);
        codeclandobj.setText(CLANDOBJCODE);
        cardclandobj.add(codeclandobj, i);
        texts.add(codeclandobj);

        //Arrays
        JPanel cardarrays = new JPanel(new GridBagLayout());
        i.gridy--;
        cardarrays.add(new JLabel("ARRAYS", SwingConstants.CENTER), i);
        i.gridy++;
        JTextArea codearrays = (new JTextArea(50, 30));
        String ARRAYSCODE = "public class Example" +
                "\n{" +
                "\n     int[] example = {1,2,3,4};" +
                "\n      //or" +
                "\n     int example[] = {1,2,3,4};" +
                "\n\n\n   ArrayList<Integer> example = new ArrayList();" +
                "\n     example.add(1);" +
                "\n     example.add(2);" +
                "\n}";
        alex = new JButton("Example");
        alex.addActionListener(new CSTutorMain.ButtonListenerArraysList());
        setTextArea(codearrays);
        codearrays.setText(ARRAYSCODE);
        cardarrays.add(codearrays, i);
        texts.add(codearrays);
        cardarrays.add(alex);

        //Inheritance
        JPanel cardinh = new JPanel(new GridBagLayout());
        i.gridy--;
        cardinh.add(new JLabel("INHERITANCE", SwingConstants.CENTER), i);
        i.gridy++;
        JTextArea codeinheritance = (new JTextArea(50, 30));
        String INHERCODE = "public class Hello" +
                "\n{" +
                "\n     public static void Print()" +
                "\n         {" +
                "\n             System.out.print(\'Hello, world!\');" +
                "\n         }" +
                "\n}" +
                "\n\npublic class World extends Hello" +
                "\n{" +
                "\n     public static void main(String[] args)" +
                "\n         {" +
                "\n             Print();" +
                "\n         }" +
                "\n}";
        setTextArea(codeinheritance);
        codeinheritance.setText(INHERCODE);
        cardinh.add(codeinheritance, i);
        texts.add(codeinheritance);

        //Polymorphism
        JPanel cardpoly = new JPanel(new GridBagLayout());
        i.gridy--;
        cardpoly.add(new JLabel("POLYMORPHISM", SwingConstants.CENTER), i);
        i.gridy++;
        JTextArea codepoly = (new JTextArea(50, 30));
        String POLYCODE = "\nclass Animal" +
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
        polyex = new JButton("Example");
        polyex.addActionListener(new CSTutorMain.ButtonListenerPoly());
        setTextArea(codepoly);
        codepoly.setText(POLYCODE);
        cardpoly.add(codepoly, i);
        texts.add(codepoly);
        cardpoly.add(polyex);

        //InsertionSort
        JPanel cardinsort = new JPanel(new GridBagLayout());
        i.gridy--;
        cardinsort.add(new JLabel("INSERTION SORTING", SwingConstants.CENTER), i);
        i.gridy++;
        JTextArea codeins = (new JTextArea(50, 30));
        String INSCODE = "\npublic void insertionsort(int arr[])" +
                "\n{" +
                "\n     for (int i = 1; i < arr.length; ++i)" +
                "\n         {" +
                "\n             int temp = arr[i];" +
                "\n             int j = i - 1;" +
                "\n\n         while (j >= 0 && arr[j] > temp)" +
                "\n             {" +
                "\n                arr[j + 1] = arr[j];" +
                "\n                j = j - 1;" +
                "\n             }" +
                "\n         arr[j + 1] = temp;" +
                "\n         }" +
                "\n}";
        sortex = new JButton("Example");
        sortex.addActionListener(new CSTutorMain.ButtonListenerSort());
        setTextArea(codeins);
        codeins.setText(INSCODE);
        cardinsort.add(codeins,i);
        cardinsort.add(sortex);

        //Recursion
        JPanel cardrecu = new JPanel(new GridBagLayout());
        i.gridy--;
        cardrecu.add(new JLabel("RECURSION", SwingConstants.CENTER), i);
        i.gridy++;
        JTextArea coderecu = (new JTextArea(50, 30));
        String RECUCODE = "public class Recursion " +
                "\n{" +
                "\n     public static void main(String[] args)" +
                "\n         {" +
                "\n             System.out.print(recursive(5));" +
                "\n         }" +
                "\n     public static String recursive(int n)" +
                "\n         {" +
                "\n             if(n==0)" +
                "\n                 {" +
                "\n                     return \"\"+n;" +
                "\n                 }" +
                "\n             else" +
                "\n                 {" +
                "\n                     return n + \" , \" + recursive(n-1);" +
                "\n                 }" +
                "\n         }" +
                "\n}";
        recex = new JButton("Example");
        recex.addActionListener(new CSTutorMain.ButtonListenerRec());
        setTextArea(coderecu);
        coderecu.setText(RECUCODE);
        cardrecu.add(coderecu, i);
        texts.add(coderecu);
        cardrecu.add(recex);


        //Basic Operators
        JPanel cardboper = new JPanel(new GridBagLayout());
        i.gridy--;
        cardboper.add(new JLabel("BASIC OPERATORS", SwingConstants.CENTER), i);
        i.gridy++;
        JTextArea codeboper = (new JTextArea(50, 30));
        String BOPERCODE = "\n\nx++;" +
                "\nx--;" +
                "\n\n\n\n\n\n\nx+=3;" +
                "\nx-=3;" +
                "\nx*=3;";
        setTextArea(codeboper);
        codeboper.setText(BOPERCODE);
        cardboper.add(codeboper, i);
        texts.add(codeboper);

        //Create the panel that contains the "cards".
        codecards = new JPanel(new CardLayout());
        codecards.add(cardif, IFTHEN);
        codecards.add(cardwhile, WHILE);
        codecards.add(cardfor, FORLOOPS);
        codecards.add(cardscanner, SCANNER);
        codecards.add(cardclandobj, CLANDOBJ);
        codecards.add(cardarrays, ARRAYS);
        codecards.add(cardinh, INHERITANCE);
        codecards.add(cardpoly, POLYMORPHISM);
        codecards.add(cardinsort, SORTING);
        codecards.add(cardrecu, RECURSION);
        codecards.add(cardboper, BOPERATORS);


        pane.add(codecards, BorderLayout.CENTER);
    }

    public void addCardsToEastPane(Container pane) {
        //IFTHEN Statements
        //Rows are Y value and columns are X value
        JTextArea cardif1 = new JTextArea(50, 30);
        setTextArea(cardif1);
        String IFTHENEX = "\nAn if then statement checks a given condition and then runs the code in the brackets once if it passes the condition. If the condition is not met, the if statement is skipped." +
                "\n\n\n\n It is possible to have code run if the condition is not met. To do so, just use an else statement right after the if one. You do not need an else statement, code outside of an if statement will still be ran." +
                "\n\n\n\n\n\n\n You can also have multiple if statements attached using an else if statement" +
                "\n\n\n\n\n\n\n\n\n\n\n You can also have multiple conditions. Where && means \'and\' and || means \'or\'";
        cardif1.setText(IFTHENEX);
        texts.add(cardif1);

        //WHILE Loops
        JTextArea cardwhile1 = new JTextArea(50, 30);
        setTextArea(cardwhile1);
        String WHILEEX = "\nA while loop will continuously run as long as the parameters are met. The code to the left would result in:" +
                "\n\nx = 1" +
                "\nx = 2" +
                "\nWe are done with the while loop!" +
                "\n\n\n\n\n\nA do while loop works exactly like a while loop with the exception that it checks the condition after it runs everything. This means a dowhile look will always atleast run once.";
        cardwhile1.setText(WHILEEX);
        texts.add(cardwhile1);

        //FOR LOOPS Statements
        JTextArea cardfor1 = new JTextArea(50, 30);
        setTextArea(cardfor1);
        String FOREX = "\nA for loop works exactly like a while loop in the sense that it will run as long as the parameters are met" +
                "\n\nWhen to use a for loop over a while loop:" +
                "\n   You should use a for loop in more object orientated actions, such as interacting with arrays" +
                "\n\n\nA good way to think of it is that a for loop will run a predetermined amount of times. While a while loop runs until a predetermined scenario is created" +
                "\n\nThis code would print \'Hello\' 10 times" +
                "\n\nCode Explained:" +
                "\nIf statements can be hard to understand at first so hopefully this can clarify what is happening here" +
                "\n\nint i = 0  -- Every for loop should have an Int initialized into it. This int will be used for the condition" +
                "\n\ni <= 10    -- This is the condition of the for loop. It will run as long as i is less than or equal to 10" +
                "\n\ni++        -- After every single loop, i will increase by one";
        cardfor1.setText(FOREX);
        texts.add(cardfor1);

        //Scanner
        JTextArea cardscanner1 = new JTextArea(50, 30);
        setTextArea(cardscanner1);
        String SCANNEREX = "\nFirst things first, to use a Scanner, you need to import it" +
                "\n\nThere are three different versions of Scanners. This one is an input Scanner, this is connected to the keyboard. It is often times used for Applications" +
                "\n\n\nThis type of Scanner is an output Scanner. This is connected to the monitor. It is often times used for console only programs or to print debug lines" +
                "\n\n\nThis type of Scanner is an error Scanner. It works like System.out except it is used to output errors. Most IDE's such as NetBeans, Eclipse, IntelliJ, etc will automatically print this in red" +
                "\n\n\nPlease Note: You can edit the names of the scanners after initializing them with Scanner. I used Input, Output, and Error to organize them. You can use any name you please.";
        cardscanner1.setText(SCANNEREX);
        texts.add(cardscanner1);

        //Classes and Objects
        JTextArea cardclandobj1 = new JTextArea(50, 30);
        setTextArea(cardclandobj1);
        String CLANDOBJEX = "\nClasses and objects are like a restaurant menu." +
                "\nEverything is organized into groups like Sandwiches, soups, salads (the classes)." +
                "\nIn those groups are the different foods (methods)." +
                "\n\n\n\n\n\n\n\nWhenever you create a class and fill it with methods you can create objects with it." +
                "\nCreating an object out of a class allows you to call all of the methods of that class without having to extend it." +
                "\n\nIn the example to the left, the output of main would be \'Hello, World!\' (the one setup in the CSTutor class).";
        cardclandobj1.setText(CLANDOBJEX);
        texts.add(cardclandobj1);

        //Array
        JTextArea cardarrays1 = new JTextArea(50, 30);
        setTextArea(cardarrays1);
        String ARRAYSEX = "\nArrays can be compared to a cabinet. It will hold a bunch of things for you." +
                "\nThere are two ways to create an Array, both of them shown here. It is important to note that an array" +
                "is a set size, you cannot change the size of an array." +
                "\n\n\n\n\nAn ArrayList works exactly like an array except the size of the array IS changeable." +
                "To add items into an Arraylist, you have to do name.add(item);";
        cardarrays1.setText(ARRAYSEX);
        texts.add(cardarrays1);

        //Inheritance
        JTextArea cardinh1 = new JTextArea(50, 30);
        setTextArea(cardinh1);
        String INHEX = "\nInheritance allows you to call a method from another class. This worlds a lot like creating an object." +
                "\n\nIn this example, the class named Hello has a method that prints out \'Hello, world!\'." +
                "\n\n\n\n\nWorld extends to Hello, so it can use the Print() method, in which is used here." +
                "So the result when World runs is that \'Hello, world!\' is printed to the console.";
        cardinh1.setText(INHEX);
        texts.add(cardinh1);

        //Polymorphism
        JTextArea cardpoly1 = new JTextArea(50, 30);
        setTextArea(cardpoly1);
        String POLYEX = "\nPolymorphism is another way of doing inheritance." +
                "\n\nIn this example, an Animal, Dog, and Client class are created." +
                "The animal class creates a println that says it makes a sound." +
                "\n\n\n\n\n\nThe dog class does the same thing, it has a println that says it barks." +
                "\n\n\n\n\n\n\n\nThe client class creates an animal object of type animal. Then it creates" +
                "an animal of type dog." +
                "\n\nWhat happens is when the animal makes a sound then the animal Sound() method starts." +
                "\n\nWhen the dog makes a sound, both the dog's and animal's Sound() method enacts.";
        cardpoly1.setText(POLYEX);
        texts.add(cardpoly1);

        //Sorting
        JTextArea cardins1 = new JTextArea(50, 45);
        setTextArea(cardins1);
        String INSEX = "\nInsertion sort takes an array and loops it and checks if the number to the left is smaller." +
                "If the number to the left is smaller, then it gets moved over." +
                "\n\nMore In Depth Explanation:" +
                "\n   The sort will check each index of the array and compare it to the values" +
                " to the left of it." +
                "\n\n   So if you have an array of {5,3,2,4,10} then it will go like this." +
                "\n\n       Step 1: Check 5. 5 is the only number to the left so it is already done." +
                "\n             Result: {5,3,2,4,10}" +
                "\n\n       Step 2: Check 3. 3 is less than 5. There is no number before 5. So three gets inserted before 4." +
                "\n             Result: (3,5,2,4,10}" +
                "\n\n       Step 3: Check 2. 2 is less than 5. 2 is also less than 3. It gets inserted before those numbers." +
                "\n             Result: {2,3,5,4,10}" +
                "\n\n       Step 4: Check 4. 4 is less than 5. 4 is however, larger than 3. It gets inserted between those numbers." +
                "\n             Result: {2,3,4,5,10}" +
                "\n\n       Step 5: Check 10. 10 is greater than all numbers before it. It does not get moved." +
                "\n             Final Result: (2,3,4,5,10}" +
                "\n\n\nPlease Note: There are other kinds of sorting out there (primarily Quick Sort, Bubble Sort, and Selection Sort) that all work differently." +
                "Insertion is overall the more nice and effective one to use and is thus the one that was explained in this software.";
        cardins1.setText(INSEX);
        texts.add(cardins1);

        //Recursive
        JTextArea cardrec1 = new JTextArea(50, 45);
        setTextArea(cardrec1);
        String RECEX = "\nRecursion is the act of running a method inside that very method." +
                "\n\n\n\nThis is simply just asking to print the results of the next method." +
                "\n\n\n\nA base case is necessary to tell the function to stop. Otherwise it will run infinitely." +
                "\n\nThe \'\' is there because I cannot return just an int as the method is asking for a String." +
                "\n\n\n\nReturns n and then adds a comma and runs the method again." +
                "\n\n\nThe end result is: 5 , 4 , 3 , 2 , 1 , 0";
        cardrec1.setText(RECEX);
        texts.add(cardrec1);

        //Basic Operators
        JTextArea cardboper1 = new JTextArea(50, 45);
        setTextArea(cardboper1);
        String BOPEX = "\nOperators are functions that you can use to alter the state of values." +
                "\n\nx++ is the exact same as saying x = x+1;" +
                "\nx-- is the exact same as saying x = x-1;" +
                "\n\nx++ and such only does it in increments of one. If you want to do more, do something like the following" +
                "\n\n\n\nx+=3 is the exact same as saying x = x+3" +
                "\nx-=3 is the exact same as saying x = x-3;" +
                "\nn*=3 is the exact same as saying x = x*3;";
        cardboper1.setText(BOPEX);
        texts.add(cardboper1);

        //Add cards to panel
        desccards = new JPanel(new CardLayout());
        desccards.add(cardif1, IFTHEN);
        desccards.add(cardwhile1, WHILE);
        desccards.add(cardfor1, FORLOOPS);
        desccards.add(cardscanner1, SCANNER);
        desccards.add(cardclandobj1, CLANDOBJ);
        desccards.add(cardarrays1, ARRAYS);
        desccards.add(cardinh1, INHERITANCE);
        desccards.add(cardpoly1, POLYMORPHISM);
        desccards.add(cardins1, SORTING);
        desccards.add(cardrec1, RECURSION);
        desccards.add(cardboper1, BOPERATORS);
        pane.add(desccards, BorderLayout.EAST);
        //
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        CardLayout cl = (CardLayout) (codecards.getLayout());
        cl.show(codecards, (String) e.getItem());

        CardLayout c2 = (CardLayout) (desccards.getLayout());
        c2.show(desccards, (String) e.getItem());
    }

    private void setTextArea(JTextArea x) {
        x.setEditable(false);
        x.setOpaque(false);
        x.setBackground(new Color(0, 0, 0, 0));
        x.setLineWrap(true);
        x.setWrapStyleWord(true);
    }

    private class ButtonListenerSort implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            textBoxSort sortex = new textBoxSort();
            sortex.start();
        }
    }
    private class ButtonListenerRec implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            recExample recex = new recExample();
            recex.start();
        }
    }
    private class ButtonListenerPoly implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            polyExample polyex = new polyExample();
            polyex.start();
        }
    }
    private class ButtonListenerArraysList implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            arraylistExample alex = new arraylistExample();
            alex.start();
        }
    }
}