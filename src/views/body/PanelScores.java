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
    private JLabel label;
    private JButton search;
    private JComboBox<String> stringJComboBox;
    private DefaultTableModel defaultTableModel;
    private JTable jTable;
    private JScrollPane jScrollPane;

    public PanelScores(Presenter presenter) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        initComponents(presenter);
        this.setPreferredSize(new Dimension((int)ws,(int)hs));
    }

    private void initComponents(Presenter presenter){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0,3));
        label = new JLabel("Ver Tabla de resultados");
        panel.add(label);
        stringJComboBox = new JComboBox();
        for (int i=0; i<ModelConstants.delegationsNames.length; i++){
            stringJComboBox.addItem(ModelConstants.delegationsNames[i]);
        }
        stringJComboBox.setBorder(BorderFactory.createTitledBorder("Ingrese competencia a ver resultados"));
        panel.add(stringJComboBox);
        search = new JButton("Buscar");
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
        this.add(jScrollPane);
    }

    public String getCompetenceComboBox(){
        return String.valueOf(stringJComboBox.getSelectedItem());
    }
}
