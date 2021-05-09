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
    private JComboBox<String> medals;
    private JButton button;
    private DefaultTableModel defaultTableModel;
    private JTable jTable;
    private JScrollPane jScrollPane;

    public PanelMedalsByCompetence(Presenter presenter) {
//        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setPreferredSize(new Dimension((int)ws,(int)hs));
        initComponents(presenter);
    }

    private void initComponents(Presenter presenter){
        JPanel panel = new JPanel();
        panel.setBackground(Color.decode("#C4DFE6"));
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        label = new JLabel("Medallas de cada competencia");
        label.setPreferredSize(new Dimension((int)wfi,(int)hfi));
        panel.add(label);
        medals  = new JComboBox();
        medals.setBackground(Color.decode("#C4DFE6"));
        medals.setBorder(BorderFactory.createTitledBorder("Seleccione una medalla"));
        medals.setPreferredSize(new Dimension((int)wfi,(int)hfi));
        panel.add(medals);
        for (int i=0; i<ModelConstants.MEDALS.length; i++){
            medals.addItem(ModelConstants.MEDALS[i]);
        }

        button = new JButton("Buscar");
        button.setBorderPainted(false);
        button.setBackground(Color.decode("#C4DFE6"));
        button.addActionListener(presenter);
        button.setActionCommand(Command.C_MEDALS_DELEGATIONS.toString());
        button.setPreferredSize(new Dimension((int)wfi,(int)hfi));
        panel.add(button);
        this.add(panel);

        defaultTableModel = new DefaultTableModel();
        String[] headers = {"Competencia", "Dorsal", "Nombre", "Apellido", "Genero", "Delegacion"};
        defaultTableModel.setColumnIdentifiers(headers);
        jTable = new JTable();
        jTable.setModel(defaultTableModel);
        jTable.setRowHeight(20);
        jScrollPane = new JScrollPane(jTable);
        jScrollPane.setPreferredSize(new Dimension((int)ws,(int)hs));
        this.add(jScrollPane);
    }

    public String getItemComboBox(){
        return String.valueOf(this.medals.getSelectedItem());
    }
}
