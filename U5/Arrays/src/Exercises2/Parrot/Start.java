package Exercises2.Parrot;

public class Start {

    public static void main(String[] args) {
        //Create 3 Tweeties and initialize all their data
        PersonalData names1 = new PersonalData("Tweety1", "Owner1");
        PersonalData names2 = new PersonalData("Tweety2", "Owner2");
        PersonalData names3 = new PersonalData("Tweety3", "Owner3");

        Tweety tweety1 = new Tweety('M', 2, names1, 20, 3);
        Tweety tweety2 = new Tweety('F', 3, names2, 25, 5);
        Tweety tweety3 = new Tweety('M', 4, names3, 30, 2);


        // Give a new bird name and a new owner name to your first Tweetie
        names1.setName("New Tweety1");
        names1.setOwner("New Owner1");

        //Instantiate a Parrot
        PersonalData parrotNames = new PersonalData("Parrot", "Owner4");
        Parrot parrot = new Parrot('F', 5, parrotNames, 'S', "Green");

        //Make the Parrot and the 3 Tweeties sing
        parrot.sing();
        tweety1.sing();
        tweety2.sing();
        tweety3.sing();
    }

}
