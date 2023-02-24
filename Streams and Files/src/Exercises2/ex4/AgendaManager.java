package Exercises2.ex4;

import java.io.*;

public class AgendaManager {
    private String filename;

    public AgendaManager(String filename){
        this.filename = filename;
    }

    public void display(){

        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader(new File(this.filename)));

            int n = in.read();
            while (n != -1){
                if (n == 9){
                    System.out.print(" ");
                }else{
                    System.out.print((char)n);
                }
                n = in.read();
            }

        }catch (FileNotFoundException a){
            System.out.println("File not found");
        }catch (IOException b){
            System.out.println("Exception");
        }finally {
            try{
                if (in != null){
                    in.close();
                }
            }catch (IOException e){
                System.out.println("IOException");
            }
        }
    }

    public void addPerson(){

    }



    public static void main(String[] args) {
        AgendaManager am = new AgendaManager("people.txt");
        am.display();
    }

}
