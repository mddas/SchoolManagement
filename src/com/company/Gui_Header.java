package com.company;

import javax.swing.*;
import java.awt.*;

public class Gui_Header {
    JFrame f;
    int x;
    int y;
    int width;
    int height;
    Gui_Header(int a, int b,int c,int d){
        x=a;
        y=b;
        width=c;
        height=d;
        f = new JFrame("Noble School");
        System.out.println("[OK] Gui header");
    }
    public JFrame gui_Header_init(){
        ImageIcon icon= new ImageIcon("images/noble3.png");
        Color white=new Color(234,234,234);
        //c.setBackground(color);
        Font font,font1;
        font=new Font("Arial",Font.BOLD,28);
        JLabel header;
        header=new JLabel("Noble Secondary English Boarding School",icon,JLabel.RIGHT);
        header.setBounds(x,y,width,height);
        header.setFont(font);
        header.setForeground(white);
        f.add(header);
        System.out.println("header ok"+height);
        return f;


    }
}
