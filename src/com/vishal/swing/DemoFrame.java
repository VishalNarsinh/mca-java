package com.vishal.swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DemoFrame implements ActionListener{
    JFrame j;
    JTextField jt1,jt2,jt3;
    JButton jb1,jb2;
    JLabel jl;
    DemoFrame()
    {
        j=new JFrame("My Form");
        jt1=new JTextField(10);
        jt2=new JTextField(10);
        jl=new JLabel("=");
        jt3=new JTextField(10);
        jb1=new JButton("+");
        jb2=new JButton("-");
        j.add(jt1);
        j.add(jt2);
        j.add(jl);
        j.add(jt3);
        j.add(jb1);
        j.add(jb2);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        j.setSize(400,400);
        j.setVisible(true);
        j.setLayout(new FlowLayout());
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        int a,b,c;

        a=Integer.parseInt(jt1.getText());
        b=Integer.parseInt(jt2.getText());
        if(ae.getSource()==jb1)
            c=a+b;
        else
            c=a-b;
        jt3.setText(String.valueOf(c));
    }
    public static void main(String[] args) {
// TODO Auto-generated method stub
        new DemoFrame();
    }
}
