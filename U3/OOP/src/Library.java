import java.util.Scanner;
public class Library {

    public static boolean isEven(int number){
        if (number % 2 == 0){
            return true;
        }
        return false;
    }

    public static int digitAmount(int number){
        int count = 0;
        while (number !=0){
            number = number/10;
            count++;
        }
        return count;
    }


    public static boolean isLong(int number){
        if (digitAmount(number) >= 5){
            return true;
        }
        return false;
    }

    public static boolean multipleOf10(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int number = s.nextInt();

        if (number % 10 == 0){
            return true;
        }
        return false;
    }

}
