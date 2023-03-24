package Milestones.Milestone2;

import Listeners.JComboBox.Band;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProgrammingLanguagesGUI extends JFrame implements ActionListener{
    private JComboBox combo;
    private DefaultComboBoxModel model;
    private JTextArea textarea;

    private JButton buttonclear;
    private JButton buttonclose;


    public ProgrammingLanguagesGUI() {
        Container container = this.getContentPane();

        this.setTitle("Test Events: Files");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

        addToPanel1(panel1);
        addToPanel2(panel2);

        container.add(panel1);
        container.add(panel2);

        this.setSize(815,415);
        this.setVisible(true);
    }

    public void addToPanel1(JPanel panel) {

        combo = new JComboBox();
        model = new DefaultComboBoxModel();

        combo.setModel(model);
        combo.setBorder(BorderFactory.createEmptyBorder(0, 40, 0, 5));

        model.addElement("python.txt");
        model.addElement("c.txt");
        model.addElement("java.txt");

        combo.addActionListener(this);

        buttonclear = new JButton("Clear");

        buttonclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textarea.setText("");

            }
        });

        panel.add(combo);
        panel.add(buttonclear);
        panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 350, 40));
    }

    public void addToPanel2(JPanel panel){

        textarea = new JTextArea();
        textarea.setLineWrap(true);
        textarea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textarea);
        buttonclose = new JButton("Close");

        buttonclose.addActionListener(this);

        scrollPane.setPreferredSize(new Dimension(200, 70));
        textarea.setPreferredSize(new Dimension(380,550));


        panel.add(scrollPane);
        panel.add(buttonclose);
    }


    public static void main(String[] args) {
        ProgrammingLanguagesGUI w = new ProgrammingLanguagesGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object object = e.getSource();

        if (object instanceof JComboBox){
            BufferedReader in = null;

            try {
                in = new BufferedReader(new FileReader(new File("src/Milestones/Milestone2/files/"+ combo.getSelectedItem())));
                String line;

                List<String> lines = new ArrayList<>();

                while ((line = in.readLine()) != null){
                    lines.add(line);
                }

                textarea.setText(String.join("\n", lines));

            }catch (FileNotFoundException a){
                textarea.setText("");
                JOptionPane.showMessageDialog(null, "File Not Found", "Alert", JOptionPane.ERROR_MESSAGE);
                //System.out.println("File not found");
            }catch (IOException b){
                System.out.println("Exception");
            }

            try{
                if (in != null){
                    in.close();
                }


            }catch (IOException ex){
                System.out.println("IOException");
            }
        }else if (object instanceof JButton){
            dispose();
        }




    }

}
