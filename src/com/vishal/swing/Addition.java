package com.vishal.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addition {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Addition");
        frame.setBounds(0,0,500,500);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField text1 = new JTextField(10);
        frame.add(text1);
        text1.setBounds(100,100,100,20);
        JLabel outputLabel = new JLabel();
        frame.add(outputLabel);
        outputLabel.setBounds(100,150,100,20);

        JButton button = new JButton("Click");
        frame.add(button);
        button.setBounds(100,200,100,20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(text1.getText());
                int temp = num1;
                int sum = 0;
                while (temp != 0) {
                    int rem = temp % 10;
                    sum = sum + rem;
                    temp = temp / 10;
                }
                outputLabel.setText(sum+ " ");
            }
        });
        button.addActionListener((e)->{
            int num1 = Integer.parseInt(text1.getText());
            int temp = num1;
            int sum = 0;
            while (temp != 0) {
                int rem = temp % 10;
                sum = sum + rem;
                temp = temp / 10;
            }
            outputLabel.setText(sum+ " ");
        });
    }
}
