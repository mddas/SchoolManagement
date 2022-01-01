package com.company;

import javax.swing.*;
import java.awt.*;
public class Gui_DashBoard {
    JFrame f;
    Gui_DashBoard(JFrame frame){
        f=frame;
        Add_All_Menus_To_Create_Dashboard();
        System.out.println("This is Constructor of Gui_Dashboard class");
    }
    public void Add_All_Menus_To_Create_Dashboard(){
        /* this is full screen x-axis,y-axis,width,height */
        //this is for Header
        int x=200;
        int y=-240;
        int width=890;
        int height=550;
        Color white,red;
        red=new Color(255,0,0);
        white=new Color(234,234,234);
        /* ----------*/
        /* this is for Total_Box_Full screen */


         /* */

        Gui_Header header=new Gui_Header(x,y,width,height,white,f);
        header.gui_Header_init();


        new Gui_search(f,100,150,200,200);//this is from search class
        new Gui_Total_Box(f);//new Total_Box(f);//this is class file which bring total,new box in left side
        new Gui_Left_Menus(f);//this is from Left menus class dashboard

        f.setSize(2000,2000);
        f.setLayout(null);//using no layout managers
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
