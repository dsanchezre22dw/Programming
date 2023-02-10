package Exercises5.ex3.Classes;


import Exercises5.ex3.Classes.Movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Cinema{

    private String name;
    private List<Movie> movies;
    private Movie[] occupiedRooms;

    public Cinema(String name, int rooms){
        this.name = name;
        this.occupiedRooms = new Movie[rooms];
        this.movies = new ArrayList<Movie>();

    }

    public boolean containsMovie(Movie movie){
        for (Movie m : this.movies){
            if (m.isEqual(movie)){
                return true;
            }
        }
        return false;
    }

    public int index(Movie movie){

        for (int i = 0; i < this.occupiedRooms.length; i++) {
            if (this.occupiedRooms[i].isEqual(movie)){
                return i;
            }
        }

        return -1;
    }

    public int roomOfMovie(String name_of_movie, int duration, int year){

        Movie movie = new Movie(name_of_movie, duration, year);

        for (int i = 0; i < this.occupiedRooms.length; i++) {
            if (this.occupiedRooms[i].isEqual(movie)){
                return i;
            }
        }

        return -1;

    }

    public void addMovie(Movie movie){

        if (!containsMovie(movie)){
            int i = 0;
            boolean space = false;

            while (i<this.occupiedRooms.length && !space) {
                if (this.occupiedRooms[i] == null){
                    this.occupiedRooms[i] = movie;
                    space = true;
                    this.movies.add(movie);
                }
                i++;
            }

            if (!space){
                System.out.println("You don't have unoccupied showrooms!");
            }
        }else{
            System.out.println("This movie already exists in the cinema");
        }
    }


    public void addMovie(Movie movie, int room_number){

        if (!containsMovie(movie)){

            if (this.occupiedRooms[room_number] == null){
                this.occupiedRooms[room_number] = movie;
                this.movies.add(movie);
            }else{
                System.out.println("The room for the new movie is occupied");
            }

        }else{
            System.out.println("This movie already exists in the cinema");
        }
    }

    public void display(){
        String x = this.name;

        for (int i = 0; i < this.occupiedRooms.length; i++) {
            if (this.occupiedRooms[i] != null){
                x += "\n" + this.occupiedRooms[i].getTitle() + " - Room " + (i+1);
            }
        }
    }

    public void removeMovie(String x){

        for (int i = 0; i < this.occupiedRooms.length; i++) {
            if (this.occupiedRooms[i].getTitle().startsWith(x)){
                this.occupiedRooms[i] = null;
            }
        }

        for (int i = 0; i < this.movies.size(); i++) {
            if (this.movies.get(i).getTitle().startsWith(x)){
                this.movies.set(i, null);
            }
        }
    }

    public List<Integer> freeRooms() {

        List<Integer> frRoo = new ArrayList<Integer>();

        for (int i = 0; i < this.occupiedRooms.length; i++) {
            if (this.occupiedRooms[i] == null){
                frRoo.add((Integer)i);
            }
        }

        return frRoo;
    }

    public void changeRoom(Movie movie){

        if (containsMovie(movie)){

            if (containsMovie(null)){

                Scanner sc = new Scanner(System.in);
                System.out.println("That movie is in the room " + (index(movie) + 1));
                System.out.println("To which other room do you want to change the movie?");

                int newRoom = sc.nextInt();
                newRoom--;

                while (!(newRoom>=0 && newRoom<this.occupiedRooms.length) || this.occupiedRooms[newRoom] != null){
                    System.out.println("That is not a valid room (remember the room has to be free and existent)");
                    newRoom = sc.nextInt();
                    newRoom--;
                }

                this.occupiedRooms[newRoom] = movie;
                this.occupiedRooms[index(movie)] = null;

            }else{
                System.out.println("You don't have unoccupied showrooms!");
            }
        }else{
            System.out.println("This movie doesn't exists in the cinema");
        }
    }

    public void resetCinema(){
        this.movies.clear();
        Arrays.fill(this.occupiedRooms, null);
    }

    public List<String> moviesShorterThan(int hours, int minutes){

        List<String> mShThan = new ArrayList<String>();

        int duration = hours*60 + minutes;

        for (Movie elem: this.movies){
            if (elem.getDuration() < duration){
                mShThan.add(elem.getTitle());
            }
        }

        return mShThan;
    }

}
