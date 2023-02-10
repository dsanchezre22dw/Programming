public class Circumference {

    private double radius;
    private String colour;

    public Circumference(double x, String y){
        this.radius = x;
        this.colour = y;
    }

    public double area(){
        return Math.PI * this.radius * this.radius;
    }

    public void printPerimeter(){
        System.out.println("Perimeter: " + 2 * Math.PI * this.radius);
    }

    public boolean isBig(){
        if (this.area() > 20){
            return true;
        }
        return false;
    }

    public boolean isEqualTo(Circumference c2){
        if (this.radius == c2.radius && this.colour.equals(c2.colour)){
            return true;
        }
        return false;
    }

    public void show(){
        System.out.println("Radius: " + this.radius);
        System.out.println("Colour: " + this.colour);
    }
}