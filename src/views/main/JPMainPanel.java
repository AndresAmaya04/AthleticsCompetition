package views.main;

import javax.swing.*;

import presenter.Presenter;
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

    public JPMainPanel(Presenter presenter) {
//        setPreferredSize(new Dimension(10,10));
//        setMinimumSize(new Dimension(900,400));
//        setMaximumSize(new Dimension(1920,1080));
//        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        setLayout(new BorderLayout());
        initComponents(presenter);
    }

    public void initComponents(Presenter presenter){
        headerPanel = new HeaderPanel(presenter);
        jBodyPanel = new BodyPanel();
        footerPanel = new FooterPanel();

//        this.add(headerPanel);
//        this.add(jBodyPanel);
//        this.add(footerPanel);
        this.add(headerPanel,BorderLayout.NORTH);
        this.add(jBodyPanel,BorderLayout.CENTER);
        this.add(footerPanel,BorderLayout.SOUTH);
    }

    public String filechooser(){
        return headerPanel.filechooser();
    }
}
