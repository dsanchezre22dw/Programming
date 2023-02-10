package Exercises1;
import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args){
        int[] array1 = new int[10];
        Arrays.fill(array1, 10);

        int[] array2 = Arrays.copyOf(array1, 1);

        for (int i=0; i<array2.length; i++){
            System.out.println(array2[i]);
        }
    }



}
