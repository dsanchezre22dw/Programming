package Exercises1;

import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Introduce the first number");
            x = sc.nextInt();
            System.out.println("Introduce the second number");
            y = sc.nextInt();
            System.out.println("The result of the division is " + x/y);
        }catch (ArithmeticException e){
            System.out.println("Error: division by zero");
        }catch (Exception e){
            System.out.println("Generic exception");
        }
    }
}
