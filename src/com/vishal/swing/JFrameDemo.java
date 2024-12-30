package com.vishal.swing;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo {


    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Demo");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBounds(0, 0, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Vishal");
        frame.add(label);
        label.setBounds(100, 100, 100, 100);
        JButton button = new JButton("Ready");
        frame.add(button);
        button.setBounds(100,200,100,100);

    }
}
