import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class RunMe extends JPanel  implements ActionListener{
    protected String selectedVal;
    protected String convertToVal;
    protected  JTextField textField;
    protected  JTextArea textArea;
    protected static Container pane;

    public RunMe() {
        super(new GridBagLayout());


        pane.setLayout(new GridBagLayout());

        //label for "Enter Binary Value"
        JLabel lab = new JLabel("Enter Value and select base: ");
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        lab.setFont(lab.getFont().deriveFont(Font.BOLD, 14f));
        pane.add(lab,c);

        textField = new JTextField();
        textField.addActionListener(this);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipadx = 200;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        pane.add(textField, c);

        String[] optionsToChoose = {"Base 2","Base 10", "Base 16", "Base 8"};
        JComboBox<String> jComboBox = new JComboBox<>(optionsToChoose);
        jComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedVal = (String) jComboBox.getSelectedItem();
            }
        });
        selectedVal = (String) jComboBox.getSelectedItem();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipadx = 30;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 0;
        pane.add(jComboBox, c);

        //------------------
        lab = new JLabel("Convert to: ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridwidth = 2;
        c.gridy = 1;
        lab.setFont(lab.getFont().deriveFont(Font.BOLD, 14f));
        pane.add(lab,c);

        JComboBox<String> jComboBox2 = new JComboBox<>(optionsToChoose);
        jComboBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertToVal = (String) jComboBox2.getSelectedItem();
            }
        });
        convertToVal = (String) jComboBox2.getSelectedItem();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.ipadx = 30;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 1;
        pane.add(jComboBox2, c);
        //------------------

        c.weightx = 0.0;
        c.insets = new Insets(10,0,0,0);
        lab = new JLabel("Results:", SwingConstants.CENTER);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 2;
        lab.setFont(lab.getFont().deriveFont(Font.BOLD, 14f));

        pane.add(lab, c);



        textArea = new JTextArea(40,20);
        textArea.setEditable(false);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridwidth = 3;
        c.gridy = 3;
        pane.add(textArea, c);

        JScrollPane scrollPane = new JScrollPane(textArea);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.1;
        c.weighty = 0.1;
        pane.add(scrollPane, c);

    }

    public void actionPerformed(ActionEvent evt) {

        String text = textField.getText();

        ValuePasser x = new ValuePasser(text, selectedVal, convertToVal);

        if(selectedVal.equals(convertToVal)) {
            textArea.append("   "+text +" "+ selectedVal + " --> " + text+ " "+convertToVal+"\n");
        }else{
            textArea.append("   "+text +" "+ selectedVal + " --> " + x.getVal()+ " "+convertToVal+"\n");
        }

        textField.selectAll();

        textArea.setCaretPosition(textArea.getDocument().getLength());
    }


    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Number RunMes by Joseph Waldron and Moiez Qamar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pane = frame.getContentPane();
        new RunMe();

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
