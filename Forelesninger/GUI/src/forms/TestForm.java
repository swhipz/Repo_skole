package forms;

import javax.swing.*;

public class TestForm extends JFrame {
    private JPanel mainPanel;

    public TestForm(String tittel) {
        super(tittel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

    }
}
