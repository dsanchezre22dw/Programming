package example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example {

    public static void main(String[] args) {

        if (args.length != 1){
            System.out.println("File name missing");
        }else{
            FileInputStream streamIn = null;
            try{
                streamIn = new FileInputStream("src/example.data");
                int readbyte = streamIn.read();
                while (readbyte != -1){
                    System.out.println(readbyte);
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
            }catch (IOException e){
                System.out.println("IOException");
            }
        }

    }
}
