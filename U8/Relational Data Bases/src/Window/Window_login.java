package Window;

import javax.swing.*;
import java.awt.*;

public class Window_login extends JFrame{

    private JTextField tf;
    private JTextField tf2;
    private JTextField tf3;

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;

    private JComboBox combo;
    private DefaultComboBoxModel model;




    public Window_login() {
        Container container = this.getContentPane();

        this.setTitle("login");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        container.setLayout(new GridLayout(2,1));

        JPanel panel12 = new JPanel();

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        panel12.setLayout(new BoxLayout(panel12, BoxLayout.X_AXIS));
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));

        panel12.add(panel1);
        panel12.add(panel2);


        addToPanel1(panel1);
        addToPanel2(panel2);
        addToPanel3(panel3);


        container.add(panel12);
        container.add(panel3);

        this.setSize(415,200);
        this.setVisible(true);
    }

    public void addToPanel1(JPanel panel) {

        label1 = new JLabel("ID");
        label2 = new JLabel("Name");
        label3 = new JLabel("Surname");
        label4 = new JLabel("Studies");

        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);


    }

    public void addToPanel2(JPanel panel){

        tf = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();

        combo = new JComboBox();
        model = new DefaultComboBoxModel();

        combo.setModel(model);

        model.addElement("Informática");
        model.addElement("Economía");
        model.addElement("Dibujo");


        panel.add(tf);
        panel.add(tf2);
        panel.add(tf3);
        panel.add(combo);
    }

    public void addToPanel3(JPanel panel){

        ButtonGroup group = new ButtonGroup();
        JButton[] buttons = new JButton[4];
        buttons[0] = new JButton("SELECT");
        buttons[1] = new JButton("SAVE");
        buttons[2] = new JButton("UPDATE");
        buttons[3] = new JButton("DELETE");

        for (JButton button : buttons) {
            group.add(button);
            panel.add(button);
        }
    }


    public static void main(String[] args) {
        Window_login w = new Window_login();
    }



}