package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui {
    private JTextField textFieldNumber;
    private JTextField textFieldSeed;
    private JTextField textFieldLb;
    private JTextField textFieldCapacity;
    private JTextArea textAreaItems;
    private JTextArea textAreaResult;
    private JTextField textFieldUb;
    private JPanel jPanel;
    private JButton buttonSolve;

    public gui() {
        buttonSolve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(textFieldNumber.getText());
                    int seed = Integer.parseInt(textFieldSeed.getText());
                    int capacity = Integer.parseInt(textFieldCapacity.getText());
                    int ub = Integer.parseInt(textFieldUb.getText());
                    int lb = Integer.parseInt(textFieldLb.getText());
                    Problem problem = new Problem(number, seed, ub, lb);
                    textAreaItems.setText(problem.ToString());
                    Result result = problem.Solve(capacity);
                    textAreaResult.setText(result.ToString());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("gui");
        frame.setContentPane(new gui().jPanel);
        frame.setPreferredSize(new Dimension(700, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
