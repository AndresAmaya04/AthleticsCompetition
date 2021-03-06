package views.main;



import model.Delegation;
import presenter.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


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

//    public void changePanelInit(){
//        jpMainPanel.changePanelInit();
//        this.validate();
//    }

    public void changePanelFindCompetitor(){
        jpMainPanel.changePanelFindCompetitor();
        this.validate();
    }

    public void changePanelCompetitorsDelegation(){
        jpMainPanel.changePanelCompetitorsDelegation();
        this.validate();
    }

    public void changePanelMedalsCompetenceGold(){
        jpMainPanel.changePanelMedalsCompetenceGold();
        this.validate();
    }

    public void changePanelMedalsCompetenceSilver(){
        jpMainPanel.changePanelMedalsCompetenceSilver();
        this.validate();
    }

    public void changePanelMedalsCompetenceBronze(){
        jpMainPanel.changePanelMedalsCompetenceBronze();
        this.validate();
    }

    public void changePanelMedalsDelegation(){
        jpMainPanel.changePanelMedalsDelegation();
        this.validate();
    }

    public void changePanelScore(){
        jpMainPanel.changePanelScore();
        this.validate();
    }

    public String filechooser(){
        return jpMainPanel.filechooser();
    }

    public void addRowToFindCompetitor(Object[] objects){
        jpMainPanel.addRowFindCompetitor(objects);
    }

    public String getNameFindCompetitor(){
        return jpMainPanel.getNameFindCompetitor();
    }

    public String getNameDelegationSearch(){
        return jpMainPanel.getNameDelegationSearch();
    }

    public void cleanTableFindCompetitor(){
        jpMainPanel.cleanTableFindCompetitor();
    }

    public void addRowTableByDelegation(Object[] objects){
        jpMainPanel.addRowTableByDelegation(objects);
    }

    public void cleanTableByDelegation(){
        jpMainPanel.cleanTableByDelegation();
    }

    public String getNameByDelegationSearch(){
        return jpMainPanel.getNameByDelegationSearch();
    }

    public void addRowGold(Object[] objects){
        jpMainPanel.addRowGold(objects);
    }

    public void addRowSilver(Object[] objects){
        jpMainPanel.addRowSilver(objects);
    }

    public void addRowBronze(Object[] objects){
        jpMainPanel.addRowBronze(objects);
    }

    public void addRowTableDelegation(Object[] objects){
        jpMainPanel.addRowTableDelegation(objects);
    }

    public void cleanTableMedalDelegation(){
        jpMainPanel.cleanTableMedalDelegation();
    }

    public void cleanTableGold(){
        jpMainPanel.cleanTableGold();
    }

    public void cleanTableSilver(){
        jpMainPanel.cleanTableSilver();
    }

    public void cleanTableBronze(){
        jpMainPanel.cleanTableBronze();
    }

    public String getCompetenceComboBoxScores(){
        return jpMainPanel.getCompetenceComboBoxScores();
    }

    public String getGenderBoxScore(){
        return jpMainPanel.getGenderBoxScore();
    }

    public void cleanPanelScores(){
        jpMainPanel.cleanPanelScores();
    }

    public void addRowScores(Object[]objects){
        jpMainPanel.addRowScores(objects);
    }

    public void addRowExperience(Object[] objects){
        jpMainPanel.addRowExperience(objects);
    }

    public void addRowGoldenBoy(Object[] objects){
        jpMainPanel.addRowGoldenBoy(objects);
    }

    public void changePanelGolden(){
        jpMainPanel.changePanelGolden();
    }

    public void changePanelGraphics(JPanel jPanel){
        jpMainPanel.changePanelGraphics(jPanel);
    }

    public void changePanelExperience(){
        jpMainPanel.changePanelExperience();
    }

    public void cleanExperienceTable(){
        jpMainPanel.cleanExperienceTable();
    }

    public void changeLanguage(){
        jpMainPanel.changeLanguage();
    }
}
