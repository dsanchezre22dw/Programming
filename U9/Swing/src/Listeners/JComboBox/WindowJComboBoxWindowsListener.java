package Listeners.JComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowJComboBoxWindowsListener extends JFrame implements ActionListener {
    private JLabel outputText;

    private JComboBox combo;
    private DefaultComboBoxModel model;


    public WindowJComboBoxWindowsListener() {
        Container p = this.getContentPane();

        this.setTitle("Prueba JButtons");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                manager.close(); // Closing database
            }
        });

        manager = new PhotographerManager(); // Initializing database*/

        p.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Ventana de prueba");


        JPanel panelCentro = new JPanel();
        panelCentro.setLayout(new BoxLayout(panelCentro, BoxLayout.Y_AXIS));
        panelCentro.setBackground(Color.BLUE);
        addComponentsToCneter(panelCentro);

        outputText = new JLabel();
        outputText.setPreferredSize(new Dimension(120, 40));

        p.add("North", titulo);
        p.add("Center", panelCentro);
        p.add("South", outputText);

        this.setVisible(true);
        this.setSize(300, 200);
    }

    public void addComponentsToCneter(Container p) {
        combo = new JComboBox();
        model = new DefaultComboBoxModel();

        combo.setModel(model);

        model.addElement(new Band("Taylor Swift", "Fearless"));
        model.addElement(new Band("Eminem", "The Marshall Matters"));
        model.addElement(new Band("Muse", "Supermassive Black Hole"));

        combo.addActionListener(this);

        //combo.setBounds(10, 10, 120, 20);

        p.add(combo);
    }


    public static void main(String[] args) {
        WindowJComboBoxWindowsListener w = new WindowJComboBoxWindowsListener();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox comboBox = (JComboBox)e.getSource();

        if (comboBox == combo){
            Band b = (Band)comboBox.getSelectedItem();

            outputText.setText(b.getGroup() + " " + b.getCD());
        }

    }
}