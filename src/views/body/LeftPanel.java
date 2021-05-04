package views.body;

import javax.swing.*;
import java.awt.*;

public class LeftPanel extends JPanel{

        int widthS = Toolkit.getDefaultToolkit().getScreenSize().width;
        int heightS = Toolkit.getDefaultToolkit().getScreenSize().height;
        float ws = (float) (widthS*0.70);
        float hs = (float) (heightS*0.70);
    public LeftPanel() {
        System.out.println(widthS);
        System.out.println(ws);
        this.setPreferredSize(new Dimension((int)ws,(int)hs));
        this.setBackground(Color.decode("#A9A9A9"));
//        this.setBackground(Color.decode("#276E90"));
        initicomponents();
    }

    /**
     * Metodo que crea los componentes del panel LefttPanel
     */
    public void initicomponents(){
//        JLabel jLabel = new JLabel("aad\nsdf\nsdf\ndsfsd\nfdsfdsfd\nfdf\ndfdf\ndfdfdf\ndfdfdfdfdfdfdfdf\ndfdfdd\nfdgdf\ngdfgdfgdhgf\nhdffgeaydhgeaj\ndyasdjkasjhdj\nahsjfgauf\njygajfa\ngsybjdfa\ngsbdujfg\nasbdjs\naygdjasyb\ndjasbd\njasbdj\nasbdujas\nybdjas\nybdjsagdbjy\nhadkfjbns\ndkfbsdj\nfhbdsjfh\nbsdjk\nfbsdj\nfbsdjkfhbsdjhfbs\ndjhfbsdj\nkfhbsdjkfhbs\ndjkbfsdkj\nbfsdkjfbsd\nkjfbdskjfbs\ndkjfbsdkjf\nbdskfjbdskf\njbsdkfjbs\ndkfjbdkbyd\nhktgyhghbghb\nfbgfbv fcgbfbg\nfgbfgbfff\nfdfd\nfbjhbjfh\nbsakjb\njkfbdkjfd    jb\na bfj bk\nfjb fkj\nbsad jasbd jasb\nd jasbd kjbsa");
//        jLabel.setBackground(Color.cyan);
//        jLabel.setPreferredSize(new Dimension((int)ws,(int)hs));
//
//        this.add(jLabel);
        JPanel jpanelInit = new JPanel();
        jpanelInit.setBackground(Color.BLUE);
//        jpanelInit.setPreferredSize(new Dimension((int)ws,(int)hs));
        System.out.println(jpanelInit.getPreferredSize());



        this.add(jpanelInit);
    }
}
