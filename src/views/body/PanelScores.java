package views.body;

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

    float wfi = (float) (widthS*0.23);
    float hfi = (float) (heightS*0.05);

    private JLabel label;
    private JButton search;
    private JComboBox<String> stringJComboBox;
    private DefaultTableModel defaultTableModel;
    private JTable jTable;
    private JScrollPane jScrollPane;

    public PanelScores(Presenter presenter) {
//        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setPreferredSize(new Dimension((int)ws,(int)hs));
        this.setBackground(Color.black);
        initComponents(presenter);
    }

    private void initComponents(Presenter presenter){
        JPanel panel = new JPanel();
//        panel.setLayout(new GridLayout(0,3));
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel.setBackground(Color.decode("#C4DFE6"));
//        panel.setPreferredSize(new Dimension((int)wfi,(int) (heightS*0.01)));
        label = new JLabel("Ver Tabla de resultados");
        label.setPreferredSize(new Dimension((int)wfi,(int)hfi));

        panel.add(label);

        stringJComboBox = new JComboBox();
        stringJComboBox.setBackground(Color.decode("#C4DFE6"));
        stringJComboBox.setPreferredSize(new Dimension((int)wfi,(int)hfi));
        for (int i=0; i<ModelConstants.COMPETENCE_LIST.length; i++){
            stringJComboBox.addItem(ModelConstants.COMPETENCE_LIST[i]);
        }
        stringJComboBox.setBorder(BorderFactory.createTitledBorder("     Ingrese competencia a ver resultados"));
        panel.add(stringJComboBox);

        search = new JButton("Buscar");
        search.setBorderPainted(false);
        search.setBackground(Color.decode("#C4DFE6"));
        search.setPreferredSize(new Dimension((int)wfi,(int)hfi));
        search.addActionListener(presenter);
        search.setActionCommand(Command.SEARCH_INFO_COMPETITOR.toString());
        panel.add(search);
        this.add(panel);

        defaultTableModel = new DefaultTableModel();
        String[] headers = {"Posicion","Competencia", "Dorsal", "Nombre", "Apellido", "Genero", "Delegacion"};
        defaultTableModel.setColumnIdentifiers(headers);
        jTable = new JTable();
        jTable.setModel(defaultTableModel);
        jTable.setRowHeight(20);
        jScrollPane = new JScrollPane(jTable);
        jScrollPane.setPreferredSize(new Dimension((int)ws,(int)hs));
        this.add(jScrollPane);
    }

    public String getCompetenceComboBox(){
        return String.valueOf(stringJComboBox.getSelectedItem());
    }
}