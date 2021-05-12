package presenter;

import Persistence.HandlerLanguage;
import model.*;
import views.JPanelGraphics;
import views.main.JfMainWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class Presenter implements ActionListener {

    JfMainWindow jfMainWindow;
    JsonUtilities jsonUtilities;
    AthleticsCompetition athleticsCompetition;
<<<<<<< HEAD
    JPanelGraphics panelGraphics;
=======
    HandlerLanguage handlerLanguage;
>>>>>>> 7472ff1dec1bd407234a1c17af5fb083f0a48546

    public Presenter() {
        athleticsCompetition = new AthleticsCompetition();
        jfMainWindow = new JfMainWindow(this);
        jsonUtilities = new JsonUtilities();
    }

    public static void main(String[] args) {
        new  Presenter();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (Command.valueOf( e.getActionCommand())) {
            case C_ADD_JSON:
                addDoc();
                break;
            case C_ADD_RUNNER:
                break;
            case C_CHANGE_SPANISH:
                break;
            case C_CHANGE_ENGLISH:
                jfMainWindow.changeLanguage();
                break;
            case C_INFO_RUNNER:
                jfMainWindow.changePanelFindCompetitor();
                break;
            case C_MEDALS_DELEGATIONS:
                jfMainWindow.changePanelMedalsDelegation();
                break;
            case C_SCHEDULE_PER_COMPETENCE:
                jfMainWindow.changePanelExperience();
                Competitor[] competitorsPrice = athleticsCompetition.getGoldenGayAndExperiencePrice();
                jfMainWindow.addRowExperience(competitorsPrice[1].getCompetitorInfoForMedals());
                break;
            case C_LIST_COMPETITOR:
                jfMainWindow.changePanelCompetitorsDelegation();
                break;
            case C_SCHEDULE:
                break;
            case C_GENERAL_RESULTS:
                jfMainWindow.changePanelScore();
                break;
            case C_GOLDS:
                jfMainWindow.changePanelMedalsCompetenceGold();
                jfMainWindow.cleanTableGold();
                ArrayList<Competitor> competitorsGold = athleticsCompetition.extractGoldWinners();
                for (Competitor competitor: competitorsGold){
                    jfMainWindow.addRowGold(competitor.getCompetitorInfoForMedals());
                }
                break;
            case C_SILVERS:
                jfMainWindow.changePanelMedalsCompetenceSilver();
                jfMainWindow.cleanTableSilver();
                ArrayList<Competitor> competitorsSilver = athleticsCompetition.extractSilverWinners();
                for (Competitor competitor: competitorsSilver){
                    jfMainWindow.addRowSilver(competitor.getCompetitorInfoForMedals());
                }
                break;
            case C_BRONZE:
                jfMainWindow.changePanelMedalsCompetenceBronze();
                jfMainWindow.cleanTableBronze();
                ArrayList<Competitor> competitorsBronze = athleticsCompetition.extractBronzeWinners();
                for (Competitor competitor: competitorsBronze){
                    jfMainWindow.addRowBronze(competitor.getCompetitorInfoForMedals());
                }
                break;
            case C_BAR_GRAPHIC:
                break;
            case SEARCH_INFO_COMPETITOR:
                jfMainWindow.cleanTableFindCompetitor();
                ArrayList<Object[]> competitors = athleticsCompetition.findCompetitor(jfMainWindow.getNameFindCompetitor());
                for (int i=0; i<competitors.size(); i++){
                    jfMainWindow.addRowToFindCompetitor(competitors.get(i));
                }
                break;
            case SEARCH_DELEGATION_LIST:
                jfMainWindow.cleanTableByDelegation();
                ArrayList<Object[]> competitorsDelegation = athleticsCompetition.getListOfCompetitorsByDelegation(jfMainWindow.getNameByDelegationSearch());
                for (Object[] competitor: competitorsDelegation){
                    jfMainWindow.addRowTableByDelegation(competitor);
                }
                break;
            case SCORE_BUTTON:
                jfMainWindow.cleanPanelScores();
                ArrayList<Competitor> competitorsScore = athleticsCompetition.getOrderOfCompetition(jfMainWindow.getCompetenceComboBoxScores(), jfMainWindow.getGenderBoxScore());
                for (int i=0; i<competitorsScore.size(); i++){
                    Object[] info = new Object[]{i+1, null, null, null, null, null, null};
                    System.arraycopy(competitorsScore.get(i).getCompetitorInfoPanelScores(), 0, info, 1, competitorsScore.get(i).getCompetitorInfoPanelScores().length);
                    jfMainWindow.addRowScores(info);
                }
                break;
            case GOLDEN_BOY:
                jfMainWindow.changePanelGolden();
                Competitor[] competitorsPrice1 = athleticsCompetition.getGoldenGayAndExperiencePrice();
                jfMainWindow.addRowGold(competitorsPrice1[0].getCompetitorInfoForMedals());
                break;
            case C_SEARCH_MEDALS_DELEGATION:
                jfMainWindow.cleanTableMedalDelegation();
                athleticsCompetition.medalForDelegation(jfMainWindow.getNameDelegationSearch());
                for (int i = 0; i < athleticsCompetition.medalForDelegation(jfMainWindow.getNameDelegationSearch()).size(); i++) {
                    jfMainWindow.addRowTableDelegation(athleticsCompetition.medalForDelegation(jfMainWindow.getNameDelegationSearch()).get(i));
                }
            case C_GRAPHICS:
                panelGraphics = new JPanelGraphics(athleticsCompetition.sumMedals(), athleticsCompetition.getDelegations(), ModelConstants.delegationsNames);
                jfMainWindow.changePanelGraphics(panelGraphics);
                break;
            default:
                break;
        }
    }

    private void manageChangeLanguage(){
        jfMainWindow.changeLanguage();
    }

    private void manageChangeLanguageES(){
        try {
            changeToSpanish();
        } catch (IOException e1) {
            JOptionPane.showMessageDialog(jfMainWindow, e1.getMessage());
        }
        manageChangeLanguage();
    }

    public void changeToSpanish() throws IOException{
        HandlerLanguage.language = "resources/languages/languageES.properties";
        saveConfig();
        loadLanguage();
    }

    public void saveConfig(){
        try {
            new HandlerLanguage("resources/config/config.init").saveLanguage();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(jfMainWindow, e.getMessage());
        }
    }

    public void loadLanguage(){
        try {
            handlerLanguage.loadLanguage();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(jfMainWindow, e.getMessage());
        }
    }

    public void addDoc(){
        String auxPath = jfMainWindow.filechooser();
        String auxPathDoc2 = jfMainWindow.filechooser();
        jsonUtilities.setPathCompetences(auxPathDoc2);
        athleticsCompetition.fillDelegations(jsonUtilities.readJson(auxPath));
        athleticsCompetition.setMedalByCompetenceMale();
        athleticsCompetition.setMedalByCompetenceFemale();
        athleticsCompetition.setMedalsToAllDelegations();
    }
}
