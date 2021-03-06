package views.body;

import model.Medal;
import model.ModelConstants;
import presenter.Command;
import presenter.Presenter;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PanelMedalsByCompetence extends JPanel {

    int widthS = Toolkit.getDefaultToolkit().getScreenSize().width;
    int heightS = Toolkit.getDefaultToolkit().getScreenSize().height;
    float ws = (float) (widthS*0.70);
    float hs = (float) (heightS*0.70);

    float wfi = (float) (widthS*0.23);
    float hfi = (float) (heightS*0.05);

    private JLabel label;
    private DefaultTableModel defaultTableModel;
    private JTable jTable;
    private JScrollPane jScrollPane;

    public PanelMedalsByCompetence(Presenter presenter, String medal) {
//        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setPreferredSize(new Dimension((int)ws,(int)hs));
        this.setBackground(Color.decode("#C4DFE6"));
        initComponents(presenter, medal);
    }

    private void initComponents(Presenter presenter, String medal){
        JPanel panel = new JPanel();
        panel.setBackground(Color.decode("#C4DFE6"));
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        label = new JLabel("Medallas de "+ medal+ " cada competencia");
        label.setFont(new Font(Font.MONOSPACED,Font.BOLD,30));
//        label.setPreferredSize(new Dimension((int)wfi,(int)hfi));
        panel.add(label);
        this.add(panel);

        defaultTableModel = new DefaultTableModel();
        String[] headers = {"Competencia", "Dorsal", "Nombre", "Apellido", "Genero", "Delegacion", "Medalla"};
        defaultTableModel.setColumnIdentifiers(headers);
        jTable = new JTable();
        jTable.getTableHeader().setBackground(Color.decode("#6FB98F"));
        jTable.getTableHeader().setFont(new Font(Font.DIALOG,Font.BOLD,13));
        jTable.setBackground(Color.decode("#C4DFE6"));
        jTable.setModel(defaultTableModel);
        jTable.setRowHeight(20);
        jScrollPane = new JScrollPane(jTable);
        jScrollPane.getViewport().setBackground(Color.decode("#C4DFE6"));
        jScrollPane.setPreferredSize(new Dimension((int)ws,(int)hs));
        this.add(jScrollPane);
    }

    public void addRowToMedals(Object[] objects){
        defaultTableModel.addRow(objects);
    }

    public void cleanTableMedals(){
        defaultTableModel.setNumRows(0);
    }
}
