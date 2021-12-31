package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui_Login {
    JFrame f;
    Gui_Login(JFrame frame){
        f=frame;
        gui_Login_init();
        System.out.println("[OK] Gui_Login");
    }
    public void gui_Login_init(){
        /* this is half screen x-axis,y-axis,width,height */
        int x=-74;
        int y=-240;
        int width=890;
        int height=550;

        Color white;
        white=new Color(234,234,234);
        /* ----------*/
        Gui_Header header=new Gui_Header(x,y,width,height,white,f);
        header.gui_Header_init();

        Container c=f.getContentPane();

        ImageIcon icon1= new ImageIcon("images/a1.jpg");
        Font font1;
        font1=new Font("Arial",Font.PLAIN,20);
        JTextField tf1;
        JLabel l1,l2,l5;
        l1=new JLabel("Email :");
        l1.setFont(font1);
        l2=new JLabel("Password:");
        l2.setFont(font1);

        l5=new JLabel(icon1);
        l5.setBounds(0,0, icon1.getIconWidth(), icon1.getIconHeight() );
        l1.setBounds(160,200,350,30);
        l1.setForeground(white);
        l2.setBounds(160,250,350,30);
        l2.setForeground(white);
        tf1=new JTextField();
        tf1.setBounds(285,200, 350,30);
        tf1.setFont(font1);
        JPasswordField password1 = new JPasswordField();
        password1.setBounds(285,250,350,30);
        password1.setFont(font1);
        JButton b=new JButton("LOGIN");
        b.setBounds(370,300,80, 30);//x-axis, y axis, width, height
        //f.setSize(f.getMaximumSize());
        c.setSize(829,553);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf1.setText("Welcome to Noble.");
                JOptionPane.showMessageDialog(f,"Password Matched");
                //c.dispose();
                new Gui_DashBoard(f);

            }
        });
        c.add(tf1);

        c.add(password1);
        c.add(l1);
        c.add(l2);

        c.add(l5);
        c.add(b);

        f.setLayout(null);//using no layout managers
        f.setVisible(true);


    }
}
