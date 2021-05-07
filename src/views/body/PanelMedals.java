package views.body;

import javax.swing.*;
import java.awt.*;

public class PanelMedals extends JPanel {

    int widthS = Toolkit.getDefaultToolkit().getScreenSize().width;
    int heightS = Toolkit.getDefaultToolkit().getScreenSize().height;
    float ws = (float) (widthS*0.70);
    float hs = (float) (heightS*0.70);

    public PanelMedals() {
        this.setPreferredSize(new Dimension((int)ws,(int)hs));
        setBackground(Color.black);
        initicomponents();

    }

    public void initicomponents(){

    }
}
