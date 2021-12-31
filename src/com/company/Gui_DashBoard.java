package com.company;

import javax.swing.*;
import java.awt.*;
public class Gui_DashBoard {
    JFrame f;
    Gui_DashBoard(JFrame frame){
        f=frame;
        gui_DashBoard_init();
        System.out.println("This is Constructor of Gui_Dashboard class");
    }
    public void gui_DashBoard_init(){
        /* this is full screen x-axis,y-axis,width,height */
        int x=200;
        int y=-240;
        int width=890;
        int height=550;
        Color white,red;
        red=new Color(255,0,0);
        white=new Color(234,234,234);
        /* ----------*/

        Gui_Header header=new Gui_Header(x,y,width,height,white,f);
        header.gui_Header_init();

        Landing_Dashboard first_page=new Landing_Dashboard(f);
        first_page.first_page_init();

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

        JLabel bgimage1_L;
        JLabel profile_L_text,student_L_text,staff_L_text,exam_L_text,result_L_text,bill_L_text;
        JButton profile_B,student_B,staff_B,exam_B,result_B,bill_B;

        bgimage1_L=new JLabel("Student Management",bgImage1,JLabel.LEFT);


        profile_L_text=new JLabel("Profile");
        profile_L_text.setBounds(112,-20,300,200);
        profile_L_text.setFont(font1);
        profile_L_text.setForeground(white);
        f.add(profile_L_text);
        profile_B=new JButton(AdminLogo);
        profile_B.setBounds(10,15,300,200);
        profile_B.setFont(font1);
        profile_B.setForeground(red);
        profile_B.setSize(AdminLogo.getIconWidth(),AdminLogo.getIconHeight());
        f.add(profile_B);


        student_L_text=new JLabel("student");
        student_L_text.setBounds(112,87,300,200);
        student_L_text.setFont(font1);
        student_L_text.setForeground(white);
        f.add(student_L_text);
        student_B=new JButton(studentsLogo);
        student_B.setBounds(10,130,300,200);
        student_B.setFont(font1);
        student_B.setForeground(red);
        student_B.setSize(studentsLogo.getIconWidth(),studentsLogo.getIconHeight());
        f.add(student_B);



        bill_L_text=new JLabel("Bill");
        bill_L_text.setBounds(112,195,300,200);
        bill_L_text.setFont(font1);
        bill_L_text.setForeground(white);
        f.add(bill_L_text);
        bill_B=new JButton(billLogo);
        bill_B.setBounds(10,238,300,200);
        bill_B.setFont(font1);
        bill_B.setForeground(red);
        bill_B.setSize(billLogo.getIconWidth(),billLogo.getIconHeight());
        f.add(bill_B);

        staff_L_text=new JLabel("Staff");
        staff_L_text.setBounds(112,305,300,200);
        staff_L_text.setFont(font1);
        staff_L_text.setForeground(white);
        f.add(staff_L_text);
        staff_B=new JButton(staffLogo);
        staff_B.setBounds(10,345,300,200);
        staff_B.setFont(font1);
        staff_B.setForeground(red);
        staff_B.setSize(staffLogo.getIconWidth(),staffLogo.getIconHeight());
        f.add(staff_B);

        exam_L_text=new JLabel("Exam");
        exam_L_text.setBounds(112,407,300,200);
        exam_L_text.setFont(font1);
        exam_L_text.setForeground(white);
        f.add(exam_L_text);
        exam_B=new JButton(examLogo);
        exam_B.setBounds(10,460,300,200);
        exam_B.setFont(font1);
        exam_B.setForeground(red);
        exam_B.setSize(examLogo.getIconWidth(),examLogo.getIconHeight());
        f.add(exam_B);

        result_L_text=new JLabel("Result");
        result_L_text.setBounds(112,370,500,500);
        result_L_text.setFont(font1);
        result_L_text.setForeground(white);
        f.add(result_L_text);
        result_B=new JButton(resultLogo);
        result_B.setBounds(10,570,550,500);
        result_B.setFont(font1);
        result_B.setForeground(red);
        result_B.setSize(resultLogo.getIconWidth(),resultLogo.getIconHeight());
        f.add(result_B);

        bgimage1_L.setBounds(0,0,bgImage1.getIconWidth(),bgImage1.getIconHeight());
        bgimage1_L.setFont(font);
        bgimage1_L.setForeground(red);
        f.add(bgimage1_L);

        f.setSize(f.getMaximumSize());
        System.out.println(f.getMaximumSize());
        f.setLayout(null);//using no layout managers
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
