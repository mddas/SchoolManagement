package com.company;

import javax.swing.*;
import java.awt.*;

public class Landing_Dashboard {
    JFrame f;
    Landing_Dashboard(JFrame frame){
        f=frame;
    }
    public void first_page_init() {

        Container c = f.getContentPane();
        JLabel total;
        total=new JLabel("Total students");
        total.setBounds(120,50,200,200);
        total.setForeground(Color.RED);
        c.add(total);
    }

}
