package views.body;

import presenter.Command;
import presenter.Presenter;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PanelFindCompetitor extends JPanel {

    int widthS = Toolkit.getDefaultToolkit().getScreenSize().width;
    int heightS = Toolkit.getDefaultToolkit().getScreenSize().height;
    float ws = (float) (widthS*0.70);
    float hs = (float) (heightS*0.70);
    private JLabel label;
    private JButton search;
    private JTextField textField;
    private DefaultTableModel defaultTableModel;
    private JTable jTable;
    private JScrollPane jScrollPane;

    public PanelFindCompetitor(Presenter presenter) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        initComponents(presenter);
        this.setPreferredSize(new Dimension((int)ws,(int)hs));
    }

    private void initComponents(Presenter presenter){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0,3));
        label = new JLabel("Busca un jugaor");
        panel.add(label);
        textField = new JTextField();
        textField.setBorder(BorderFactory.createTitledBorder("Ingrese nombre o apellido del jugador"));
        panel.add(textField);
        search = new JButton("Buscar");
        search.addActionListener(presenter);
        search.setActionCommand(Command.SEARCH_INFO_COMPETITOR.toString());
        panel.add(search);
        this.add(panel);
        defaultTableModel = new DefaultTableModel();
        String[] headers = {"Competencia", "Dorsal", "Nombre", "Apellido", "Genero", "Delegacion"};
        defaultTableModel.setColumnIdentifiers(headers);
        jTable = new JTable();
        jTable.setModel(defaultTableModel);
        jTable.setRowHeight(20);
        jScrollPane = new JScrollPane(jTable);
        this.add(jScrollPane);
    }

    public String getNameCompetitor(){
        return textField.getText();
    }
}
