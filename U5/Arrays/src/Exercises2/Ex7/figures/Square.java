package Exercises2.Ex7.figures;

public class Square extends Figure{

    private double side;
    public static double totalArea_Square = 0;

    public Square(double side){
        super.setArea(side * side);
        super.setPerimeter(side*4);
        totalArea += super.getArea();
        totalArea_Square += super.getArea();
    }


}
