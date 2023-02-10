import java.util.Scanner;

public class Ejercicio6{

    public static void main(String[] args){
        int i, j, k, l, number_town, number_family, number_children, large_families;
        double salary, area_town;

        String id_province, area_province, id_town, id_family;

        Scanner s = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Scanner scd = new Scanner(System.in);

        for (i = 1; i <= 4; i++){
            System.out.println("Enter the identification code of the province " + i);
            id_province = scd.next();
            System.out.println("Enter the area code of the province " + i);
            area_province = scd.next();
            System.out.println("Enter the amount of towns of the province " + i);
            number_town = s.nextInt();
            for (j = 1; j <= number_town; j++){
                System.out.println("Enter the identification code of the town " + j + " of the province " + i);
                id_town = scd.next();
                System.out.println("Enter the area of the town " + j + " of the province " + i);
                area_town = sc.nextDouble();
                System.out.println("Enter the amount of families of the town " + j + " of the province " + i);
                number_family = s.nextInt();


                for (k = 1; k <= number_family; k++){
                    System.out.println("Enter the id number of the head of the  " + k + " .family of the town " + j + " of the province " + i);
                    id_family = scd.next();
                    System.out.println("Enter the salary of the family " + k + " of the town " + j + " of the province " + i);
                    salary = sc.nextDouble();
                    System.out.println("Enter the number of children of the family " + k + " of the town " + j + " of the province " + i);
                    number_children = s.nextInt();

                }
            }
        }


        for (i = 1; i <= 4; i++){
            large_families = 0;
            System.out.println("Enter the identification code of the province " + i);
            id_province = scd.next();
            System.out.println("Enter the area code of the province " + i);
            area_province = scd.next();
            System.out.println("Enter the amount of towns of the province " + i);
            number_town = s.nextInt();
            for (j = 1; j <= number_town; j++){
                System.out.println("Enter the identification code of the town " + j + " of the province " + i);
                id_town = scd.next();
                System.out.println("Enter the area of the town " + j + " of the province " + i);
                area_town = sc.nextDouble();
                System.out.println("Enter the amount of families of the town " + j + " of the province " + i);
                number_family = s.nextInt();
                for (k = 1; k <= number_family; k++){
                    System.out.println("Enter the id number of the head of the  " + k + " .family of the town " + j + " of the province " + i);
                    id_family = scd.next();
                    System.out.println("Enter the salary of the family " + k + " of the town " + j + " of the province " + i);
                    salary = sc.nextDouble();
                    System.out.println("Enter the number of children of the family " + k + " of the town " + j + " of the province " + i);
                    number_children = s.nextInt();
                    if (number_children >= 2){
                        large_families++;
                    }
                }
            }
            System.out.println("The province " + i + " has " + large_families + " large families ");
        }

    }
}

