package com.company;

import javax.swing.*;
import java.awt.*;

public class Gui_DashBoard {
    Gui_DashBoard(){
        gui_DashBoard_init();
        System.out.println("This is Constructor of Gui_Dashboard class");
    }
    public void gui_DashBoard_init(){
        /* this is full screen x-axis,y-axis,width,height */
        int x=200;
        int y=-240;
        int width=890;
        int height=550;
        Color white,red,green;
        red=new Color(255,0,0);
        white=new Color(234,234,234);
        /* ----------*/
        JFrame f;
        Gui_Header header=new Gui_Header(x,y,width,height,white);
        f=header.gui_Header_init();

        Font font,font1;
        font=new Font("Arial",Font.BOLD,20);
        font1=new Font("Arial",Font.BOLD,20);
        ImageIcon studentsLogo,staffLogo,examLogo,resultLogo,billLogo,bgImage1,AdminLogo;
        AdminLogo=new ImageIcon("images/teacherLogo_1.png");
        studentsLogo= new ImageIcon("images/studentsLogo_2.jpg");
        staffLogo= new ImageIcon("images/teacherLogo_1.png");
        examLogo= new ImageIcon("images/ExamLogo_1.png");
        resultLogo= new ImageIcon("images/ResultLogo_1.jpg");
        billLogo= new ImageIcon("images/BillLogo_2.png");
        bgImage1=new ImageIcon("images/6_1.jpg");

        JLabel student_L,staff_L,exam_L,result_L,bill_L,bgimage1_L,profile_L;
        profile_L=new JLabel("Admin",AdminLogo,JLabel.LEFT);
        student_L=new JLabel("Students",studentsLogo,JLabel.LEFT);
        staff_L=new JLabel("Teachers",staffLogo,JLabel.LEFT);
        exam_L=new JLabel("Exam",examLogo,JLabel.LEFT);
        result_L=new JLabel("Result Ayo",resultLogo,JLabel.LEFT);
        bill_L=new JLabel("Bill Pay",billLogo,JLabel.LEFT);
        bgimage1_L=new JLabel("Student Management",bgImage1,JLabel.LEFT);

        profile_L.setBounds(10,-35,300,200);
        profile_L.setFont(font);
        profile_L.setForeground(white);
        f.add(profile_L);

        student_L.setBounds(10,80,300,200);
        student_L.setFont(font);
        student_L.setForeground(Color.white);
        f.add(student_L);

        bill_L.setBounds(10,185,300,200);
        bill_L.setFont(font);
        bill_L.setForeground(white);
        f.add(bill_L);

        staff_L.setBounds(10,298,300,200);
        staff_L.setFont(font);
        staff_L.setForeground(white);
        f.add(staff_L);

        exam_L.setBounds(10,407,300,200);
        exam_L.setFont(font);
        exam_L.setForeground(white);
        f.add(exam_L);

        result_L.setBounds(10,517,300,200);
        result_L.setFont(font);
        result_L.setForeground(white);
        //f.add(result_L);

        bgimage1_L.setBounds(0,0,bgImage1.getIconWidth(),bgImage1.getIconHeight());
        bgimage1_L.setFont(font);
        bgimage1_L.setForeground(red);
        f.add(bgimage1_L);

        JButton result_B=new JButton("Result",resultLogo);
        result_B.setBounds(2,570,250,100);
        result_B.setFont(font1);
        result_B.setForeground(red);
        f.add(result_B);

        f.setSize(f.getMaximumSize());
        System.out.println(f.getMaximumSize());
        f.setLayout(null);//using no layout managers
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
