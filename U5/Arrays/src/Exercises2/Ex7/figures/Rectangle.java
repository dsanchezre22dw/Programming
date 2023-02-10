package Exercises2.Ex7.figures;

public class Rectangle extends Figure{

    private double side1;
    private double side2;
    public static double totalArea_Rectangle = 0;

    public Rectangle(double side1, double side2){
        super.setArea(side1 * side2);
        super.setPerimeter(side1*2 + side2*2);
        totalArea += super.getArea();
        totalArea_Rectangle += super.getArea();

    }



}
