package com.company;

import java.awt.*;
import javax.swing.*;

class Gui_Total_Box {
    JFrame f;
    Gui_Total_Box(JFrame frame){
        f=frame;
        System.out.println("hello world ");
        Landing_page();
    }
    public void Landing_page() {
        Container c = f.getContentPane();
        JLabel total,newAdmisson,studentleftSchool,Income,MoneySpend;
        ImageIcon TotalLOgo = new ImageIcon("images/circle.jpg");

        total = new JLabel(TotalLOgo);
        total.setBounds(1000, 70, 200, 200);
        total.setForeground(Color.white);
        c.add(total);

        newAdmisson = new JLabel(TotalLOgo);
        newAdmisson.setBounds(1180, 70, 200, 200);
        newAdmisson.setForeground(Color.white);
        c.add(newAdmisson);

        studentleftSchool = new JLabel(TotalLOgo);
        studentleftSchool.setBounds(1080, 250, 200, 200);
        studentleftSchool.setForeground(Color.white);
        c.add(studentleftSchool);

        Income = new JLabel(TotalLOgo);
        Income.setBounds(1000, 430, 200, 200);
        Income.setForeground(Color.white);
        c.add(Income);

        MoneySpend = new JLabel(TotalLOgo);
        MoneySpend.setBounds(1180, 430, 200, 200);
        MoneySpend.setForeground(Color.white);
        c.add(MoneySpend);

    }
}



