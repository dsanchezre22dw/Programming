package Exercises4.Ex2;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix1 {
    private int[][] matrix;
    private int NR = 10;
    private int NC = 15;

    public Matrix1(){
        this.matrix = new int[NR][NC];
    }

    public Matrix1(int rows, int columns){
        if (rows >= 0){
            this.NR = rows;
        }else{
            this.NR = 1;
        }

        if (columns >= 0){
            this.NC = columns;
        }else{
            this.NC = 1;
        }

        this.matrix = new int[NR][NC];
    }

    public void loadByRows(Scanner sc){

        for (int i = 0; i < this.NR; i++){
            for (int j = 0; j < this.NC; j++){
                System.out.println("Enter the number of the position (" + i + ", " + j + ")");
                this.matrix[i][j] = sc.nextInt();
            }
        }

    }

    public void loadByColumns(Scanner sc){

        for (int i = 0; i < this.NR; i++){
            for (int j = 0; j < this.NC; j++){
                System.out.println("Enter the number of the position (" + j + ", " + i + ")");
                this.matrix[j][i] = sc.nextInt();
            }
        }
    }

    public void display(){
        for (int i = 0; i < this.NR; i++){
            for (int j = 0; j < this.NC; j++){
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void reverseRows(){
        int aux;
        for (int i = 0; i < this.NR; i++){
            for (int j = 0; j < this.NC / 2; j++){
                aux = this.matrix[i][j];

                this.matrix[i][j] = this.matrix[i][j + (this.NC-1) - 2*j];

                this.matrix[i][j + (this.NC-1) - 2*j] = aux;
            }
        }
    }

    public boolean swapRows(int x, int y){

        if ((x >= 1 && x <= NR) && (y >= 1 && y <= NR)){
            int[] aux1 = Arrays.copyOf(this.matrix[x-1], NC);

            this.matrix[x-1] = Arrays.copyOf(this.matrix[y-1], NC);
            this.matrix[y-1] = Arrays.copyOf(aux1, NC);
            return true;
        }

        return false;





    }

    public boolean swapColumns(int x, int y){

        if ((x >= 1 && x <= NC) && (y >= 1 && y <= NC)){

            int aux;
            for (int i=0; i<this.NR; i++){
                aux = this.matrix[i][y];
                this.matrix[i][y] = this.matrix[i][x];
                this.matrix[i][x] = aux;
            }
            return true;
        }
        return false;
    }

    public int[] biggestAvgRow(){

        int ind = -1;
        int max = 0;

        for (int i = 0; i < this.NR; i++){
            int sum = 0;
            for (int j = 0; j < this.NC; j++){
                sum += this.matrix[i][j];
            }
            if (i == 0){
                max = sum;
                ind = i;
            }else{
                if (sum > max){
                    max = sum;
                    ind = i;
                }
            }

        }
        return this.matrix[ind];

    }

    public int[] negatives(){
        int amount = 0;

        for (int i = 0; i < this.NR; i++){
            for (int j = 0; j < this.NC; j++){
                if (this.matrix[i][j] <= 0){
                    amount++;
                }
            }
        }

        int[] negatives = new int[amount];
        int x = 0;

        for (int i = 0; i < this.NR; i++){
            for (int j = 0; j < this.NC; j++){
                if (this.matrix[i][j] <= 0){
                    negatives[x] = this.matrix[i][j];
                    x++;
                }
            }
        }

        return negatives;
    }






}
