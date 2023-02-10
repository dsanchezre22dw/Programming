public class Straight {

    private double width;
    private Point p1;
    private Point p2;

    public Straight(double x, Point y, Point z){
        this.width = x;
        this.p1 = y;
        this.p2 = z;
    }

    public Straight(double x, double x1, double y1, double x2, double y2){
        this.width = x;
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    public boolean isHorizontal(){
        if (p1.gety() == p2.gety()){
            return true;
        }
        return false;
    }

    public boolean isVertical(){
        if (p1.getx() == p2.getx()){
            return true;
        }
        return false;
    }

    public Point highestPoint(){
        if (p1.gety() > p2.gety()){
            return p1;
        }
        return p2;
    }


    public double length(){
        return Math.sqrt(((p2.getx() - p1.getx()) * (p2.getx() - p1.getx())) + ((p2.gety() - p1.gety()) * (p2.gety() - p1.gety()))) ;
    }

    public Straight longest(Straight x){
        if (this.length() > x.length()){
            return this;
        }
        return x;
    }

    public void show(){
        System.out.println("x of 1st point: " + p1.getx());
        System.out.println("y of 1nd point: " + p1.gety());
        System.out.println("x of 2nd point: " + p2.getx());
        System.out.println("y of 2nd point: " + p2.gety());
        System.out.println("Width of the straight: " + width);
    }


}