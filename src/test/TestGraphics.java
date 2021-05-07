package test;

import model.AthleticsCompetition;
import model.Delegation;
import model.JsonUtilities;
import model.ModelConstants;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TestGraphics extends JPanel {

    public final Color[] colors = {Color.RED, Color.LIGHT_GRAY, Color.black, Color.blue, Color.cyan, Color.darkGray, Color.gray, Color.green, Color.magenta, Color.PINK, Color.orange};

    AthleticsCompetition athleticsCompetition;
    private String[] strings;

    public TestGraphics() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        athleticsCompetition = new AthleticsCompetition();
        this.strings = athleticsCompetition.delegationsNames;
        //athleticsCompetition.fillDelegations(JsonUtilities.readJson(ModelConstants.PATH_JSON));
        athleticsCompetition.setMedalByCompetenceFemale();
        athleticsCompetition.setMedalByCompetenceMale();
        this.setBackground(Color.decode("#114358"));
        setMinimumSize(new Dimension(1200,600));
    }

    public int maxValue(){
        ArrayList<Delegation> delegations = athleticsCompetition.getDelegations();
        for (int i=0; i<delegations.size(); i++){
            delegations.get(i).setMedals();
        }
        int numberMedals = 0;
        for (int i=0; i<delegations.size(); i++){
            numberMedals += delegations.get(i).getMedalsQuantiti();
        }
        return numberMedals;
    }

    @Override
    public void paint(Graphics g) {
        ArrayList<Delegation> delegations = athleticsCompetition.getDelegations();
        super.paint(g);
        int maxValue = maxValue();
        int aumento = 260;
        int grado = 0;
        for (int i=0; i<strings.length; i++){
            for (int j=0; j<delegations.size(); j++){
                int temp = (delegations.get(j).getMedalsQuantiti() * 360)/maxValue;
                if (strings[i].equals(delegations.get(j).getOriginPlace())){
                    g.setColor(colors[i]);
                    g.fillArc(50,250,200,200,grado, temp);
                    g.drawString(strings[i], 300, aumento);
                    grado += temp;
                    aumento += 30;
                }
            }
        }
    }

    public static void main(String[] args) {
        JPanel panel = new TestGraphics();
        JScrollPane scrollPane = new JScrollPane(panel);
        JFrame jFrame = new JFrame();
        jFrame.setMinimumSize(new Dimension(900,400));
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(500,700);
        jFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        jFrame.add(scrollPane);
        jFrame.setVisible(true);
    }
}
