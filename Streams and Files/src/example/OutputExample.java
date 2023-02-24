package example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputExample {

    public static void main(String[] args) {
        File outFile = new File("example.data");
        FileOutputStream streamOut = null;

        try{
            streamOut = new FileOutputStream(outFile);
            byte[] byteArray = {10, 20, 30, 40, 50, 60, 70, 80};
            streamOut.write(byteArray);
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException e){
            System.out.println("IOException");
        }

        try{
            if (streamOut != null){
                streamOut.close();
            }
        }catch (IOException e){
            System.out.println("IOException");
        }





    }
}
