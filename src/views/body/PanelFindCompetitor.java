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

    float wfi = (float) (widthS*0.23);
    float hfi = (float) (heightS*0.05);

    private JLabel label;
    private JButton search;
    private JTextField textField;
    private DefaultTableModel defaultTableModel;
    private JTable jTable;
    private JScrollPane jScrollPane;

    public PanelFindCompetitor(Presenter presenter) {
//        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        initComponents(presenter);
        this.setPreferredSize(new Dimension((int)ws,(int)hs));
        this.setBackground(Color.decode("#C4DFE6"));
    }

    private void initComponents(Presenter presenter){
        JPanel panel = new JPanel();
        panel.setBackground(Color.decode("#C4DFE6"));
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));

        label = new JLabel("Busca un jugaor");
        label.setFont(new Font(Font.DIALOG,Font.BOLD,15));
        label.setPreferredSize(new Dimension((int)wfi,(int)hfi));
        panel.add(label);

        textField = new JTextField();
        textField.setBackground(Color.decode("#C4DFE6"));
        textField.setBorder(BorderFactory.createTitledBorder("Ingrese nombre o apellido del jugador"));
        textField.setFont(new Font(Font.DIALOG,Font.BOLD,15));
        textField.setPreferredSize(new Dimension((int)wfi,(int)hfi));
        panel.add(textField);

        search = new JButton("Buscar");
        search.setFont(new Font(Font.DIALOG,Font.BOLD,15));
        search.setBorderPainted(false);
        search.setBackground(Color.decode("#C4DFE6"));
        search.addActionListener(presenter);
        search.setActionCommand(Command.SEARCH_INFO_COMPETITOR.toString());
        search.setPreferredSize(new Dimension((int)wfi,(int)hfi));
        panel.add(search);
        this.add(panel);

        defaultTableModel = new DefaultTableModel();
        String[] headers = {"Competencia", "Dorsal", "Nombre", "Apellido", "Genero", "Delegacion"};
        defaultTableModel.setColumnIdentifiers(headers);
        jTable = new JTable();
        jTable.getTableHeader().setBackground(Color.decode("#6FB98F"));
        jTable.getTableHeader().setFont(new Font(Font.DIALOG,Font.BOLD,15));;
        jTable.setBackground(Color.decode("#C4DFE6"));
        jTable.setModel(defaultTableModel);
        jTable.setRowHeight(20);
        jScrollPane = new JScrollPane(jTable);
        jScrollPane.getViewport().setBackground(Color.decode("#C4DFE6"));
        jScrollPane.setPreferredSize(new Dimension((int)ws,(int)hs));
        this.add(jScrollPane);
    }

    public String getNameCompetitor(){
        return textField.getText();
    }

    public void addRowToFindCompetitor(Object[] objects){
        defaultTableModel.addRow(objects);
    }

    public void cleanTableFindCompetitor(){
        defaultTableModel.setNumRows(0);
    }
}
