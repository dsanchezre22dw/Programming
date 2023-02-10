package Exercises5.ex3;

import Exercises5.ex3.Classes.Cinema;
import Exercises5.ex3.Classes.Movie;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        //Instantiation of my cinema, called "cine"
        Cinema cine = new Cinema("Cinesa-Garbera", 10);

        //Instantiation of 10 movies
        Movie m1 = new Movie("Avatar", 178, 2009);
        Movie m2 = new Movie("Shutter Island", 138, 2010);
        Movie m3 = new Movie("Jojo Rabbit", 108, 2019);
        Movie m4 = new Movie("Prisoners", 153, 2013);
        Movie m5 = new Movie("Avengers", 143, 2012);
        Movie m6 = new Movie("Interstellar", 169, 2014);
        Movie m7 = new Movie("Pulp Fiction", 154, 1994);
        Movie m8 = new Movie("Logan", 137, 2017);
        Movie m9 = new Movie("Babylon", 189, 2023);
        Movie m10 = new Movie("Superbad", 118, 2007);
        Movie m11 = new Movie("Deadpool", 109, 2016);

        //Addition of some movies to the cinema, using the first method
        cine.addMovie(m1);
        cine.addMovie(m2);
        cine.addMovie(m3);

        //Addition of some movies to the cinema, using the second method
        cine.addMovie(m4, 7);
        cine.addMovie(m5, 8);
        cine.addMovie(m6, 9);
        cine.addMovie(m7, 10);

        System.out.println();

        //Display of the cinema
        cine.display();

        System.out.println();


        //Addition of some movies to the cinema, but some of them should not be added
        cine.addMovie(m1); //It already exists in the cinema
        cine.addMovie(m1, 10); //It already exists in the cinema
        cine.addMovie(m8, 11); //This room doesn't exist
        cine.addMovie(m8);
        cine.addMovie(m9);
        cine.addMovie(m10);
        cine.addMovie(m11); //No occupied rooms
        cine.addMovie(m11, 10); //That room is occupied

        System.out.println();

        //Display of the cinema updated (with the new movies)
        cine.display();

        System.out.println();

        //Method roomOfMovie
        System.out.println("The movie is being projected at the room " + cine.roomOfMovie("Superbad", 118, 2007)); //Same features
        System.out.println("The movie is being projected at the room " + cine.roomOfMovie("Superbad", 123, 2007)); //Duration changed with a margin of 5 minutes
        System.out.println("The movie is being projected at the room " + cine.roomOfMovie("Superbad", 137, 2007)); //Duration changed with a margin of more than 5 minutes
        System.out.println("The movie is being projected at the room " + cine.roomOfMovie("suPeRBad", 118, 2007)); //Title with capital and small letter
        System.out.println("The movie is being projected at the room " + cine.roomOfMovie("suPeRBad", 118, 2008)); //Title with capital and small letter and other year
        System.out.println("The movie is being projected at the room " + cine.roomOfMovie("War Dogs", 118, 2007)); //Other title

        System.out.println();

        //Method changeRoom (won't work as we don't have free rooms)
        cine.changeRoom(m1); //This movie will be found, but we don't have available rooms
        cine.changeRoom(m11); //This movie won't be found

        System.out.println();

        //Method freeRooms (we don't have free rooms)
        System.out.println("This is the ArrayList with the numbers of the cinema's free rooms: " + cine.freeRooms().toString());

        System.out.println();

        //Method removeMovie
        cine.removeMovie("Av"); //Avengers and Avatar will be deleted
        cine.removeMovie("Zix"); //No film will be deleted

        System.out.println();

        //Display of the cinema updated (Avengers and Avatar won't appear)
        cine.display();

        System.out.println();

        //Method changeRoom (we now have free rooms)
        cine.changeRoom(m6); //This movie will be found (I will change Interstellar to the first room)
        cine.changeRoom(m1); //This movie won't be found

        System.out.println();

        //Display of the cinema updated (With Interstellar in the first room and the Room 9 empty)
        cine.display();

        //Method freeRooms (we now have free rooms)
        System.out.println("This is the ArrayList with the numbers of the cinema's free rooms: " + cine.freeRooms().toString());

        System.out.println();

        //Method moviesShorterThan
        System.out.println("These are the films that last less than the duration you indicated: " + (cine.moviesShorterThan(2, 30)).toString());

        //Method resetCinema
        cine.resetCinema();

        //Display of the cinema updated (It is null)
        cine.display();

        //Using these methods we can see the ArrayList movies and the array occupiedRooms individually

        cine.display_movies(); //It is empty
        cine.display_OC(); //All its values are null

    }







}
