package Exercises2.Ex7.figures;

public class Circle extends Figure{

    private double radius;
    public static double totalArea_Circle = 0;


    public Circle(double radius){
        super.setArea(Math.PI * radius * radius);
        super.setPerimeter(2 * Math.PI * radius);
        totalArea += super.getArea();
        totalArea_Circle += super.getArea();
    }

}
