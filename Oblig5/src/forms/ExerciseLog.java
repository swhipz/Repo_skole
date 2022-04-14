package forms;

import models.Exercise;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExerciseLog extends JFrame {
    private JPanel mainPanel;
    private JTextField nameTextField;
    private JSpinner repSpinner;
    private JButton addExerciseButton;
    private JLabel weightLabel;
    private JTextField weightTextField;
    private JList<Exercise> exerciseJList;
    private JButton editButton;
    private DefaultListModel<Exercise>exerciseListModel = new DefaultListModel<>();


    public ExerciseLog(String title){
        super(title);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        exerciseJList.setModel(exerciseListModel);
        editButton.setVisible(true);
        repSpinner.setValue(1);
        nameTextField.setText("type exercise here");
        weightTextField.setText("e.g. 100");


        addExerciseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    System.out.println("Applybutton click registered..");
                    System.out.println("logging exercise:");

                    String exName = nameTextField.getText();
                    int exReps = repSpinner.getComponentCount();
                    int exWeight = Integer.parseInt(weightTextField.getText());


                    Exercise exercise = new Exercise(exName, exReps, exWeight);

                    exerciseListModel.addElement(exercise);


                    //tømme ''feltene''
                    if (exerciseListModel.size() > 0){
                         nameTextField.setText("");
                         repSpinner.setValue(0);
                         weightTextField.setText("");

                    }


                } catch (NumberFormatException numberFormatException) {
                    System.out.println("No value found, please try again");
                }
                }

        });
        exerciseJList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                try{
                String exeName = nameTextField.getText();
                int exeReps = repSpinner.getComponentCount();
                int exeWeight = Integer.parseInt(weightTextField.getText());

                Exercise selectedExercise = exerciseJList.getSelectedValue();
                selectedExercise.setName(exeName);
                selectedExercise.setRepetitions(exeReps);
                selectedExercise.setWeight(exeWeight);


                exerciseJList.updateUI();




            } catch (NumberFormatException numberFormatException) {
                    System.out.println("Selection failed - please try again");
        }}});

        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });

    }
}
