package Exercises2.ex2;

import java.io.*;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        BufferedReader in = null;
        BufferedWriter out = null;
        BufferedWriter out2 = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the number of the file 1");
        String name1 = sc.next();
        System.out.println("Write the number of the file 2");
        String name2 = sc.next();
        System.out.println("Write the number of the file 3");
        String name3 = sc.next();

        try {
            in = new BufferedReader(new FileReader(new File("src/Exercises2/ex2/files/" + name1)));
            out = new BufferedWriter(new FileWriter(new File("src/Exercises2/ex2/files/" + name2)));

            int n = in.read();
            while (n != -1){
                out.write(n);
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
        }catch (IOException e){
            System.out.println("IOException");
        }

        try {
            in = new BufferedReader(new FileReader(new File("src/Exercises2/ex2/files/" + name1)));
            out2 = new BufferedWriter(new FileWriter(new File("src/Exercises2/ex2/files/" + name3)));
            char[] buffer = new char[20];
            int n = in.read(buffer);
            while (n > 0){
                out2.write(buffer, 0, n);
                n = in.read(buffer);
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

            if (out2 != null){
                out2.close();
            }
        }catch (IOException e){
            System.out.println("IOException");
        }





    }
}

