package com.company;
import javax.swing.*;
import java.awt.*;

public class GuI_Main extends Component {
GuI_Main(){
    JFrame f=new JFrame();
    System.out.println("[OK] this is constructor of GuI_Main class");
    //new Gui_Login(f);
    new Gui_DashBoard(f);
    //new AudioPlayer02(f);
    System.out.println("[OK] GuI_Main");
}


}
