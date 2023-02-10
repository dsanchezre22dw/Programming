import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args){
        int number1, number2, i;
        double x;
        String answer;

        Scanner s = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        answer = "a";

        while (!answer.equals("N") && !answer.equals("n")){
            x=1;

            System.out.println("Enter number 1");
            number1 = s.nextInt();
            System.out.println("Enter number 2");
            number2 = s.nextInt();

            for (i=1; i<=Math.abs(number2); i++){
                x *= number1;
            }
            if (number2 >= 0){
                if (number1 == 0 && number2 == 0){
                    System.out.println("Indetermination");
                }else{
                    System.out.println("The answer is " + x);
                }
            }else{
                System.out.println("The answer is " + 1/x);
            }
            System.out.println("¿Do you want to continue?" );
            answer = sc.next();

        }

        }
    }

