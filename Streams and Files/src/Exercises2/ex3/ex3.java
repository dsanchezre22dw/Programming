package Exercises2.ex3;

import java.io.*;
import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        BufferedWriter out = null;
        Scanner sc = new Scanner(System.in);

        try {
            out = new BufferedWriter(new FileWriter( "strings.txt"));
            System.out.println("How many Strings do you want to write");
            int x = sc.nextInt();
            sc.nextLine();
            for (int i = 1; i <= x; i++){
                System.out.println("Write a String");
                String str = sc.nextLine(), aux = "";
                for (int j = str.length()-1; j >= 0; j--){
                    aux += str.charAt(j);
                }

                if (aux.length() > 30){
                    aux = aux.substring(0,30);
                }

                out.write(aux);
                if (i >= 1 && i < x){
                    out.newLine();
                }

            }

        }catch (FileNotFoundException a){
            System.out.println("File not found");
        }catch (IOException b){
            System.out.println("Exception");
        }

        try{
            if (out != null){
                out.close();
            }
        }catch (IOException e){
            System.out.println("IOException");
        }
    }
}
