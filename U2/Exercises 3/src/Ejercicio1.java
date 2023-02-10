import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args){
        int i, f, count, code, min_code=0;
        double mark, max, min, sum, total_min=0.0;

        Scanner s = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);


        for ( i = 1; i <= 10; i++){
            System.out.println("Enter the code of the student " + i);
            code = sc.nextInt();
            for (f = 1; f <= 5; f++){
                System.out.println("Enter his mark of the subject " + f);
                mark = s.nextDouble();
            }
        }


        count=0;
        sum = 0.0;
        for(i = 1; i<=10; i++){
            System.out.println("Enter the code of the student " + i );
            code = sc.nextInt();
            System.out.println("Enter his first mark");
            mark = s.nextDouble();
            max = mark;
            min = mark;
            sum+=mark;
            for(f = 1; f<=4; f++){
                System.out.println("Enter the next mark of your student " + i);
                mark = s.nextDouble();
                if (mark>max){
                    max = mark;
                }else if (mark<min){
                    min= mark;
                }

            }
            if (i==1){
                total_min=min;
                min_code=code;
            }else if (min<total_min){
                total_min=min;
                min_code=code;
            }

            System.out.println("The maximum mark for the student " + i + " is " + max + " and the minimum mark is " + min);
            if (max > 8){
                count++;
            }


        }
        System.out.println(count + " student(s) have achieved a maximum mark greater than 8.");
        System.out.println("The average mark in the first subject is  " + sum/10);
        System.out.println("The code of the student with the minimum mark (" + total_min + ") is " + min_code);


    }
}

