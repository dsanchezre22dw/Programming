package Exercises5.ex2;

import java.util.*;

public class ex2 {

    private List<Point> points;

    public ex2(){
        Point p1 = new Point(8.6, 2.4);
        Point p2 = new Point(-1.2, 6.3);
        Point p3 = new Point(-5.2, -9.9);
        Point p4 = new Point(3.7, -7.5);
        Point p5 = new Point(0, 0);

        this.points = new ArrayList<Point>();

        this.points.add(p1);
        this.points.add(p2);
        this.points.add(p3);
        this.points.add(p4);
    }

    public ex2(List<Point> points){
        this.points = points;
    }

    public void display(){
        for (Point elem:this.points){
            System.out.print(elem.toString());
        }
    }

    public List<Point> getReverse(){

        List<Point> points2 = List.copyOf(this.points);

        Point aux;

        for (int i = 0; i < points2.size()/2; i++) {
            aux = points2.get(i);

            points2.set(i, points2.get(i +(points2.size() -1) - 2*i));

            points2.set(i +(points2.size() -1) - 2*i, aux);

        }

        return points2;

    }

    public List<Point> getReverse2(){

        List<Point> points2 = new ArrayList<>();

        for (int i = this.points.size()-1; i >= 0; i--) {
            points2.add(this.points.get(i));

        }

        return points2;

    }

    public List<Point> getReverse3(){

        List<Point> points2 = new ArrayList<>();

        Collections.copy(points2, this.points);
        Collections.reverse(points2);

        return points2;

    }

    public Point secondQuadrant(){

        Iterator<Point> it = this.points.iterator();
        while (it.hasNext()){
            Point elem = (Point) it.next();

            if (elem.getX() < 0 && elem.getY() > 0){
                return elem;
            }

        }

        return null;
    }

    public void centralPoint(){

        boolean found = false;
        int i = 0;
        Point zero = new Point(0, 0);

        while (!found && i < this.points.size()){

            if (this.points.get(i).compareTo(zero) == 0){
                System.out.println(i);
                found = true;
            }
            i++;
        }

        if (!found){
            System.out.println("The ArrayList does not contain any (0,0) point");
        }
    }

    public void oneonePoint1(){

        boolean found = false;
        int i = 0;
        Point zero = new Point(1, 1);

        while (!found && i < this.points.size()){

            if (this.points.get(i).equals(zero)){
                System.out.println("The point (1,1) IS inside the ArrayList");
                found = true;
            }
            i++;
        }

        if (!found){
            System.out.println("The point (1,1) IS NOT inside the ArrayList");
        }
    }

    public void oneonePoint2(){

        if (this.points.contains(new Point(1,1))){
            System.out.println("The point (1,1) IS inside the ArrayList");
        }else{
            System.out.println("The point (1,1) IS NOT inside the ArrayList");
        }

    }

    public void delete10(){

        boolean found = false;
        int i = 0;
        Point zero = new Point(0, 0);

        while (!found && i < this.points.size()){

            if (this.distance(this.points.get(i), zero) < 10){
                found = this.points.remove(this.points.get(i));
                System.out.println("Element " + i + " deleted");
            }
            i++;
        }

        if (!found){
            System.out.println("No point is within a distance less than 10 from the (0, 0) point");
        }
    }

    public double distance(Point p1, Point p2){

        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));

    }

    public void delete4Quadrant(){

        Iterator<Point> it = this.points.iterator();

        while (it.hasNext()){
            if(it.next().getX() > 0 && it.next().getY() < 0){
                this.points.remove(it.next());
                System.out.println("Element removed");
            }
        }
    }










}
