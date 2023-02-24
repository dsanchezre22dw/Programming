package Exercises2.ex4;

public class Person {

    private String name;
    private String phone;
    private String place;

    public Person(String name, String phone, String place){
        this.name = name;
        this.phone = phone;
        this.place = place;
    }

    @Override
    public String toString() {
                return this.name + "    " + this.phone + "  " + this.place ;
    }


}
