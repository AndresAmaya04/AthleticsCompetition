package views.body;

import model.Gender;
import model.ModelConstants;
import presenter.Command;
import presenter.Presenter;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PanelScores extends JPanel {

    int widthS = Toolkit.getDefaultToolkit().getScreenSize().width;
    int heightS = Toolkit.getDefaultToolkit().getScreenSize().height;
    float ws = (float) (widthS*0.70);
    float hs = (float) (heightS*0.70);

    float wfi = (float) (widthS*0.17);
    float hfi = (float) (heightS*0.05);

    private JLabel label;
    private JButton search;
    private JComboBox<String> stringJComboBox;
    private JComboBox<String> genderComboBox;
    private DefaultTableModel defaultTableModel;
    private JTable jTable;
    private JScrollPane jScrollPane;

    public PanelScores(Presenter presenter) {
        this.setPreferredSize(new Dimension((int)ws,(int)hs));
        this.setBackground(Color.decode("#C4DFE6"));
        initComponents(presenter);
    }

    private void initComponents(Presenter presenter){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel.setBackground(Color.decode("#C4DFE6"));
        label = new JLabel("Ver Tabla de resultados");
        label.setFont(new Font(Font.DIALOG,Font.BOLD,13));
        label.setPreferredSize(new Dimension((int)wfi,(int)hfi));

        panel.add(label);

        stringJComboBox = new JComboBox();
        stringJComboBox.setBackground(Color.decode("#C4DFE6"));
        stringJComboBox.setFont(new Font(Font.DIALOG,Font.BOLD,15));
        stringJComboBox.setPreferredSize(new Dimension((int)wfi,(int)hfi));
        for (int i=0; i<ModelConstants.COMPETENCE_LIST.length; i++){
            stringJComboBox.addItem(ModelConstants.COMPETENCE_LIST[i]);
        }
        stringJComboBox.setBorder(BorderFactory.createTitledBorder("     Ingrese competencia a ver resultados"));
        panel.add(stringJComboBox);

        genderComboBox = new JComboBox();
        genderComboBox.setBackground(Color.decode("#C4DFE6"));
        genderComboBox.addItem(Gender.MALE.getGender());
        genderComboBox.addItem(Gender.FEMALE.getGender());
        genderComboBox.setBorder(BorderFactory.createTitledBorder("    Ingrese genero de la competencia"));
        genderComboBox.setFont(new Font(Font.DIALOG,Font.BOLD,15));
        genderComboBox.setPreferredSize(new Dimension((int)wfi,(int)hfi));
        panel.add(genderComboBox);

        search = new JButton("Buscar");
        search.setFont(new Font(Font.DIALOG,Font.BOLD,15));
        search.setBorderPainted(false);
        search.setBackground(Color.decode("#C4DFE6"));
        search.setPreferredSize(new Dimension((int)wfi,(int)hfi));
        search.addActionListener(presenter);
        search.setActionCommand(Command.SCORE_BUTTON.toString());
        panel.add(search);
        this.add(panel);

        defaultTableModel = new DefaultTableModel();
        String[] headers = {"Posicion","Competencia", "Dorsal", "Nombre", "Apellido", "Genero", "Delegacion"};
        defaultTableModel.setColumnIdentifiers(headers);
        jTable = new JTable();
        jTable.getTableHeader().setBackground(Color.decode("#6FB98F"));
        jTable.getTableHeader().setFont(new Font(Font.DIALOG,Font.BOLD,15));
        jTable.setBackground(Color.decode("#C4DFE6"));
        jTable.setModel(defaultTableModel);
        jTable.setRowHeight(20);
        jScrollPane = new JScrollPane(jTable);
        jScrollPane.getViewport().setBackground(Color.decode("#C4DFE6"));
        jScrollPane.setPreferredSize(new Dimension((int)ws,(int)hs));
        this.add(jScrollPane);
    }

    public String getCompetenceComboBox(){
        return String.valueOf(stringJComboBox.getSelectedItem());
    }

    public String getGenderBox(){
        return String.valueOf(genderComboBox.getSelectedItem());
    }

    public void cleanPanelScores(){
        defaultTableModel.setNumRows(0);
    }

    public void addRowScores(Object[]objects){
        defaultTableModel.addRow(objects);
    }
}