package Exercises5.ex3.Classes;

public class Movie {

    private String title;
    private int duration;
    private int year;

    public Movie(String title, int duration, int year){
        this.title = title;
        this.duration = duration;
        this.year = year;
    }

    @Override
    public String toString(){
        return "Title: " + this.title + "\nDuration: " + this.duration + " minutes\nYear of release: " + this.year;
    }

    public boolean isEqual(Movie movie){
        return (this.title.equalsIgnoreCase(movie.title) && Math.abs(this.duration-movie.duration)<=5 && this.year==movie.year);
    }

    public String getTitle() {
        return this.title;
    }

    public int getDuration() {
        return this.duration;
    }
}
