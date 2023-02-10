import java.util.Scanner;

public class Ejercicio19{
    public static void main(String[] args){
        int number, i;
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe un número");
        number = s.nextInt();
        if (number!=0){
            for (i = 1; i <= number / 2; i++){
                if (number % i == 0){
                    System.out.println(i);
                }
            }
            System.out.println(number);
        }else{
            System.out.println("All numbers are 0's divisors");
        }
    }
}
