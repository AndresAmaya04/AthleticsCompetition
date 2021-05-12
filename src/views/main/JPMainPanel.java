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
        jBodyPanel = new BodyPanel(presenter);
        footerPanel = new FooterPanel();

//        this.add(headerPanel);
//        this.add(jBodyPanel);
//        this.add(footerPanel);
        this.add(headerPanel,BorderLayout.NORTH);
        this.add(jBodyPanel,BorderLayout.CENTER);
        this.add(footerPanel,BorderLayout.SOUTH);
    }

    public void changePanel1(){
        jBodyPanel.changePanel1();
        this.validate();
    }

//    public void changePanelInit(){
//        jBodyPanel.changePanelInit();
//        this.validate();
//    }

    public void changePanelFindCompetitor(){
        jBodyPanel.chanPanelFindCompetitor();
        this.validate();
    }

    public void changePanelMedalsCompetenceGold(){
        jBodyPanel.changePanelMedalsCompetenceGold();
        this.validate();
    }

    public void changePanelMedalsCompetenceSilver(){
        jBodyPanel.changePanelMedalsCompetenceSilver();
        this.validate();
    }

    public void changePanelMedalsCompetenceBronze(){
        jBodyPanel.changePanelMedalsCompetenceBronze();
        this.validate();
    }

    public void changePanelCompetitorsDelegation(){
        jBodyPanel.changePanelCompetitorsDelegation();
        this.validate();
    }

    public void changePanelMedalsDelegation(){
        jBodyPanel.changePanelMedalsDelegation();
        this.validate();
    }

    public void changePanelScore(){
        jBodyPanel.changePanelScore();
        this.validate();
    }

    public String filechooser(){
        return headerPanel.filechooser();
    }

    public void addRowFindCompetitor(Object[] objects){
        jBodyPanel.addRowToFindCOmpetitor(objects);
    }

    public String getNameFindCompetitor(){
        return jBodyPanel.getNameFindCompetitor();
    }

    public String getNameDelegationSearch(){
        return jBodyPanel.getNameDelegationSearch();
    }

    public void cleanTableFindCompetitor(){
        jBodyPanel.cleanTableFindCompetitor();
    }

    public void addRowTableByDelegation(Object[] objects){
        jBodyPanel.addRowTableByDelegation(objects);
    }

    public void cleanTableByDelegation(){
        jBodyPanel.cleanTableByDelegation();
    }

    public String getNameByDelegationSearch(){
        return jBodyPanel.getNameByDelegationSearch();
    }

    public void addRowGold(Object[] objects){
        jBodyPanel.addRowGold(objects);
    }

    public void addRowSilver(Object[] objects){
        jBodyPanel.addRowSilver(objects);
    }

    public void addRowBronze(Object[] objects){
        jBodyPanel.addRowBronze(objects);
    }

    public void addRowTableDelegation(Object[] objects){
        jBodyPanel.addRowTableDelegation(objects);
    }

    public void cleanTableMedalDelegation(){
        jBodyPanel.cleanTableMedalDelegation();
    }

    public void cleanTableGold(){
        jBodyPanel.cleanTableGold();
    }

    public void cleanTableSilver(){
        jBodyPanel.cleanTableSilver();
    }

    public void cleanTableBronze(){
        jBodyPanel.cleanTableBronze();
    }

    public String getCompetenceComboBoxScores(){
        return jBodyPanel.getCompetenceComboBoxScores();
    }

    public String getGenderBoxScore(){
        return jBodyPanel.getGenderBoxScore();
    }

    public void cleanPanelScores(){
        jBodyPanel.cleanPanelScores();
    }

    public void addRowScores(Object[]objects){
        jBodyPanel.addRowScores(objects);
    }

    public void changePanelGolden(){
        jBodyPanel.changePanelGolden();
    }

    public void changePanelExperience(){
        jBodyPanel.changePanelExperience();
    }

    public void addRowExperience(Object[] objects){
        jBodyPanel.addRowExperience(objects);
    }

    public void addRowGoldenBoy(Object[] objects){
        jBodyPanel.addRowGoldenBoy(objects);
    }
}
