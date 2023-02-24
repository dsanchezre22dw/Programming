package Exercises1.ex1;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ex1_2 {
    public static void main(String[] args) {
        byte[] byteArray = new byte[512];
        File outFile = new File("src/Exercises1/files/dog_CPY_2.jpg");
        FileInputStream streamIn = null;
        FileOutputStream streamOut = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the name of the file?");
        String x = sc.next();
        try{
            streamIn = new FileInputStream("src/Exercises1/files/" + x);
            streamOut = new FileOutputStream(outFile);

            int y = streamIn.read(byteArray);

            while (y != -1){
                streamOut.write(byteArray);
                Arrays.fill(byteArray, (byte) 0);
                y = streamIn.read(byteArray);
            }

        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("IOException");
        }

        try{
            if (streamIn != null){
                streamIn.close();
            }
            if (streamOut != null){
                streamOut.close();
            }
        }catch (IOException e){
            System.out.println("IOException");
        }
    }
}
