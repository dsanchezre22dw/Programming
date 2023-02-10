import java.util.Scanner;

public class Exercise8{
    public static void main(String[] args){

        int N, M, i, count;

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce N: ");
        N = s.nextInt();
        System.out.println("Introduce M: ");
        M = s.nextInt();

        count = 0;
        if (M!=0){
            for (i = 1; i <= M ; i++){
                if (M % i == 0 &&){
                    System.out.println(i);


                }
            }
            System.out.println(M);
        }else{
            System.out.println("0 cannot be processed, all numbers are 0's divisors");
        }


    }
