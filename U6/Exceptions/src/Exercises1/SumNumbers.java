package Exercises1;

import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {
        int no = 0, sum = 0;
        String y = "";
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("Write a number");
                y = sc.next();
                sum += Integer.parseInt(y);
            } catch (NumberFormatException e) {
                no++;
                System.out.println(y + " cannot be added");
            }
        }

        System.out.println("The final sum is " + sum);
        System.out.println(no + " number(s) has/have not been added");
    }
}
