package views.body;

import model.ModelConstants;
import presenter.Command;
import presenter.Presenter;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.function.Predicate;

public class PanelCompetitorsByDelgation extends JPanel{

    private JComboBox<String> stringJComboBox;
    private JButton buttonSearch;
    int widthS = Toolkit.getDefaultToolkit().getScreenSize().width;
    int heightS = Toolkit.getDefaultToolkit().getScreenSize().height;
    float ws = (float) (widthS*0.70);
    float hs = (float) (heightS*0.70);

    float wfi = (float) (widthS*0.23);
    float hfi = (float) (heightS*0.05);

    private DefaultTableModel defaultTableModel;
    private JTable jTable;
    private JScrollPane jScrollPane;

    public PanelCompetitorsByDelgation(Presenter presenter) {
//        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setPreferredSize(new Dimension((int)ws,(int)hs));
        this.setBackground(Color.decode("#C4DFE6"));

        initComponents(presenter);
    }

    private void initComponents(Presenter presenter){
        JPanel panel = new JPanel();
        panel.setBackground(Color.decode("#C4DFE6"));
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        stringJComboBox = new JComboBox();
        stringJComboBox.setBackground(Color.decode("#C4DFE6"));
        for (int i=0; i<ModelConstants.delegationsNames.length; i++){
            stringJComboBox.addItem(ModelConstants.delegationsNames[i]);
        }
        stringJComboBox.setBorder(BorderFactory.createTitledBorder("Seleccione la delegacion a buscar"));
        stringJComboBox.setFont(new Font(Font.DIALOG,Font.BOLD,15));
        stringJComboBox.setPreferredSize(new Dimension((int)wfi,(int)hfi));
        panel.add(stringJComboBox);

        buttonSearch = new JButton("Buscar");
        buttonSearch.setFont(new Font(Font.DIALOG,Font.BOLD,15));
        buttonSearch.setBorderPainted(false);
        buttonSearch.setBackground(Color.decode("#C4DFE6"));
        buttonSearch.setPreferredSize(new Dimension((int)wfi,(int)hfi));
        buttonSearch.setActionCommand(Command.SEARCH_DELEGATION_LIST.toString());
        buttonSearch.addActionListener(presenter);
        panel.add(buttonSearch);

        this.add(panel);
        defaultTableModel = new DefaultTableModel();
        String[] headers = {"Competencia", "Dorsal", "Nombre", "Apellido", "Genero", "Delegacion"};
        defaultTableModel.setColumnIdentifiers(headers);
        jTable = new JTable();
        jTable.setModel(defaultTableModel);
        jTable.getTableHeader().setBackground(Color.decode("#6FB98F"));
        jTable.getTableHeader().setFont(new Font(Font.DIALOG,Font.BOLD,12));;
        jTable.setBackground(Color.decode("#C4DFE6"));
        jTable.setRowHeight(20);
        jScrollPane = new JScrollPane(jTable);
        jScrollPane.getViewport().setBackground(Color.decode("#C4DFE6"));
        jScrollPane.setPreferredSize(new Dimension((int)ws,(int)hs));
        this.add(jScrollPane);
    }

    public String getNameByDelegationSearch(){
        return String.valueOf(this.stringJComboBox.getSelectedItem());
    }

    public void addRowTableByDelegation(Object[] objects){
        defaultTableModel.addRow(objects);
    }

    public void cleanTableByDelegation(){
        defaultTableModel.setNumRows(0);
    }
}
