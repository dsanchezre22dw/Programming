package Exercise1.DBConnection;

import Exercise1.Models.User;

import java.sql.*;

public class GestorDB {

    static final String SERVER_IP = "localhost";
    static final String DB_NAME = "prueba";
    static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    static final String DB_URL = "jdbc:mariadb://" + SERVER_IP + ":3306/" + DB_NAME;

    //Database Credentials

    static final String USER = "root";
    static final String PASS = "root";

    private Connection conn;

    public GestorDB() {
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connection created");

        }catch (ClassNotFoundException e){
            System.out.println("Class not found");
        } catch (SQLException e) {
            System.out.println("SQLException");
        }
    }

    public void select(String text){

        try {
            PreparedStatement select = conn.prepareStatement("SELECT * FROM users");
            ResultSet rs = select.executeQuery();

            while (rs.next()){

                if (rs.getString("ID").equals(text)){
                    String ID = rs.getString("ID");
                    String name = rs.getString("name");
                    String surname = rs.getString("surname");
                    String studies = rs.getString("studies");
                    User p = new User(ID, name, surname, studies);

                    System.out.println(p.toString());
                }

            }

        }catch (SQLException e){
            System.out.println("SQL exception doing query");
        }


    }

    public void close(){
        try {
            if (conn != null){
                conn.close();
                System.out.println("Disconnected from DB");
            }
        }catch (SQLException e){
            System.out.println("Error closing");
        }
    }

}
