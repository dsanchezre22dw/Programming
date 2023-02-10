public class Person {
    private String name;
    private int age;
    private String nationality;

    public Person(String x, int y, String z){
        this.name= x;
        this.age = y;
        this.nationality = z;
    }

    public String toString(){
        return ("Person[name:  " + this.name + ", age:  " + this.age + ", nationality: " + this.nationality + "]");
    }

    public boolean equals(Person p2){
        if (this.name.equals(p2.name) && this.age == p2.age && this.nationality.equals(p2.nationality)){
            return true;
        }
        return false;
    }

}
