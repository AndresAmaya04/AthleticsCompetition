package views.body;

import views.ConstantsUI;

import javax.swing.*;
import java.awt.*;

public class LeftPanel extends JPanel{

        int widthS = Toolkit.getDefaultToolkit().getScreenSize().width;
        int heightS = Toolkit.getDefaultToolkit().getScreenSize().height;
        float ws = (float) (widthS*0.70);
        float hs = (float) (heightS*0.70);
        float wp = (float) (widthS*0.1);
        float hp = (float) (heightS*0.70);

    float fWButtonS = (float) (widthS*0.04);
    float fHButtonS = (float) (heightS*0.05);

    JPanel jPanel = new JPanel();
    JPanel jpanelInit = new JPanel();
    public LeftPanel() {
        this.setLayout(new BorderLayout());
//        System.out.println(widthS);
//        System.out.println(ws);
        this.setPreferredSize(new Dimension((int)ws,(int)hs));
//        this.setBackground(Color.decode("#A9A9A9"));
        this.setBackground(Color.decode("#C4DFE6"));
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
//        JPanel panelaux = new JPanel();
//        panelaux.setPreferredSize(new Dimension((int)wp,(int)hs));
        JLabel label1 = new JLabel();
//        label1.setText("Bienvenido al sistema Clasica atleta");
        label1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ConstantsUI.PATH_COMPETITOR)).getImage().getScaledInstance((int) ws,(int) hs,Image.SCALE_SMOOTH)));
        jpanelInit.setBackground(Color.BLUE);



//        this.add(panelaux, BorderLayout.WEST);
        this.add(label1, BorderLayout.CENTER);
//        this.add(label2, BorderLayout.CENTER);
//        this.validate();
    }


}
