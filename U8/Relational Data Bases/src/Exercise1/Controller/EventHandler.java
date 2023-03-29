package Exercise1.Controller;

import Exercise1.DBConnection.GestorDB;
import Exercise1.Models.User;
import Exercise1.Windows.UsersWindows;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener {

    UsersWindows window;

    public EventHandler(UsersWindows window){
        this.window = window;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton) e.getSource();
        GestorDB gestor = new GestorDB();

        if (boton == window.getButtons()[0]){
            gestor.select(window.getTf().getText());
        }
    }
}
