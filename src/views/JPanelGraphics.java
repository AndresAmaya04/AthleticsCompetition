package views;

import model.Delegation;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class JPanelGraphics extends JPanel {

    int widthS = Toolkit.getDefaultToolkit().getScreenSize().width;
    int heightS = Toolkit.getDefaultToolkit().getScreenSize().height;
    float ws = (float) (widthS*0.70);
    float hs = (float) (heightS*0.70);

    float wfi = (float) (widthS*0.23);
    float hfi = (float) (heightS*0.05);
    public final Color[] colors = {Color.RED, Color.LIGHT_GRAY, Color.black, Color.blue, Color.cyan, Color.darkGray, Color.gray, Color.green, Color.magenta, Color.PINK, Color.orange};

    private int totalMedals;
    private ArrayList<Delegation> delegations;
    private String[] listCompetences;

    public JPanelGraphics(int totalMedals, ArrayList<Delegation> delegations, String[] listCompetences) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(Color.decode("#114358"));
        this.setPreferredSize(new Dimension((int)ws,(int)hs));
        this.totalMedals=totalMedals;
        this.delegations=delegations;
        this.listCompetences=listCompetences;
    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);
        int aumento = 260;
        int grado = 0;
        for (int i=0; i<listCompetences.length; i++){
            for (int j=0; j<delegations.size(); j++){
                int temp = (delegations.get(j).getMedalsQuantiti()*360)/this.totalMedals;
                if (listCompetences[i].equals(delegations.get(j).getOriginPlace())){
                    g.setColor(colors[i]);
                    g.fillArc(50,250,200,200,grado, temp);
                    g.drawString(listCompetences[i], 300, aumento);
                    grado += temp;
                    aumento += 30;
                }
            }
        }
    }
}
