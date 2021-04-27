package views.header;

import views.ConstantsUI;

import javax.swing.*;
import java.awt.*;

public class HeaderPanel extends JPanel {
    /**
     * Metodo constructor
     */
    public HeaderPanel() {
//        this.setFloatable(false);
//        setLayout(new BorderLayout());
        this.setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
        setPreferredSize(new Dimension(1917,150));
        this.setBackground(Color.decode("#276E90"));
        setVisible(true);
        initicomponents();

    }

    /**
     * Metodo que crea los componentes del panel HeaderPanel
     */
    public void initicomponents(){
        JLabel jlabel = new JLabel();
        jlabel.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ConstantsUI.PATH_LOGO)).getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH)));
//        jlabel.setPreferredSize(new Dimension(1000,100));
//        jlabel.set

        JLabel jlabelTitle = new JLabel();
        jlabelTitle.setText("Clasica atletica de Duitama");
        jlabelTitle.setFont( new Font("Serif", Font.PLAIN, 50));

        JButton jButtonAdd = new JButton();
        jButtonAdd.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ConstantsUI.PATH_BUTTON_ADD)).getImage().getScaledInstance(60,60,Image.SCALE_SMOOTH)));
//        jlabel.setPreferredSize(new Dimension(1000,100));
        jButtonAdd.setBorderPainted(false);
        jButtonAdd.setBackground(Color.decode("#276E90"));

        JButton jButtonAddRunner = new JButton();
        jButtonAddRunner.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ConstantsUI.PATH_ADD_RUNNER)).getImage().getScaledInstance(60,60,Image.SCALE_SMOOTH)));
//        jlabel.setPreferredSize(new Dimension(1000,100));
        jButtonAddRunner.setBorderPainted(false);
        jButtonAddRunner.setBackground(Color.decode("#276E90"));

        JButton toSpanish = new JButton();
        toSpanish.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ConstantsUI.PATH_TO_SPANISH)).getImage().getScaledInstance(60,60,Image.SCALE_SMOOTH)));
//        jlabel.setPreferredSize(new Dimension(1000,100));
        toSpanish.setBorderPainted(false);
        toSpanish.setBackground(Color.decode("#276E90"));

        JButton toEnglish = new JButton();
        toEnglish.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ConstantsUI.PATH_TO_ENGLISH)).getImage().getScaledInstance(60,60,Image.SCALE_SMOOTH)));
//        jlabel.setPreferredSize(new Dimension(1000,100));
        toEnglish.setBorderPainted(false);
        toEnglish.setBackground(Color.decode("#276E90"));

        this.add(Box.createRigidArea(new Dimension(10,100)));
        this.add(jlabel,BorderLayout.WEST);
        this.add(Box.createRigidArea(new Dimension(530,100)));
        this.add(jlabelTitle,BorderLayout.CENTER);
        this.add(Box.createRigidArea(new Dimension(370,100)));
        this.add(jButtonAdd);
        this.add(jButtonAddRunner);
        this.add(toEnglish);
        this.add(toSpanish);
    }

    public void changeLanguage(){

    }
}
