package Theory;

public class Person {

    private String ID;
    private String name;
    private int age;

    public Person(String ID, String name, int age){
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.ID + " " + this.name + " " + this.age;
    }
}
