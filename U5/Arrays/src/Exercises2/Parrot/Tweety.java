package Exercises2.Parrot;

public class Tweety extends Canary {

    private int movies;

    Tweety(char sex, int age, PersonalData names, double size, int movies){
        super(sex, age, names, size);
        this.movies = movies;
    }

    @Override
    public void sing() {
        System.out.println("My name is " + this.getNames().getName() + ". Pio-pio I'm a tweety");
    }


}
