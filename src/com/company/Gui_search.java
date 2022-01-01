package com.company;
import java.net.*;

import sun.audio.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Gui_search implements ActionListener {
    JFrame f;
    JButton search_B;
    int x;
    int y;
    int width;
    int height;
    Gui_search(JFrame frame, int X_x, int Y_y, int Width_width, int Height_height){
        f=frame;
        x=X_x;
        y=Y_y;
        width=Width_width;
        height=Height_height;
        Search();
    }
    public void Search(){
        Container c=f.getContentPane();

        Font font1;
        font1=new Font("Arial",Font.PLAIN,20);
        ImageIcon logo=new ImageIcon("images/search.jpg");
        JTextField serch=new JTextField();
        serch.setBounds(420,100, 295,50);
        serch.setFont(font1);
        c.add(serch);

        search_B=new JButton(logo);
        search_B.setBounds(730,100, 95,50);
        search_B.setFont(font1);
        search_B.setForeground(Color.RED);
        search_B.setSize(logo.getIconWidth(),logo.getIconHeight());
        c.add(search_B);
        search_B.addActionListener(this);//this is ActionListener

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==search_B){
            JOptionPane.showMessageDialog(f,"Searched");
        }
        else {

        }
    }
}
