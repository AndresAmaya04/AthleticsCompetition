package views.main;



import presenter.*;

import javax.swing.*;
import java.awt.*;


public class JfMainWindow extends JFrame {

    JPMainPanel jpMainPanel;



    public JfMainWindow(Presenter presenter) throws HeadlessException {
        this.setBackground(Color.decode("#114358"));
        setMinimumSize(new Dimension(900,400));
        setMaximumSize(new Dimension(1920,1080));
        setExtendedState( MAXIMIZED_BOTH );
//        this.setIconImage(new ImageIcon(getClass().getResource(ConstantsUI.PATH_ICON)).getImage());
        setTitle("Competencia atletica");
        setLocationRelativeTo( null );
        //setIconImage(new ImageIcon(getClass().getResource(ConstantUI.LOGO_MAIN)).getImage());
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        initComponents(presenter);
        setVisible(true);
    }

    public void initComponents(Presenter presenter){
        jpMainPanel = new JPMainPanel(presenter);
        JScrollPane jScorllPane = new JScrollPane(jpMainPanel);

//        this.add(jScorllPane);
        this.add(jpMainPanel);
    }

    public String filechooser(){
        return jpMainPanel.filechooser();
    }
}
