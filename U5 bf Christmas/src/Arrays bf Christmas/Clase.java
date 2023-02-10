package Package_Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Clase {

    public static int[][] create(int l, int w, int max, int min){
        int[][] nums = new int[l][w];
        for (int i = 0; i < l; i++){
            for (int j = 0; j < w; j++){
                nums[i][j] = (int)Math.floor(Math.random()*(max-min+1)+min);
            }
        }
        return nums;

    }

    public static int center(int[][] array){
        return array[array.length/2][array[0].length/2];
    }

    public static int positive_sum(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] > 0){
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    public static double positive_avg(int[][] array){
        double sum = 0.0;
        int count = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] > 0){
                    sum += array[i][j];
                    count++;
                }
            }
        }
        return (sum/count);

    }

    public static int negative_sum(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] < 0){
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }


    public static double negative_avg(int[][] array){
        double sum = 0.0;
        int count = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] < 0){
                    sum += array[i][j];
                    count++;
                }
            }
        }
        return (sum/count);
    }

    public static int total_sum(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                sum += array[i][j];

            }
        }
        return sum;
    }

    public static double total_avg(int[][] array){
        double sum = 0.0;
        int count = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                sum += array[i][j];
                count++;
            }
        }
        return (sum/count);
    }


    public static void show(int[][] array){

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("How long will your matrix be?");
        int l = s.nextInt();
        System.out.println("How wide will your matrix be?");
        int w = s.nextInt();

        int max = 10;
        int min = -10;

        int[][] nums = create(l, w, max, min);

        System.out.println("This is your matrix:");
        show(nums);

        int center = center(nums);
        System.out.println("Its center value is " + center);

        int positive_sum = positive_sum(nums);
        System.out.println("The sum of its positive numbers is " + positive_sum);

        double positive_avg = positive_avg(nums);
        System.out.println("The average of its positive numbers is " + positive_avg);

        int negative_sum = negative_sum(nums);
        System.out.println("The sum of its negative numbers is " + negative_sum);

        double negative_avg = negative_avg(nums);
        System.out.println("The average of its negative numbers is " + negative_avg);

        int total_sum = total_sum(nums);
        System.out.println("The sum of all of its numbers is " + total_sum);

        double total_avg = total_avg(nums);
        System.out.println("The average of all of its numbers is " + total_avg);




    }

}
