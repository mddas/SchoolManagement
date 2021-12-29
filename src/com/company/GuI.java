package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuI {
GuI(){
    System.out.println("[OK] this is constructor of GuI class");
    this.gui_init();
}
    public void gui_init(){
        //System.out.println("This is Gui");
        JFrame f=new JFrame();
        JButton b=new JButton("LOGIN");
        b.setBounds(130,100,100, 50);//x axis, y axis, width, height

        f.setSize(f.getMaximumSize());
        final JTextField tf=new JTextField();
        tf.setBounds(50,50, 150,20);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Welcome to Javatpoint.");
            }
        });
        f.add(b);
        f.add(tf);
        f.setLayout(null);//using no layout managers
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
