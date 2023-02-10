package Exercises1;

import java.util.Arrays;

public class Ex3 {

    public static void main(String[] args){
        int[] array1 = {2, 7, 4, 3};
        int[] array2 = {2, 7, 4, 5};

        if (Arrays.equals(array1, array2)){
            System.out.println("They ARE equal");
        }else{
            System.out.println("They ARE NOT equal");
        }


    }
}
