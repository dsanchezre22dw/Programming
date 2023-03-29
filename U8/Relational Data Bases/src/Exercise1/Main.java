package Exercise1;

import Exercise1.DBConnection.GestorDB;
import Exercise1.Windows.UsersWindows;

public class Main {
    public static void main(String[] args) {
        UsersWindows w = new UsersWindows();
        GestorDB dbManagement = new GestorDB();
    }

}
