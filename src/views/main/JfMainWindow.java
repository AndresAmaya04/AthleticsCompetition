package views.main;



import presenter.*;

import javax.swing.*;
import java.awt.*;


public class JfMainWindow extends JFrame {

    JPMainPanel jpMainPanel;



    public JfMainWindow(Presenter presenter) throws HeadlessException {
        this.setBackground(Color.decode("#114358"));
//        setMinimumSize(new Dimension(900,400));
//        setMaximumSize(new Dimension(1920,1080));
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
        this.validate();
    }

    public void changePanel1(){
        jpMainPanel.changePanel1();
        this.validate();
    }

    public void changePanelInit(){
        jpMainPanel.changePanelInit();
        this.validate();
    }

    public void changePanelFindCompetitor(){
        jpMainPanel.changePanelFindCompetitor();
        this.validate();
    }

    public void changePanelCompetitorsDelegation(){
        jpMainPanel.changePanelCompetitorsDelegation();
        this.validate();
    }

    public void changePanelMedalsCompetence(){
        jpMainPanel.changePanelMedalsCompetence();
        this.validate();
    }

    public void changePanelScore(){
        jpMainPanel.changePanelScore();
        this.validate();
    }

    public String filechooser(){
        return jpMainPanel.filechooser();
    }
}
