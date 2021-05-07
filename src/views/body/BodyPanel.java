package views.body;

import presenter.Presenter;
import views.ConstantsUI;

import javax.swing.*;
import java.awt.*;

public class BodyPanel extends JPanel{

    LeftPanel leftPanel;
    PanelMedals medals;

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

//        this.add(leftPanel,BorderLayout.WEST);
        this.add(rigthPanel,BorderLayout.EAST);
    }

    public void changePanel1(){
        medals.setVisible(false);
        leftPanel.setVisible(true);
        this.add(leftPanel,BorderLayout.WEST);
    }

    public void changePanelInit(){
        leftPanel.setVisible(false);
        medals.setVisible(true);
        this.add(medals,BorderLayout.WEST);
    }


    public void changeLanguage(){

    }
}
