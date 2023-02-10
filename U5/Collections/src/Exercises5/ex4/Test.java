package Exercises5.ex4;

import Exercises5.ex4.Class.Agenda;

public class Test {

    public static void main(String[] args) {

        //Initialising the agenda with a length of 5 numbers
        Agenda ag = new Agenda(5);

        //Displaying the empty agenda (it should print "The HashMap is empty")
        ag.display();

        System.out.println();

        //Adding some people (one is repeated, so I must choose to add it or not)
        ag.addEntry("David", new String[]{"1110", "1111", "1112"});
        ag.addEntry("Mikel", new String[]{"2220", "1110", "2222"});
        ag.addEntry("Ruben", new String[]{"3330", "3331", "1110"});
        ag.addEntry("David", new String[]{"4440", "4441", "4442"});

        System.out.println();

        //Displaying the agenda
        ag.display();

        System.out.println();

        //Searching the phone numbers of some people
        System.out.println(ag.searchName("David"));
        System.out.println(ag.searchName("Irene"));

        System.out.println();

        //Printing how many people has a specific phone number
        System.out.println(ag.numberOfPhones("1110") + " people has this phone number");

        System.out.println();

        //Adding more contacts to the agenda than it is possible
        ag.addEntry("Isabel", new String[]{"5550", "5551", "5552"});
        ag.addEntry("Manuel", new String[]{"6660", "6661", "6662"});
        ag.addEntry("Miriam", new String[]{"7770", "7771", "7772"});

        System.out.println();

        //Displaying the agenda
        ag.display();

    }


}
