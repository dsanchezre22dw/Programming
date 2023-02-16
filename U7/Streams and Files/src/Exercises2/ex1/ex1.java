package Exercises2.ex1;

import java.io.*;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        FileWriter out = null;
        FileWriter out2 = null;
        FileReader in = null;
        Scanner sc = new Scanner(System.in);

        try {
            out = new FileWriter(new File("src/Exercises2/ex1/files/nums.bin"));

            /*
            for (int i = 1; i <= 5; i++){
                System.out.println("Write a number");
                out.write(sc.nextInt());
            }
            */

            out.write(9);

            out2 = new FileWriter(new File("src/Exercises2/ex1/files/nums.txt"));
            in = new FileReader(new File("src/Exercises2/ex1/files/nums.bin"));

            int n = in.read();
            while (n != -1){
                out2.write(Integer.toString(n) + "\n");
                n = in.read();
            }

        }catch (FileNotFoundException a){
            System.out.println("File not found");
        }catch (IOException b){
            System.out.println("Exception");
        }

        try{
            if (in != null){
                in.close();
            }

            if (out != null){
                out.close();
            }

            if (out2 != null){
                out2.close();
            }
        }catch (IOException e){
            System.out.println("IOException");
        }
    }
}
