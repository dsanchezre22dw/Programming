import java.util.Scanner;

public class Exercise7{

    public static void main(String[] args) {
        int number, i, sum;


        Scanner s = new Scanner(System.in);

        System.out.println("Introduce yout number: ");
        number = s.nextInt();
        sum = 0;
        if (number!=0){
            for (i = 1; i <= number / 2; i++){
                if (number % i == 0){
                    sum+=i;
                }
            }
            if (sum == number){
                System.out.println(number + " is a perfect number.");
            }else{
                System.out.println(number + " is not a perfect number.");
            }
        }else{
            System.out.println("All numbers are 0's divisors");
        }
    }
}
