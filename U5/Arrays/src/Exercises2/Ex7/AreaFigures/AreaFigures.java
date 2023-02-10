package Exercises2.Ex7.AreaFigures;


import Exercises2.Ex7.figures.*;

public class AreaFigures {

    private Figure[] figures;

    public AreaFigures(int x){
        this.figures = new Figure[x];
    }

    public void addFigure(Figure figure) {
        int i = 0;
        boolean space = false;

        while (i<this.figures.length && !space) {
            if (this.figures[i] == null){
                this.figures[i] = figure;
                space = true;
            }
            i++;
        }

        if (!space){
            System.out.println("You don't have space!");
        }

    }

    public double calculateTotalArea(){
        int i = 0;
        boolean finished = false;
        double x = 0;

        while (i<this.figures.length && !finished){
            if (this.figures[i] == null){
                finished = true;
            }else{
                x += this.figures[i].getArea();
                i++;
            }
        }
        return x;
    }

    public void print(){
        System.out.println("The total area of the figures of the array is " + this.calculateTotalArea());
    }

    public static void main(String[] args){

        AreaFigures af = new AreaFigures(2);
        Rectangle rectangle = new Rectangle(4.3, 7.1);
        Square square = new Square(3);

        af.addFigure(rectangle);
        af.addFigure(square);

        af.print();

        Rectangle rectangle2 = new Rectangle(4.3, 7.1);
        af.addFigure(rectangle2);

    }








}
