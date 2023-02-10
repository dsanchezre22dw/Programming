package Exercises4.Ex4;

import Exercises4.Ex2.Matrix1;
import java.util.Random;

import java.util.Arrays;

public class UnevenMatrix {

    private Float[][] nums;

    public UnevenMatrix(){
        this.nums = new Float[4][];

    }

    public void loadRow(Float[] array, int x) {

        this.nums[x] = Arrays.copyOf(array, array.length);
    }

    public void displayRow(int x){

        System.out.println(Arrays.toString(this.nums[x]));

    }

    public void displayMatrix(){

        System.out.println(Arrays.deepToString(this.nums));
    }

    public static void main(String[] args) {

        UnevenMatrix um1 = new UnevenMatrix();

        Float[] array1 = new Float[7];
        for (int i=0; i<array1.length; i++){
            array1[i] = (float)Math.pow(3, i);
        }
        um1.loadRow(array1, 0);

        Float[] array2 = new Float[5];
        for (int i=0; i<array2.length; i++){
            array2[i] = (float)Math.floor(Math.random()* (35 - 15 + 1) + 15);
        }
        um1.loadRow(array2, 1);

        Float[] array3 = new Float[7];
        int x = 0;
        for (int i=0; i<array3.length; i++){
            array3[i] = (float)Math.cos(x);
            x += 45;
        }
        um1.loadRow(array3, 2);

        Float[] array4 = {1f, 2f, 3f, 4f, 5f, 6f, 7f};
        um1.loadRow(array4, 3);

        um1.displayMatrix();


    }



}
