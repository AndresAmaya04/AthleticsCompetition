package views.body;

import javax.swing.*;
import java.awt.*;

public class LeftPanel extends JPanel{

    public LeftPanel() {
        this.setPreferredSize(new Dimension(1526,870));
        this.setBackground(Color.decode("#A9A9A9"));
        initicomponents();
    }

    /**
     * Metodo que crea los componentes del panel LefttPanel
     */
    public void initicomponents(){
        JLabel jLabel = new JLabel("a");
        jLabel.setBackground(Color.BLACK);
        this.add(jLabel);
    }
}
