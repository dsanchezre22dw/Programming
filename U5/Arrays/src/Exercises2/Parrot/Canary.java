package Exercises2.Parrot;

public class Canary extends Bird {

    private double size;

    public Canary(char sex, int age, PersonalData names){
        super(sex, age, names);
    }


    public Canary(char sex, int age, PersonalData names, double size){
        super(sex, age,names);
        this.size = size;
    }

    public void height(){
        if (this.size > 30){
            System.out.println("High");
        }else if (this.size <=30 && this.size >=15){
            System.out.println("Middle");
        }else {
            System.out.println("Little");
        }
    }

    public void setSize(double x){
        this.size = x;
    }

    @Override
    public void sing() {
        System.out.println("My name is " + this.getNames().getName() + ". Pio-pio I'm a canary");
    }

}
