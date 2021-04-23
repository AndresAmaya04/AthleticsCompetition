package presenter;

import model.Competence;
import views.main.JfMainWindow;

public class Presenter {

    JfMainWindow jfMainWindow;
    Competence competence;

    public Presenter() {
        jfMainWindow = new JfMainWindow(this);

    }

    public static void main(String[] args) {
        new Presenter();
    }
}
