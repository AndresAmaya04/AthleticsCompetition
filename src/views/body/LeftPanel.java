package views.body;

import javax.swing.*;
import java.awt.*;

public class LeftPanel extends JPanel{

        int widthS = Toolkit.getDefaultToolkit().getScreenSize().width;
        int heightS = Toolkit.getDefaultToolkit().getScreenSize().height;
        float ws = (float) (widthS*0.70);
        float hs = (float) (heightS*0.70);

    JPanel jPanel = new JPanel();
    JPanel jpanelInit = new JPanel();
    public LeftPanel() {
//        System.out.println(widthS);
//        System.out.println(ws);
        this.setPreferredSize(new Dimension((int)ws,(int)hs));
//        this.setBackground(Color.decode("#A9A9A9"));
        this.setBackground(Color.ORANGE);
//        this.add(jPanel);
//        this.add(jpanelInit);
//        this.validate();

//        this.setBackground(Color.decode("#276E90"));
        initicomponents();
    }

    /**
     * Metodo que crea los componentes del panel LefttPanel
     */
    public void initicomponents(){
        jpanelInit.setBackground(Color.BLUE);

        this.add(jpanelInit);
//        this.validate();
    }


}
