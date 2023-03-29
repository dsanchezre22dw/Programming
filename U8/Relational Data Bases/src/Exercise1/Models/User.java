package Exercise1.Models;

public class User {

    private String ID;
    private String name;
    private String surname;
    private String studies;

    public User(String ID, String name, String surname, String studies){
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.studies = studies;
    }

    @Override
    public String toString() {
        return this.ID + " " + this.name + " " + this.surname + " " + this.studies;
    }
}
