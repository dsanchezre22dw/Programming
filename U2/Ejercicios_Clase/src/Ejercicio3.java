import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args){
        int number, summation, factorial, i, count, count_summation;
        double sum;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number");
        number = s.nextInt();


        count_summation = 0;


        sum = 0;
        count = 0;

        while (number != 0){
            summation = 0;
            factorial = 1;

            for (i = 2; i <= number; i++){
                summation += i;
                factorial *= i;
            }

            if (summation > 100){
                count_summation++;
            }

            if (number < 10){
                sum += number;
                count++;
            }

            System.out.println("Summation: " + summation + "     Factorial: " + factorial);
            System.out.println("Enter a number");
            number = s.nextInt();
        }
        System.out.println(count_summation + " summations have turned out to be greater than 100");
        System.out.println("Average of numbers smaller than 10: " + sum/count);
    }
}




