package Exercises2.Ex7.figures;

public abstract class Figure {
    private double area;
    private double perimeter;
    public static double totalArea = 0;

    public double getArea() {
        return this.area;
    }

    public double getPerimeter() {
        return this.perimeter;
    }


    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

}
