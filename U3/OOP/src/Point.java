public class Point {

    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public int quadrant(){
        if (x > 0 && y > 0){
            return 1;
        }else if (x > 0 && y < 0){
            return 4;
        }else if (x < 0 && y > 0){
            return 2;
        }else if (x < 0 && y < 0){
            return 3;
        }

        return 0;
    }

    public void show(){
        System.out.println("x: " + this.x);
        System.out.println("y: " + this.y);
    }

    public double getx(){
        return this.x;
    }

    public double gety(){
        return this.y;
    }
}