package views.body;

import presenter.Presenter;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PanelPrice extends JPanel {

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

    public PanelPrice(Presenter presenter, String price) {
//        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setPreferredSize(new Dimension((int)ws,(int)hs));
        initComponents(presenter, price);
    }

    private void initComponents(Presenter presenter, String price){
        JPanel panel = new JPanel();
        panel.setBackground(Color.decode("#C4DFE6"));
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        label = new JLabel("Ganador del " + price);
        label.setPreferredSize(new Dimension((int)wfi,(int)hfi));
        panel.add(label);
        this.add(panel);

        defaultTableModel = new DefaultTableModel();
        String[] headers = {"Competencia", "Dorsal", "Nombre", "Apellido", "Genero", "Delegacion", "Medalla"};
        defaultTableModel.setColumnIdentifiers(headers);
        jTable = new JTable();
        jTable.setModel(defaultTableModel);
        jTable.setRowHeight(20);
        jScrollPane = new JScrollPane(jTable);
        jScrollPane.setPreferredSize(new Dimension((int)ws,(int)hs));
        this.add(jScrollPane);
    }

    public void addRowToMedals(Object[] objects){
        defaultTableModel.addRow(objects);
    }
}
