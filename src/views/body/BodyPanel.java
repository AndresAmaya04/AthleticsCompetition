package views.body;

import views.ConstantsUI;

import javax.swing.*;
import java.awt.*;

public class BodyPanel extends JPanel{

    public BodyPanel() {
        this.setBackground(Color.decode("#A9A9A9"));
        int widthS = Toolkit.getDefaultToolkit().getScreenSize().width;
        int heightS = Toolkit.getDefaultToolkit().getScreenSize().height;
        float ws = (float) (widthS*0.70);
        float hs = (float) (heightS*0.70);
        this.setPreferredSize(new Dimension(widthS,(int)hs));

        this.setLayout(new BorderLayout());
//        this.setBackground(Color.BLACK);
//        this.setBounds(0,0,10,10);
        initicomponents();
    }

    public void initicomponents(){
        LeftPanel leftPanel = new LeftPanel();
        RigthPanel rigthPanel = new RigthPanel();

        this.add(leftPanel,BorderLayout.WEST);
        this.add(rigthPanel,BorderLayout.EAST);
    }

    public void changeLanguage(){

    }
}
