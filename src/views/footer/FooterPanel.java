package views.footer;

import javax.swing.*;
import java.awt.*;

public class FooterPanel extends JPanel{
    public FooterPanel() {
        this.setPreferredSize(new Dimension(100,25));
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
