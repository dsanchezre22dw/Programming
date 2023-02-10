package Package_Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Array {


    public static void Exercise1(int x){
        int[] nums = new int[x];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < nums.length; i++){
            System.out.println("Write the number of the position " + i);
            nums[i] = s.nextInt();
        }

        for (int i=0; i < nums.length; i++){
            System.out.println("The number of the position " + i + " of the array is: " + nums[i]);
        }
    }

    public static void Exercise2(int x){
        int[] nums = new int[x];
        int i, sum;
        for (i = 0; i < nums.length; i++){
            nums[i] = i+1;
        }
        sum = 0;
        for (i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        System.out.println("The sum of all the values in the array is " + sum + " and the average is " + ((double)sum)/nums.length);
    }

    public static void Exercise3(int x){
        char[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
                'V', 'H', 'L', 'C', 'K', 'E'};

        System.out.println("Your full DNI is "+ x + letters[x%23]);

    }

    public static void Exercise4(int x){
        int i;
        double[] marks = new double[x];
        String[] names = new String[x];

        Scanner s = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        for (i = 0; i < marks.length; i++){
            System.out.println("Write the mark and the name of the student " + (i+1));
            double number = s.nextDouble();

            while (!((number >= 0) && (number <= 10))){
                System.out.println("Invalid mark, try again");
                number = s.nextDouble();

            }
            marks[i] = number;
            names[i] = sc.next();
        }

        char[] words = new char[x];
        for (i = 0; i < marks.length; i++){
            if (marks[i] >= 0 && marks[i] <= 4.99) {
                words[i] = 'D';
            }else if (marks[i] >= 5 && marks[i] <= 6.99){
                words[i] = 'c';
            }else if (marks[i] >= 7 && marks[i] <= 8.99){
                words[i] = 'B';
            }else{
                words[i] = 'A';
            }
        }

        for (i=0; i < names.length; i++){
            System.out.println("The student " + names[i] + " got a " + marks[i] + ", which is a " +words[i]);
        }

    }

    public static void Exercise5(int x){
        int i;
        int[] nums = new int[x];

        for (i = 0; i < nums.length; i++){
            nums[i] = i+1;
        }

        int[] inverted = new int[x];

        for (i = 0; i < inverted.length; i++){
            inverted[i] = nums[(nums.length-1)-i];
        }

        for (int elem:inverted){
            System.out.println(elem);
        }

        //System.out.println(Arrays.toString(nums));
        //System.out.println(Arrays.toString(inverted));
    }



    public static void Exercise6(){
        int i, students, count;
        double sum;
        Scanner s = new Scanner(System.in);

        System.out.println("How many students are there in the class?");
        students = s.nextInt();

        if (students > 0){
            double[] grades = new double[students];

            for (i = 0; i < grades.length; i++){
                System.out.println("Introduce the grade of the student " + (i+1));
                grades[i] = s.nextDouble();
            }

            sum = 0.0;
            count = 0;
            for (i = 0; i < grades.length; i++){
                sum += grades[i];
                count++;
            }


            System.out.println("The average grade of the group is " + sum / count);


            for (i = 0; i < grades.length; i++){
                if (grades[i] > sum / count) {
                    System.out.println("The student " + (i+1) + "got a grade above the average");
                }
            }
        }
    }


    public static void main(String[] args){
        int l, dni;
        Scanner s = new Scanner(System.in);


        System.out.println("How long will the array be?");
        l = s.nextInt();
        Exercise1(l);

        System.out.println();

        System.out.println("How long will the array be?");
        l = s.nextInt();
        Exercise2(l);

        System.out.println();

        System.out.println("Introduce your DNI:");
        dni = s.nextInt();
        Exercise3(dni);

        System.out.println();

        System.out.println("How long will the arrays be?");
        l = s.nextInt();
        Exercise4(l);

        System.out.println();

        System.out.println("How long will the arrays be?");
        l = s.nextInt();
        Exercise5(l);

        System.out.println();

        Exercise6();

        System.out.println();



    }

}