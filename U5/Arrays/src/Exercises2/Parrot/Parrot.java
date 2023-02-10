package Exercises2.Parrot;

public class Parrot extends Bird {

    private char region;
    private String colour;

    public Parrot(char sex, int age, PersonalData names, char region, String colour){
        super(sex, age, names);
        this.region = region;
        this.colour = colour;
    }

    public void whereAreYouFrom(){

        switch (this.region) {
            case 'N':
                System.out.println("North");
                break;
            case 'S':
                System.out.println("South");
                break;
            case 'E':
                System.out.println("East");
                break;
            case 'W':
                System.out.println("West");
                break;
        }
    }

    public void setRegion(char x){
        this.region = x;
    }

    @Override
    public void sing() {
        System.out.println("My name is " + this.getNames().getName() + ". Pio-pio I'm a parrot");
    }


}
