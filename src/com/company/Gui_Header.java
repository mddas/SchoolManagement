package com.company;

import javax.swing.*;
import java.awt.*;

public class Gui_Header {
    JFrame f;
    int x;
    int y;
    int width;
    int height;
    Color colr;
    Gui_Header(int a, int b,int c,int d,Color color,JFrame frame){
        f=frame;
        x=a;
        y=b;
        width=c;
        height=d;
        colr=color;
        System.out.println("[OK] Gui header");
    }
    public void gui_Header_init(){
        Container c=f.getContentPane();
        ImageIcon icon= new ImageIcon("images/noble3.png");
        System.out.println("\n"+icon.getIconWidth()+":header:"+icon.getIconHeight());
        //Color white=new Color(234,234,234);
        //c.setBackground(color);
        Font font;
        font=new Font("Arial",Font.BOLD,28);
        JLabel header;
        header=new JLabel("Noble Secondary English Boarding School",icon,JLabel.RIGHT);
        header.setBounds(x,y,width,height);
        header.setFont(font);
        header.setForeground(colr);
        c.add(header);


    }
}
