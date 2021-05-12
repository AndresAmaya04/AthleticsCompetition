package views.header;

import presenter.Command;
import presenter.Presenter;
import views.ConstantsUI;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.File;

public class HeaderPanel extends JPanel {

    int widthS = Toolkit.getDefaultToolkit().getScreenSize().width;
    int heightS = Toolkit.getDefaultToolkit().getScreenSize().height;
//    float ws = (float) (widthS*0.30);
    float hs = (float) (heightS*0.11);
    float fWLabel = (float) (widthS*0.25);
    float fHLabel = (float) (heightS*0.10);

    float fWLogo = (float) (widthS*0.06);
    float fHLogo = (float) (heightS*0.08);

    float fWLabelTitel = (float) (widthS*0.45);
    float fHLabelTitel = (float) (heightS*0.10);

    float fWButton = (float) (widthS*0.06);
    float fHButton = (float) (heightS*0.10);

    float fWButtonS = (float) (widthS*0.04);
    float fHButtonS = (float) (heightS*0.05);


    /**
     * Metodo constructor
     */
    public HeaderPanel(Presenter presenter) {

//        this.setFloatable(false);
//        setLayout(new BorderLayout());
//        this.setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
        setPreferredSize(new Dimension(widthS,(int) hs));
        this.setBackground(Color.decode("#276E90"));
        setVisible(true);
        initicomponents(presenter);

    }

    /**
     * Metodo que crea los componentes del panel HeaderPanel
     */
    public void initicomponents(Presenter presenter){
        JLabel jlabel = new JLabel();
        jlabel.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ConstantsUI.PATH_LOGO)).getImage().getScaledInstance((int) fWLogo,(int) fHLogo,Image.SCALE_SMOOTH)));
        jlabel.setPreferredSize(new Dimension((int) fWLabel,(int) fHLabel));

        JLabel jlabelTitle = new JLabel();
        jlabelTitle.setText("Clasica atletica de Duitama");
        jlabelTitle.setPreferredSize(new Dimension((int) fWLabelTitel,(int) fHLabelTitel));
        jlabelTitle.setFont( new Font("Serif", Font.PLAIN, 50));

        JButton jButtonAdd = new JButton();
        jButtonAdd.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ConstantsUI.PATH_BUTTON_ADD)).getImage().getScaledInstance((int) fWButtonS,(int) fHButtonS,Image.SCALE_SMOOTH)));
        jButtonAdd.setPreferredSize(new Dimension((int) fWButton,(int) fHButton));
        jButtonAdd.setBorderPainted(false);
        jButtonAdd.setBackground(Color.decode("#276E90"));
        jButtonAdd.setActionCommand(Command.C_ADD_JSON.toString());
        jButtonAdd.addActionListener(presenter);

//        JButton jButtonAddRunner = new JButton();
//        jButtonAddRunner.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ConstantsUI.PATH_ADD_RUNNER)).getImage().getScaledInstance((int) fWButtonS,(int) fHButtonS,Image.SCALE_SMOOTH)));
//        jButtonAddRunner.setPreferredSize(new Dimension((int) fWButton,(int) fHButton));
////        jlabel.setPreferredSize(new Dimension(1000,100));
//        jButtonAddRunner.setBorderPainted(false);
//        jButtonAddRunner.setBackground(Color.decode("#276E90"));

        JButton toSpanish = new JButton();
        toSpanish.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ConstantsUI.PATH_TO_SPANISH)).getImage().getScaledInstance((int) fWButtonS,(int) fHButtonS,Image.SCALE_SMOOTH)));
        toSpanish.setPreferredSize(new Dimension((int) fWButton,(int) fHButton));
//        jlabel.setPreferredSize(new Dimension(1000,100));
        toSpanish.setBorderPainted(false);
        toSpanish.setBackground(Color.decode("#276E90"));

        JButton toEnglish = new JButton();
        toEnglish.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ConstantsUI.PATH_TO_ENGLISH)).getImage().getScaledInstance((int) fWButtonS,(int) fHButtonS,Image.SCALE_SMOOTH)));
        toEnglish.setPreferredSize(new Dimension((int) fWButton,(int) fHButton));
//        jlabel.setPreferredSize(new Dimension(1000,100));
        toEnglish.setBorderPainted(false);
        toEnglish.setBackground(Color.decode("#276E90"));

        this.add(jlabel,BorderLayout.WEST);
        this.add(jlabelTitle,BorderLayout.CENTER);
        this.add(jButtonAdd);
//        this.add(jButtonAddRunner);
        this.add(toEnglish);
        this.add(toSpanish);
    }

    public void changeLanguage(){

    }

    public String filechooser(){
        JFileChooser fc=new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.json", "json");
        fc.setFileFilter(filter);
        int seleccion=fc.showOpenDialog(this);
        String aux;
        aux = " ";

        if(seleccion==JFileChooser.APPROVE_OPTION){
            File fichero=fc.getSelectedFile();
            aux = fichero.getAbsolutePath();
        }
        return aux;
    }
}
