package views.body;

import views.ConstantsUI;

import javax.swing.*;
import java.awt.*;

public class BodyPanel extends JPanel{

    public BodyPanel() {
        this.setBackground(Color.decode("#A9A9A9"));
//        this.setPreferredSize(new Dimension(1500,841));
//        this.setBounds(0,0,10,10);
        initicomponents();
    }

    public void initicomponents(){
        LeftPanel leftPanel = new LeftPanel();
        RigthPanel rigthPanel = new RigthPanel();

        this.add(leftPanel);
        this.add(rigthPanel);
    }

    public void changeLanguage(){

    }
}
