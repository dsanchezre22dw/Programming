package Exercises5.ex3.Classes;


import Exercises5.ex3.Classes.Movie;

import java.util.*;

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

    public boolean containsNull(){

        for (Movie m : this.occupiedRooms){
            if (m == null){
                return true;
            }
        }
        return false;
    }

    public int index(Movie movie){

        for (int i = 0; i < this.occupiedRooms.length; i++) {
            if (this.occupiedRooms[i] == null){
                i++;
            }

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
                return (i+1);
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
                    System.out.println("Movie added " + this.occupiedRooms[i].getTitle());
                }
                i++;
            }

            if (!space){
                System.out.println("You don't have unoccupied showrooms!");
            }
        }else{
            System.out.println("That movie already exists in the cinema");
        }
    }


    public void addMovie(Movie movie, int room_number){

        if (!(room_number-1>=0 && room_number-1<this.occupiedRooms.length)){
            System.out.println("That room doesn't exist in this cinema");
        }else{
            if (!containsMovie(movie)){

                if (this.occupiedRooms[room_number-1] == null){
                    this.occupiedRooms[room_number-1] = movie;
                    this.movies.add(movie);
                    System.out.println("Movie added "  + this.occupiedRooms[room_number-1].getTitle());
                }else{
                    System.out.println("That room for the new movie is occupied");
                }

            }else{
                System.out.println("That movie already exists in the cinema");
            }
        }
    }

    public void display(){
        String x = this.name;

        for (int i = 0; i < this.occupiedRooms.length; i++) {
            if (this.occupiedRooms[i] != null){
                x += "\n" + this.occupiedRooms[i].getTitle() + " - Room " + (i+1);
            }
        }

        System.out.println(x);
    }

    public void display_movies(){

        for (int i = 0; i < this.movies.size(); i++) {
            System.out.print(this.movies.get(i).getTitle() + " ");
        }

        System.out.println();

    }

    public void display_OC(){

        for (int i = 0; i < this.occupiedRooms.length; i++) {
            if (this.occupiedRooms[i] != null){
                System.out.print(this.occupiedRooms[i].getTitle() + " ");
            }else{
                System.out.print("null ");
            }

        }

        System.out.println();

    }

    public void removeMovie(String x){

        for (int i = 0; i < this.occupiedRooms.length; i++) {
            if (this.occupiedRooms[i] != null && this.occupiedRooms[i].getTitle().startsWith(x)){
                System.out.println("Movie " + this.occupiedRooms[i].getTitle() + " removed from the rooms");
                this.occupiedRooms[i] = null;
            }
        }

        Iterator<Movie> it = this.movies.iterator();
        while (it.hasNext()){
            Movie elem = (Movie) it.next();
            if (elem.getTitle().startsWith(x)){
                System.out.println("Movie " + elem.getTitle() + " removed from the movies");
                it.remove();
            }
        }
    }

    public List<Integer> freeRooms() {

        List<Integer> frRoo = new ArrayList<Integer>();

        for (int i = 0; i < this.occupiedRooms.length; i++) {
            if (this.occupiedRooms[i] == null){
                frRoo.add((Integer)(i+1));
            }
        }

        return frRoo;
    }

    public void changeRoom(Movie movie){

        if (containsMovie(movie)){

            if (containsNull()){

                int pos = index(movie);

                Scanner sc = new Scanner(System.in);
                System.out.println("That movie is in the room " + (pos + 1));
                System.out.println("To which other room do you want to change the movie?");

                int newRoom = sc.nextInt();
                newRoom--;

                while (!(newRoom>=0 && newRoom<this.occupiedRooms.length) || this.occupiedRooms[newRoom] != null){
                    System.out.println("That is not a valid room (remember the room has to be free and existent)");
                    newRoom = sc.nextInt();
                    newRoom--;
                }

                this.occupiedRooms[newRoom] = movie;
                this.occupiedRooms[pos] = null;
                System.out.println("Movie changed from room " + (pos + 1) + " to room " + (newRoom+1));

            }else{
                System.out.println("You don't have unoccupied showrooms!");
            }
        }else{
            System.out.println("That movie doesn't exists in the cinema");
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
