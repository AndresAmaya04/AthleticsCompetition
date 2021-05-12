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
        this.setLayout(new BorderLayout());
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
        JLabel label1 = new JLabel();
        label1.setText("Bienvenido al sistema Clasica atleta");
        jpanelInit.setBackground(Color.BLUE);

        JLabel label2 = new JLabel();
        label2.setText("Para comenzar por favor agrege los recurso .json primero en el que se encuentran \n los corredores y luego donde se encuentran las diciplinas");

        this.add(label1, BorderLayout.NORTH);
        this.add(label2, BorderLayout.CENTER);
//        this.validate();
    }


}
