package views.main;



import presenter.*;

import javax.swing.*;
import java.awt.*;


public class JfMainWindow extends JFrame {

    JPMainPanel jpMainPanel;



    public JfMainWindow(Presenter presenter) throws HeadlessException {
//        setMinimumSize(new Dimension(900,400));
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
        jpMainPanel = new JPMainPanel();
    }
}
