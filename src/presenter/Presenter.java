package presenter;

import model.Competence;
import model.JsonUtilities;
import views.main.JfMainWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Presenter implements ActionListener {

    JfMainWindow jfMainWindow;
    Competence competence;
    JsonUtilities jsonUtilities;

    public Presenter() {
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
                break;
            case C_INFO_RUNNER:
            jfMainWindow.changePanelInit();
                break;
            case C_MEDALS_DELEGATIONS:
                jfMainWindow.changePanel1();
                break;
            case C_SCHEDULE_PER_COMPETENCE:
                break;
            case C_SCHEDULE:
                break;
            case C_GENERAL_RESULTS:
                break;
            case C_GOLDS:
                break;
            case C_SILVERS:
                break;
            case C_BRONZE:
                break;
            case C_BAR_GRAPHIC:
                break;
            case SEARCH_INFO_COMPETITOR:
                break;
            case SEARCH_DELEGATION_LIST:
                break;
            default:
                break;
        }
    }

    public void addDoc(){
        String auxPath = jfMainWindow.filechooser();
        String auxPathDoc2 = jfMainWindow.filechooser();
        jsonUtilities.setPathCompetences(auxPathDoc2);
        jsonUtilities.readJson(auxPath);
//            managerFiles = new ManagerFiles(auxPath);
//            startFile(mngFile);

    }
}
