package Theory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DBManagement {

    static final String SERVER_IP = "localhost";
    static final String DB_NAME = "prueba";
    static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    static final String DB_URL = "jdbc:mariadb://" + SERVER_IP + ":3306/" + DB_NAME;

    //Database Credentials

    static final String USER = "root";
    static final String PASS = "root";

    private Connection conn;

    public DBManagement() {
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connection created");

            List<Person> people = listOfPeople();

            for (int i = 0; i < people.size(); i++){
                System.out.println(people.get(i).toString());
            }

            insertPeople();

        }catch (ClassNotFoundException e){
            System.out.println("Class not found");
        } catch (SQLException e) {
            System.out.println("SQLException");
        }
    }

    public List<Person> listOfPeople(){
        List<Person> people = null;

        try {
            people = new ArrayList<>();
            PreparedStatement select = conn.prepareStatement("SELECT * FROM people");
            ResultSet rs = select.executeQuery();

            while (rs.next()){
                String ID = rs.getString("ID");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                Person p = new Person(ID, name, age);
                people.add(p);
            }

        }catch (SQLException e){
            System.out.println("SQL exception doing query");
        }

        return people;

    }

    public void insertPeople(){
        Scanner sc = new Scanner(System.in);

        System.out.println("How many people do you want to add?");
        int num_people = sc.nextInt();

        for (int i = 0; i < num_people; i++){
            System.out.println("Insert the ID of the person");
            String ID = sc.next();
            System.out.println("Insert the name of the person");
            String name = sc.next();
            System.out.println("Insert the age of the person");
            int age = sc.nextInt();

            try {
                PreparedStatement select = conn.prepareStatement("INSERT INTO people VALUES (ID, name, age)");
                select.executeUpdate();

            }catch (SQLException e){
                System.out.println("SQL exception doing query");
            }

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

    public static void main(String[] args) {
        DBManagement dbManagement = new DBManagement();
        dbManagement.close();
    }

}
