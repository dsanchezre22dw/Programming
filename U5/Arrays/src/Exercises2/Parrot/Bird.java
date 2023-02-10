package Exercises2.Parrot;

public class Bird {

    private char sex;
    private int age;
    private PersonalData names;
    private static int amount_birds = 0;


    public Bird(char sex, int age, PersonalData names){
        this.sex = sex;
        this.age = age;
        this.names = names;
        amount_birds++;
    }


    public void whoAmI(){
        System.out.println("The sex of the bird is " + this.sex + " and the is " + this.age + " years old.");
    }

    public int getAmount_birds(){
        return amount_birds;
    }

    public PersonalData getNames() {
        return this.names;
    }


    public void sing() {
        System.out.println("My name is " + names.getName() + ". Pio-pio I'm a bird");
    }




}
