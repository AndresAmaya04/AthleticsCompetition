package views.footer;

import javax.swing.*;
import java.awt.*;

public class FooterPanel extends JPanel{
    public FooterPanel() {
        int widthS = Toolkit.getDefaultToolkit().getScreenSize().width;
        int heightS = Toolkit.getDefaultToolkit().getScreenSize().height;
        float ws = (float) (widthS*0.30);
        float hs = (float) (heightS*0.030);
        this.setPreferredSize(new Dimension(widthS,(int) hs));
        this.setBackground(Color.decode("#0A3143"));
        initicomponents();
    }

    /**
     * Metodo que crea los objetos del panel Footer
     */
    public void initicomponents(){
        JLabel jLabel = new JLabel();
        jLabel.setText("holaaa");

        this.add(jLabel);

    }
    public void changeLanguage(){

    }
}
