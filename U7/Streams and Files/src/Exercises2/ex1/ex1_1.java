package Exercises2.ex1;

import java.io.*;
import java.util.Scanner;

public class ex1_1 {

    public static void main(String[] args) {

        BufferedWriter out = null;
        BufferedWriter out2 = null;
        BufferedReader in = null;
        Scanner sc = new Scanner(System.in);

        try {
            out = new BufferedWriter(new FileWriter(new File("src/Exercises2/ex1/files/nums.bin")));

            for (int i = 1; i <= 5; i++){
                System.out.println("Write a number");
                out.write(Integer.toString(sc.nextInt()) + " ");
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

        try {

            out2 = new BufferedWriter(new FileWriter(new File("src/Exercises2/ex1/files/nums.txt")));
            in = new BufferedReader(new FileReader(new File("src/Exercises2/ex1/files/nums.bin")));

            String n = in.readLine();

            String[] array = n.split(" ");

            for (int i=0; i<array.length-1; i++){
                out2.write(array[i]);
                out2.newLine();
            }
            out2.write(array[array.length-1]);

        }catch (FileNotFoundException a){
            System.out.println("File not found");
        }catch (IOException b){
            System.out.println("Exception");
        }

        try{
            if (out2 != null){
                out2.close();
            }

            if (in != null){
                in.close();
            }
        }catch (IOException e){
            System.out.println("IOException");
        }

    }
}
