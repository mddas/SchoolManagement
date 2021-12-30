package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuI extends Component {
GuI(){
    System.out.println("[OK] this is constructor of GuI class");
    this.gui_init();
}
    public void gui_init(){
        //System.out.println("This is Gui");
        JFrame f = new JFrame();
        ImageIcon icon= new ImageIcon("images/noble3.png");
        ImageIcon icon1= new ImageIcon("images/a1.jpg");
        //f.setIconImage(icon.getImage());

        Container c= f.getContentPane();
        Color color=new Color(234, 237, 237);
        Color white=new Color(234,234,234);
        c.setBackground(color);
        Font font,font1;
        font=new Font("Arial",Font.BOLD,28);
        font1=new Font("Arial",Font.PLAIN,20);
        JTextField tf1;
        JLabel l1,l2,l3,l4,l5;
        l1=new JLabel("Email :");
        l1.setFont(font1);
        l2=new JLabel("Password:");
        l2.setFont(font1);
        //l3=new JLabel("Noble Secondary English Boarding School");
        //l3.setBounds(170,-30,1000,120);
        //l3.setFont(font);
        l4=new JLabel("Noble Secondary English Boarding School",icon,JLabel.RIGHT);
        l4.setBounds(-74,-240, 890,550);
        l4.setFont(font);
        l4.setForeground(white);
        l5=new JLabel(icon1);
        l5.setBounds(0,0, icon1.getIconWidth(), icon1.getIconHeight() );
        System.out.println(icon1.getIconWidth());
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
        b.setBounds(370,300,80, 30);//x axis, y axis, width, height
        //f.setSize(f.getMaximumSize());
        f.setSize(829,553);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf1.setText("Welcome to Javatpoint.");
                JOptionPane.showMessageDialog(f,"Password Not Matched");
            }
        });
        f.add(tf1);
        //f.add(tf2);
        f.add(password1);
        f.add(l1);
        f.add(l2);
        //f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(b);

        f.setLayout(null);//using no layout managers
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
