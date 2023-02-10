package Exercises2.Ex7.test;

import Exercises2.Ex7.figures.*;

public class TestFigure {

    public static void main(String[] args){

        Circle circle = new Circle(2);
        Square square = new Square(3);
        Rectangle rectangle = new Rectangle(4, 5);

        System.out.println("The area of the circle is " + circle.getArea());
        System.out.println("The area of the square is " + square.getArea());
        System.out.println("The area of the rectangle is " + rectangle.getArea());

        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(1);

        System.out.println("The total area of the existing circles is " + Circle.totalArea_Circle);

    }



}
