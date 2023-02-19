package Exercises2.ex3;

import java.io.*;
import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        FileWriter out = null;
        FileWriter out2 = null;
        FileReader in = null;
        Scanner sc = new Scanner(System.in);

        try {
            out = new FileWriter(new File("src/Exercises2/ex1/files/nums.bin"));

            for (int i = 1; i <= 4; i++){
                System.out.println("Write a number");
                out.write(Integer.toString(sc.nextInt()) + " ");
            }
            System.out.println("Write a number");
            out.write(Integer.toString(sc.nextInt()));


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

            out2 = new FileWriter(new File("src/Exercises2/ex1/files/nums.txt"));
            in = new FileReader(new File("src/Exercises2/ex1/files/nums.bin"));

            int n = in.read();
            while (n != -1){
                if (n == 32){
                    out2.write("\n");
                }else{
                    out2.write(n);
                }
                n = in.read();
            }

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
