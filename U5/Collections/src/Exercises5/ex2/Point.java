package Exercises5.ex2;

import java.util.Objects;

public class Point implements Comparable<Point>{

    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "x: " + this.x + "\ny: " + this.y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    @Override
    public int compareTo(Point p){
        if (this.getX() == p.getX() && this.getY() == p.getY()){
            return 0;
        }

        return -1;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.x, this.y);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (!(obj instanceof Point)) {
            return false;
        }

        Point p = (Point)obj;

        return (this.getX() == p.getX() && this.getY() == p.getY());
    }

}
