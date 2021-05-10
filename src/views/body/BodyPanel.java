package views.body;

import presenter.Presenter;
import views.ConstantsUI;

import javax.swing.*;
import java.awt.*;

public class BodyPanel extends JPanel{

    LeftPanel leftPanel;
    PanelMedals medals;
    private PanelFindCompetitor panelFindCompetitor;
    private PanelCompetitorsByDelgation panelCompetitorsByDelgation;
    private PanelMedalsByCompetence panelMedalsByCompetenceGold;
    private PanelMedalsByCompetence panelMedalsByCompetenceBronze;
    private PanelMedalsByCompetence panelMedalsByCompetenceSilver;
    private PanelScores panelScores;


    public BodyPanel(Presenter presenter) {
        this.setBackground(Color.decode("#A9A9A9"));
        int widthS = Toolkit.getDefaultToolkit().getScreenSize().width;
        int heightS = Toolkit.getDefaultToolkit().getScreenSize().height;
        float ws = (float) (widthS*0.70);
        float hs = (float) (heightS*0.70);
        this.setPreferredSize(new Dimension(widthS,(int)hs));

        this.setLayout(new BorderLayout());
//        this.setBackground(Color.BLACK);
//        this.setBounds(0,0,10,10);
        initicomponents(presenter);
    }

    public void initicomponents(Presenter presenter){
         leftPanel = new LeftPanel();
         medals = new PanelMedals();
        RigthPanel rigthPanel = new RigthPanel(presenter);
        panelFindCompetitor = new PanelFindCompetitor(presenter);
        panelCompetitorsByDelgation = new PanelCompetitorsByDelgation(presenter);
        //panelMedals = new PanelMedals();
        panelMedalsByCompetenceGold = new PanelMedalsByCompetence(presenter, "Oro");
        panelMedalsByCompetenceBronze = new PanelMedalsByCompetence(presenter, "Bronce");
        panelMedalsByCompetenceSilver = new PanelMedalsByCompetence(presenter, "Plata");
        panelScores = new PanelScores(presenter);
        panelScores = new PanelScores(presenter);

//        this.add(leftPanel,BorderLayout.WEST);
        this.add(rigthPanel,BorderLayout.EAST);
    }

    public void changePanel1(){
        medals.setVisible(false);
        panelFindCompetitor.setVisible(false);
        panelCompetitorsByDelgation.setVisible(false);
        panelMedalsByCompetenceGold.setVisible(false);
        panelMedalsByCompetenceBronze.setVisible(false);
        panelMedalsByCompetenceSilver.setVisible(false);
        panelScores.setVisible(false);
        leftPanel.setVisible(true);
        this.add(leftPanel,BorderLayout.WEST);
    }

    public void changePanelInit(){
        leftPanel.setVisible(false);
        panelFindCompetitor.setVisible(false);
        panelCompetitorsByDelgation.setVisible(false);
        panelMedalsByCompetenceGold.setVisible(false);
        panelMedalsByCompetenceBronze.setVisible(false);
        panelMedalsByCompetenceSilver.setVisible(false);
        panelScores.setVisible(false);
        medals.setVisible(true);
        this.add(medals,BorderLayout.WEST);
    }

    public void chanPanelFindCompetitor(){
        leftPanel.setVisible(false);
        panelCompetitorsByDelgation.setVisible(false);
        panelMedalsByCompetenceGold.setVisible(false);
        panelMedalsByCompetenceBronze.setVisible(false);
        panelMedalsByCompetenceSilver.setVisible(false);
        panelScores.setVisible(false);
        medals.setVisible(false);
        panelFindCompetitor.setVisible(true);
        this.add(panelFindCompetitor, BorderLayout.WEST);
    }

    public void changePanelCompetitorsDelegation(){
        leftPanel.setVisible(false);
        panelMedalsByCompetenceGold.setVisible(false);
        panelMedalsByCompetenceBronze.setVisible(false);
        panelMedalsByCompetenceSilver.setVisible(false);
        panelScores.setVisible(false);
        medals.setVisible(false);
        panelFindCompetitor.setVisible(false);
        panelCompetitorsByDelgation.setVisible(true);
        this.add(panelCompetitorsByDelgation, BorderLayout.WEST);
    }

    public void changePanelMedalsCompetenceGold(){
        leftPanel.setVisible(false);
        panelCompetitorsByDelgation.setVisible(false);
        panelFindCompetitor.setVisible(false);
        panelScores.setVisible(false);
        medals.setVisible(false);
        panelMedalsByCompetenceBronze.setVisible(false);
        panelMedalsByCompetenceSilver.setVisible(false);
        panelMedalsByCompetenceGold.setVisible(true);
        this.add(panelMedalsByCompetenceGold, BorderLayout.WEST);
    }

    public void changePanelMedalsCompetenceSilver(){
        leftPanel.setVisible(false);
        panelCompetitorsByDelgation.setVisible(false);
        panelFindCompetitor.setVisible(false);
        panelScores.setVisible(false);
        medals.setVisible(false);
        panelMedalsByCompetenceBronze.setVisible(false);
        panelMedalsByCompetenceGold.setVisible(false);
        panelMedalsByCompetenceSilver.setVisible(true);
        this.add(panelMedalsByCompetenceSilver, BorderLayout.WEST);
    }

    public void changePanelMedalsCompetenceBronze(){
        leftPanel.setVisible(false);
        panelCompetitorsByDelgation.setVisible(false);
        panelFindCompetitor.setVisible(false);
        panelScores.setVisible(false);
        medals.setVisible(false);
        panelMedalsByCompetenceSilver.setVisible(false);
        panelMedalsByCompetenceGold.setVisible(false);
        panelMedalsByCompetenceBronze.setVisible(true);
        this.add(panelMedalsByCompetenceBronze, BorderLayout.WEST);
    }

    public void changePanelScore(){
        leftPanel.setVisible(false);
        panelCompetitorsByDelgation.setVisible(false);
        panelFindCompetitor.setVisible(false);
        panelMedalsByCompetenceGold.setVisible(false);
        panelMedalsByCompetenceBronze.setVisible(false);
        panelMedalsByCompetenceSilver.setVisible(false);
        medals.setVisible(false);
        panelScores.setVisible(true);
        this.add(panelScores, BorderLayout.WEST);
    }

    public void changeLanguage(){

    }
}
