package Package_Arrays;

import java.util.Scanner;

public class Clase3 {

    public static double[] alternate(double[] array1, double[] array2){
        double[] total = new double[array1.length + array2.length];
        int count = 1, min, i;
        double[] big;

        if (array1.length >= array2.length){
            min = array2.length;
            big = array1;
        }else{
            min = array1.length;
            big = array2;
        }
        i = 0;
        while (i < min*2){
            if (i%2 == 0){
                total[i] = array1[i/2];
            }else{
                total[i] = array2[i-count];
                count++;
            }
            i++;
        }
        int x = i;
        int z = min;
        for (i = x; i < (array1.length + array2.length); i++){
            total[i] = big[z];
            z++;
        }
        return total;
    }


    public static void show_array(String[] array){
        if (array !=null){
            for (int i = 0; i < array.length; i++){

                System.out.print(array[i] + " ");
            }
            System.out.println();
        }else{
            System.out.println("The array is nulL");
        }
    }

    public static void show_matrix(double[][] matrix){
        if (matrix !=null){
            for (int i = 0; i < matrix.length; i++){
                for (int j = 0; j < matrix[i].length; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }else{
            System.out.println("The matrix is nulL");
        }
    }

    public static int find(double[] array, int x){

        for (int i = 0; i < array.length; i++){
            if (array[i] == x){
                return i;
            }
        }
        return (-1);
    }

    public static double[] delete(double[] array, int x){

        if (x >= 0 && x <= (array.length-1)){
            double[] nuevo = new double[array.length-1];
            int cuenta = 0, i;

            for (i = 0; i < array.length-1; i++){

                if (i == x){
                    cuenta++;
                }

                nuevo[i] = array[cuenta];
                cuenta++;
            }
            return nuevo;
        }
        return null;
    }

    public static double[] delete2(double[] array, int[] array2){

        int i = 0, j;
        double[] nuevo = new double[array.length- array2.length];

        int cuenta = 0;
        while (i < array2.length){

            if (array2[i] >= 0 && array2[i] <= (array.length - 1)){

                for (j = 0; j < array.length - array2.length; j++){

                    if (cuenta == array2[i]){
                        cuenta++;
                        i++;
                        while (cuenta == array2[i]) {
                            cuenta++;
                            i++;
                        }
                    }

                    nuevo[j] = array[cuenta];
                    cuenta++;

                }
                return null;
            }
        }
        return nuevo;

    }

    public static double sum_upper_triangle(double[][] matrix){

        int i, j;
        double sum = 0;

        for (i = 0; i < matrix.length; i++){
            for (j = i; j < matrix[i].length; j++){
                sum += matrix[i][j];
            }
        }

       return sum;

    }

    public static boolean different(double[] array1, double[] array2){
        if(array1.length != array2.length){
            return true;
        }

        for (int i = 0; i < array1.length; i++){
            if (array1[i] == array2[i]){
                return false;
            }
        }
        return true;
    }

    public static double[][] combination(double[] array, int number){
        int i,  count = 0, ind = 0;

        double[][] result = new double[array.length/2][2];

        for (i = 0; i < array.length/2; i++){
            if (array[i*2] + array[i*2+1] == number){
                double[] sum = {array[i*2], array[i*2+1]};
                result[ind] = sum;
                count++;
            }else{
                double[] sum = {0.0, 0.0};
                result[ind] = sum;
            }
            ind++;
        }

        if (count > 0){
            return result;
        }

        return null;

    }
    public static double[][] clear(double[][] matrix){
        int i, count = 0, count2 = 0;

        double[] z = {0.0, 0.0};

        for (i = 0; i < matrix.length; i++){
            if (matrix[i][0] == 0.0 && matrix[i][1] == 0.0){
                count++;
            }
        }

        double[][] result = new double[matrix.length - count][2];


        for (i = 0; i < result.length; i++){
            if (matrix[count2][0] == 0.0 && matrix[count2][1] == 0.0){
                count2++;
                while (matrix[count2][0] == 0.0 && matrix[count2][1] == 0.0){
                    count2++;
                }
            }

            result[i] = matrix[count2];
            count2++;
        }

        return result;

    }


    public static String[] alternate_Strings(String[] array1, String[] array2){
        int i, count_lower1 = 0, count_upper1 = 0, count_lower2 = 0, count_upper2 = 0, l, count = 0;

        for (i = 0; i < array1.length; i++){
            if (array1[i].equals("a") || array1[i].equals("e") || array1[i].equals("i") || array1[i].equals("o") || array1[i].equals("u")){
                count_lower1++;
            }else if (array1[i].equals("A") || array1[i].equals("E") || array1[i].equals("I") || array1[i].equals("O") || array1[i].equals("U")){
                count_upper1++;
            }
        }

        for (i = 0; i < array2.length; i++){
            if (array2[i].equals("a") || array2[i].equals("e") || array2[i].equals("i") || array2[i].equals("o") || array2[i].equals("u")){
                count_lower2++;
            }else if (array2[i].equals("A") || array2[i].equals("E") || array2[i].equals("I") || array2[i].equals("O") || array2[i].equals("U")){
                count_upper2++;
            }
        }

        String[] lower1 = new String[count_lower1];
        String[] upper1 = new String[count_upper1];
        String[] lower2 = new String[count_lower2];
        String[] upper2 = new String[count_upper2];


        count_lower1 = 0;
        count_upper1= 0;
        for (i = 0; i < array1.length; i++){
            if (array1[i].equals("a") || array1[i].equals("e") || array1[i].equals("i") || array1[i].equals("o") || array1[i].equals("u")){
                if (array1[i].equals("a")){
                    lower1[count_lower1] = "a";
                    count_lower1++;

                }else if (array1[i].equals("e")){
                    lower1[count_lower1] = "e";
                    count_lower1++;

                }else if (array1[i].equals("i")){
                    lower1[count_lower1] = "i";
                    count_lower1++;

                }else if (array1[i].equals("o")){
                    lower1[count_lower1] = "o";
                    count_lower1++;

                }else{
                    lower1[count_lower1] = "u";
                    count_lower1++;

                }

            }else if (array1[i].equals("A") || array1[i].equals("E") || array1[i].equals("I") || array1[i].equals("O") || array1[i].equals("U")){
                if (array1[i].equals("A")){
                    upper1[count_upper1] = "A";
                    count_upper1++;

                }else if (array1[i].equals("E")){
                    upper1[count_upper1] = "E";
                    count_upper1++;

                }else if (array1[i].equals("I")){
                    upper1[count_upper1] = "I";
                    count_upper1++;

                }else if (array1[i].equals("O")){
                    upper1[count_upper1] = "O";
                    count_upper1++;

                }else{
                    upper1[count_upper1] = "U";
                    count_upper1++;

                }
            }
        }

        count_lower2 = 0;
        count_upper2= 0;
        for (i = 0; i < array2.length; i++){
            if (array2[i].equals("a") || array2[i].equals("e") || array2[i].equals("i") || array2[i].equals("o") || array2[i].equals("u")){
                if (array2[i].equals("a")){
                    lower2[count_lower2] = "a";
                    count_lower2++;

                }else if (array2[i].equals("e")){
                    lower2[count_lower2] = "e";
                    count_lower2++;

                }else if (array2[i].equals("i")){
                    lower2[count_lower2] = "i";
                    count_lower2++;

                }else if (array2[i].equals("o")){
                    lower2[count_lower2] = "o";
                    count_lower2++;

                }else{
                    lower2[count_lower2] = "u";
                    count_lower2++;

                }

            }else if (array2[i].equals("A") || array2[i].equals("E") || array2[i].equals("I") || array2[i].equals("O") || array2[i].equals("U")){
                if (array2[i].equals("A")){
                    upper2[count_upper2] = "A";
                    count_upper2++;

                }else if (array2[i].equals("E")){
                    upper2[count_upper2] = "E";
                    count_upper2++;

                }else if (array2[i].equals("I")){
                    upper2[count_upper2] = "I";
                    count_upper2++;

                }else if (array2[i].equals("O")){
                    upper2[count_upper2] = "O";
                    count_upper2++;

                }else{
                    upper2[count_upper2] = "U";
                    count_upper2++;

                }
            }
        }


        l = count_lower1 + count_upper1 + count_lower2 + count_upper2;
        String[] result = new String[l];
        count = 0;

        for (i = 0; i < count_lower1; i++){
            result[count] = lower1[i];
            count++;
        }

        for (i = 0; i < count_lower2; i++){
            result[count] = lower2[i];
            count++;
        }

        for (i = 0; i < count_upper1; i++){
            result[count] = upper1[i];
            count++;
        }

        for (i = 0; i < count_upper2; i++){
            result[count] = upper2[i];
            count++;
        }

        return result;

    }


    public static void main(String[] args){


        String[] array1 = {"A", "d", "e", "f", "g", "a"};
        String[] array2 = {"B", "c", "i", "o", "U"};
        String [] array3 = alternate_Strings(array1, array2);
        show_array(array3);


    }
}

