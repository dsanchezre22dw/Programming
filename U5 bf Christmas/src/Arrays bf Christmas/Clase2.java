package Package_Arrays;

import java.util.Scanner;

public class Clase2 {

    public static int[] create(int l){
        int[] nums = new int[l];
        int max = 10, min = -10;
        for (int i = 0; i < l; i++){
            nums[i] = (int)Math.floor(Math.random()*(max-min+1)+min);
        }
        return nums;

    }

    public static boolean compare(int[] x, int[] y){
        if(x.length != y.length){
            return false;
        }

        for (int i = 0; i < x.length; i++){
            if (x[i] != y[i]){
                return false;
            }
        }
        return true;
    }

    public static void show(int[] array){

        for (int i = 0; i < array.length; i++){

            System.out.print(array[i] + " ");

        }
        System.out.println();
    }


    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("How long will your first matrix be?");
        int x = s.nextInt();

        System.out.println("How long will your second matrix be?");
        int y = s.nextInt();

        int[] array1 = create(x);
        int[] array2 = create(y);

        System.out.println("Your first array is:");
        show(array1);
        System.out.println("Your second array is:");
        show(array2);

        boolean same = compare(array1, array2);


        if (same){
            System.out.println("They are the same array");
        }else{
            System.out.println("They are different arrays");
        }
    }
}

