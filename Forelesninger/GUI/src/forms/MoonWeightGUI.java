package forms;

import javax.swing.*;

public class MoonWeightGUI extends JFrame {

    private JPanel mainPanel;
    private JTextField textField1;
    private JButton denneKnappenBlirJævligButton;

    public MoonWeightGUI(String tittel) {
        super(tittel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }


}
