import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args){
        int i, f, j, count, code, hours, students;
        double practical_mark, theory_mark, sum_practical, sum_theory,best_practical = 0,  sum_duration;

        String sex, sex_best_practical = "";

        Scanner s = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Scanner scd = new Scanner(System.in);

        for (i = 1; i <= 5; i++){
            System.out.println("Enter the code of the subject " + i);
            code = s.nextInt();
            System.out.println("Enter the hours per week of the subject " + i);
            hours = s.nextInt();
            System.out.println("Enter the amount of students of the subject " + i);
            students = s.nextInt();
            for (f = 1; f <= students; f++){
                System.out.println("Enter the sex of the student " + f);
                sex = sc.next();
                System.out.println("Enter the practical mark of the student " + f);
                practical_mark = scd.nextDouble();
                System.out.println("Enter the theory mark of the student " + f);
                theory_mark = scd.nextDouble();
            }
        }




        sum_duration = 0;
        for (i = 1; i <= 5; i++){    //Each subject
            sum_practical = 0;
            sum_theory= 0;
            System.out.println("Enter the code of the subject " + i);
            code = s.nextInt();
            System.out.println("Enter the hours per week of the subject " + i);
            hours = s.nextInt();
            sum_duration += hours;
            System.out.println("Enter the amount of students of the subject " + i);
            students = s.nextInt();
            for (f = 1; f <= students; f++){        //Each students
                System.out.println("Enter the sex of the student " + f);
                sex = sc.next();
                System.out.println("Enter the practical mark of the student " + f);
                practical_mark = scd.nextDouble();
                System.out.println("Enter the theory mark of the student " + f);
                theory_mark = scd.nextDouble();
                if (f == 1){
                    best_practical = practical_mark;
                    sex_best_practical = sex;
                }else if (practical_mark>best_practical){
                    best_practical = practical_mark;
                    sex_best_practical = sex;
                }

                sum_practical += practical_mark;
                sum_theory += practical_mark;


                if (hours > 5 && hours < 15){
                    System.out.println("The average mark of the student " + f + " on the subject "
                            + i + "  is " + (practical_mark + theory_mark)/2);
                }

            }

            if (hours > 8){
                System.out.println("The average practical mark of the subject " + i + ", which takes more than 8 hours/week, is " + sum_practical / students
                        + " the average theory mark is " + sum_theory / students);
            }

            System.out.println("The sex of the student with the best practical mark on the subject " + i + " ("
                    + best_practical + ") is " + sex_best_practical);



        }
        System.out.println("The average subject duration is " + sum_duration/5);


    }
}

