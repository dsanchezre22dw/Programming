package Package4;

import java.util.Scanner;

public class Exercise1 {

    public static void triangle(int x){
        for (int i = 1; i <=x ; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

    public static void triangle2(int x){
        for (int i = 1; i <=x ; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
    public static void triangle3(int x){
        for (int i = 1; i <=x ; i++){
            for (int j = 1; j <= i; j++){

                if (i%2!=0 && j%2!=0 || i%2==0 && j%2==0){
                    System.out.print("1");

                }else{
                    System.out.print("0");
                }
            }
            System.out.print("\n");
        }
    }
    public static void triangle4(int x){
        int z = 0;

        for (int i = 1; i <=x ; i++){
            if (i==1){
                z = i;
            }
            for (int j = 1; j <= i; j++){
                System.out.print(z + " ");
                z++;
            }
            System.out.print("\n");
        }
    }

    public static void triangle5(int x){
        for (int i = 1; i <=x ; i++){
            for (int j = 1; j<=x-i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k =1; k<=i-1; k++){
                System.out.print(" *");

            }
            System.out.print("\n");
        }
    }

    public static void triangle6(int x){
        int z = 0;
        for (int i = 1; i <=x ; i++){
            for (int j = 1; j<=x-i; j++){
                System.out.print(" ");
            }
            if (i==1){
                z = i;
            }else{
                z++;
            }
            System.out.print(z);
            for (int k =1; k<=i-1; k++){
                z++;
                System.out.print(" " + z);

            }
            System.out.print("\n");
        }
    }

    public static void triangle7(int x){
        int total, total2, aux, aux2;
        total = x%2 == 0 ? x/2 : x/2+1;
        total2 = x/2;
        for (int i = 1; i <=total; i++){
            for (int j = 1; j<=total-i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k =1; k<=i-1; k++){
                System.out.print("**");
            }
            System.out.print("\n");
        }

        for (int i = 1; i <=total2; i++){
            aux = x%2 == 0 ? i-1 : i;
            aux2 = x%2 == 0 ? total2-i : total2-i;
            for (int j = 1; j<=aux; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k =1; k<=aux2; k++){
                System.out.print("**");
            }
            System.out.print("\n");
        }
    }

    public static void triangle8(int x){
        int var1 = 1, var2 = 0, sum = 0;

        for (int i = 1; i <=x ; i++){
            for (int j = 1; j<=x*2-2*i; j++){
                System.out.print(" ");
            }
            System.out.print("1");

            for (int k = 1; k <= i/2; k++){
                sum = var1 + var2;
                for (int z = 1; z <= i-2; z++){
                    System.out.println("   " + sum);
                    var2=var1;
                    sum = var2;
                }
                var1=var2;
                var2 = sum;
            }

            if (i>2){
                System.out.println("   1");
            }else{
                System.out.print("\n");
            }

        }
    }

    public static void triangle9(int x){
        for (int i = 1; i <=x ; i++){
            if (i==1 || i==x){
                for (int j = 1; j <= x; j++){
                    System.out.print("* ");
                }
                System.out.print("\n");
            }else{
                System.out.print("*");
                for (int k = 1; k <= (x-2)*2+1; k++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }





    public static void main(String[] args){
        int len;
        Scanner s = new Scanner(System.in);
        System.out.println("¿How long is your triangle?");
        len = s.nextInt();
        triangle(len);
        System.out.print("\n");
        triangle2(len);
        System.out.print("\n");
        triangle3(len);
        System.out.print("\n");
        triangle4(len);
        System.out.print("\n");
        triangle5(len);
        System.out.print("\n");
        triangle6(len);
        System.out.print("\n");
        triangle7(len);
        System.out.print("\n");
        triangle9(len);
        System.out.print("\n");




    }

}
