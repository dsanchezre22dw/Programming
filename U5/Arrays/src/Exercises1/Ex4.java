package Exercises1;

import java.util.Arrays;
import java.util.Collections;

public class Ex4 {

    public static void main(String[] args){
        int[] array = {3, 7, -2, -9, 5};
        Arrays.sort(array);

        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

    }
}
