package views.body;

import views.ConstantsUI;

import javax.swing.*;
import java.awt.*;

public class RigthPanel extends JPanel {
    /**
     * Metodo constructor
     */
    public RigthPanel() {
//        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        this.setBackground(Color.decode("#276E90"));
        this.setPreferredSize(new Dimension(384,870));
        initicomponents();
    }

    /**
     * Metodo que crea los componentes del panel RigthPanel
     */
    public void initicomponents(){
        JLabel jLabelgif = new JLabel();
        jLabelgif.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ConstantsUI.PATH_GIF)).getImage().getScaledInstance(500,300, Image.SCALE_FAST)));

        JButton jButton1 = new JButton("Buscar Informacion de corredor");
        jButton1.setBorderPainted(false);
        jButton1.setBackground(Color.decode("#276E90"));
        jButton1.setFont( new Font("Serif", Font.PLAIN, 25));
        jButton1.setForeground(Color.LIGHT_GRAY);
        jButton1.setPreferredSize(new Dimension(380,50));

        JButton jButton2 = new JButton("Medallas por delegacion");
        jButton2.setBorderPainted(false);
        jButton2.setBackground(Color.decode("#276E90"));
        jButton2.setFont( new Font("Serif", Font.PLAIN, 25));
        jButton2.setForeground(Color.LIGHT_GRAY);
        jButton2.setPreferredSize(new Dimension(380,50));

        JButton jButton3 = new JButton("Horariro por competencia");
        jButton3.setBorderPainted(false);
        jButton3.setBackground(Color.decode("#276E90"));
        jButton3.setFont( new Font("Serif", Font.PLAIN, 25));
        jButton3.setForeground(Color.LIGHT_GRAY);
        jButton3.setPreferredSize(new Dimension(380,50));

        JButton jButton4 = new JButton("Lista de competidores por delegacion");
        jButton4.setBorderPainted(false);
        jButton4.setBackground(Color.decode("#276E90"));
        jButton4.setFont( new Font("Serif", Font.PLAIN, 22));
        jButton4.setForeground(Color.LIGHT_GRAY);
        jButton4.setPreferredSize(new Dimension(380,50));

        JButton jButton5 = new JButton("Horario");
        jButton5.setBorderPainted(false);
        jButton5.setBackground(Color.decode("#276E90"));
        jButton5.setFont( new Font("Serif", Font.PLAIN, 25));
        jButton5.setForeground(Color.LIGHT_GRAY);
        jButton5.setPreferredSize(new Dimension(380,50));

        JButton jButton6 = new JButton("Resultados generales");
        jButton6.setBorderPainted(false);
        jButton6.setBackground(Color.decode("#276E90"));
        jButton6.setFont( new Font("Serif", Font.PLAIN, 25));
        jButton6.setForeground(Color.LIGHT_GRAY);
        jButton6.setPreferredSize(new Dimension(380,50));

        JButton jButton7 = new JButton("Oro por competencia");
        jButton7.setBorderPainted(false);
        jButton7.setBackground(Color.decode("#276E90"));
        jButton7.setFont( new Font("Serif", Font.PLAIN, 25));
        jButton7.setForeground(Color.LIGHT_GRAY);
        jButton7.setPreferredSize(new Dimension(380,50));

        JButton jButton8 = new JButton("Plata por competencias");
        jButton8.setBorderPainted(false);
        jButton8.setBackground(Color.decode("#276E90"));
        jButton8.setFont( new Font("Serif", Font.PLAIN, 25));
        jButton8.setForeground(Color.LIGHT_GRAY);
        jButton8.setPreferredSize(new Dimension(380,50));

        JButton jButton9 = new JButton("Bronce por competencia");
        jButton9.setBorderPainted(false);
        jButton9.setBackground(Color.decode("#276E90"));
        jButton9.setFont( new Font("Serif", Font.PLAIN, 25));
        jButton9.setForeground(Color.LIGHT_GRAY);
        jButton9.setPreferredSize(new Dimension(380,50));

        JButton jButton10 = new JButton("Grafico de barras");
        jButton10.setBorderPainted(false);
        jButton10.setBackground(Color.decode("#276E90"));
        jButton10.setFont( new Font("Serif", Font.PLAIN, 25));
        jButton10.setForeground(Color.LIGHT_GRAY);
        jButton10.setPreferredSize(new Dimension(380,50));

        this.add(jLabelgif);
        this.add(jButton1);
        this.add(jButton2);
        this.add(jButton3);
        this.add(jButton4);
        this.add(jButton5);
        this.add(jButton6);
        this.add(jButton7);
        this.add(jButton8);
        this.add(jButton9);
        this.add(jButton10);

    }
}
