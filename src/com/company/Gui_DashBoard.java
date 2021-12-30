package com.company;

import javax.swing.*;

public class Gui_DashBoard {
    Gui_DashBoard(){
        gui_DashBoard_init();
        System.out.println("This is Constructor of Gui_Dashboard class");
    }
    public void gui_DashBoard_init(){
        /* this is half screen x-axis,y-axis,width,height */
        int x=-74;
        int y=-240;
        int width=890;
        int height=550;
        /* ----------*/
        JFrame f;
        Gui_Header header=new Gui_Header(-74,-240, 890,550);
        f=header.gui_Header_init();
        f.setSize(829,553);
        f.setLayout(null);//using no layout managers
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
