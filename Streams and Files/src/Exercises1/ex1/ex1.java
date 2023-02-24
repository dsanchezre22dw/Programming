package Exercises1.ex1;

import java.io.*;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        File outFile = new File("src/Exercises1/files/dog_CPY.jpg");
        FileInputStream streamIn = null;
        FileOutputStream streamOut = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the name of the file?");
        String x = sc.next();

        try{
            streamIn = new FileInputStream("src/Exercises1/files/" + x);
            streamOut = new FileOutputStream(outFile);
            int readbyte = streamIn.read();
            while (readbyte != -1){
                streamOut.write(readbyte);
                readbyte = streamIn.read();
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
