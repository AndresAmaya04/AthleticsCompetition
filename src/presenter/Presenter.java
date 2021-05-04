package presenter;

import model.Competence;
import views.main.JfMainWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Presenter implements ActionListener {

    JfMainWindow jfMainWindow;
    Competence competence;

    public Presenter() {
        jfMainWindow = new JfMainWindow(this);

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
                break;
            case C_MEDALS_DELEGATIONS:
                break;

            default:
                break;
        }
    }

    public void addDoc(){
        String auxPath = jfMainWindow.filechooser();
//            managerFiles = new ManagerFiles(auxPath);
//            startFile(mngFile);

    }
}
