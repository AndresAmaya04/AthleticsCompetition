package views.main;

import javax.swing.*;
import views.body.BodyPanel;

//import controller.Controller;
//import views.header.BarMenu;
import views.footer.FooterPanel;
import views.header.HeaderPanel;

import java.awt.*;
//import presenters.PresenterApp;
//import views.header.JPContainerHeader;

public class JPMainPanel extends JPanel {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    BodyPanel jBodyPanel;
    HeaderPanel headerPanel;
    FooterPanel footerPanel;

    public JPMainPanel() {
        setLayout(new BorderLayout());
        initComponents();
    }

    public void initComponents(){
        headerPanel = new HeaderPanel();
        jBodyPanel = new BodyPanel();
        footerPanel = new FooterPanel();

        this.add(headerPanel,BorderLayout.NORTH);
        this.add(jBodyPanel,BorderLayout.CENTER);
        this.add(footerPanel,BorderLayout.SOUTH);
    }
}
