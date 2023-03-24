package Listeners.JButtonWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowJButtonsWindowListener extends JFrame implements ActionListener {
    private JLabel outputText;

    private JRadioButton button1;
    private JRadioButton button2;
    private JRadioButton button3;
    private JRadioButton button4;


    public WindowJButtonsWindowListener() {
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
        ButtonGroup group = new ButtonGroup();

        button1 = new JRadioButton("Boton 1");
        button2 = new JRadioButton("Boton 2");
        button3 = new JRadioButton("Boton 3");
        button4 = new JRadioButton("Boton 4");
        button1.setSelected(true);

        group.add(button1);
        group.add(button2);
        group.add(button3);
        group.add(button4);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);

        p.add(button1);
        p.add(button2);
        p.add(button3);
        p.add(button4);

    }


    public static void main(String[] args) {
        WindowJButtonsWindowListener w = new WindowJButtonsWindowListener();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JRadioButton button = (JRadioButton)e.getSource();

        if (button == button1){
            outputText.setText("Button 1");
        }else if (button == button2){
            outputText.setText("Button 2");
        }else if (button == button3){
            outputText.setText("Button 3");
        }else if (button == button4){
            outputText.setText("Button 4");
        }

    }
}