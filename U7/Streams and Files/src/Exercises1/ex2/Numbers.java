package Exercises1.ex2;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class Numbers{

    public static int generate1Num(int max, int min){
        return (int) Math.floor(Math.random()*(max - min +1)) + min;
    }

    public static List<Integer> generateNums(int max, int min, int amount){
        List<Integer> nums = new ArrayList<Integer>(amount);
        for (int i = 1; i <= amount; i++){
            nums.add(generate1Num(max, min));
        }
        return nums;
    }

    public static void add1Num(String file_name, int x){
        DataOutputStream dos = null;

        try {
            dos = new DataOutputStream(new FileOutputStream("src/Exercises1/ex2/files/" + file_name, true));
            dos.writeInt(x);
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("IOException");
        }

        try{
            if (dos != null){
                dos.close();
            }
        }catch (IOException e){
            System.out.println("IOException");
        }

    }

    public static void addNums(String file_name, List<Integer> nums){

        DataOutputStream dos = null;

        try {
            dos = new DataOutputStream(new FileOutputStream("src/Exercises1/ex2/files/" + file_name, true));
            for (Integer elem:nums){
                dos.writeInt(elem);
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("IOException");
        }

        try{
            if (dos != null){
                dos.close();
            }
        }catch (IOException e){
            System.out.println("IOException");
        }
    }

    public static Integer findInFile(String file_name, int p){
        int ind = 0;
        DataInputStream dis = null;

        try {
            dis = new DataInputStream(new FileInputStream("src/Exercises1/ex2/files/" + file_name));
            while (ind <= p-2){
                dis.readInt();
                ind++;
            }
            return (Integer) dis.readInt();

        }catch (FileNotFoundException e){
            System.out.println("File not found");

        }catch (IOException e){
            System.out.println("IOException");
        }


        try{
            if (dis != null){
                dis.close();
            }
        }catch (IOException e){
            System.out.println("IOException");
        }

        return -1;
    }

    public static void displayFile(DataInputStream dis){

        try {
            while (dis.available() > 0){
                System.out.print(dis.readInt() + " ");
            }
            System.out.println();
            dis.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("IOException");
        }
    }

    public static void main(String[] args) {
        //Creation of the ArrayList with some random numbers
        List<Integer> nums = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++){
            nums.add(generate1Num(0, 50));
        }

        //Addition of the numbers in the ArrayList to the file "file1.bin"
        addNums("file1.bin", nums);
        //Addition of a random number to the file "file1.bin"
        add1Num("file1.bin", generate1Num(5, 1));
        //Addition of a new ArrayList with random numbers to the file "file1.bin"
        addNums("file1.bin", generateNums(4, 1, 5));

        //Display of "file1.bin"
        try {
            displayFile(new DataInputStream(new FileInputStream("src/Exercises1/ex2/files/file1.bin")));
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }

        //Display of the 6.number in "file1.bin"
        System.out.println(findInFile("file1.bin", 6));

        //Display of the last number in "file1.bin"
        try {
            int x = 0;
            DataInputStream dis = new DataInputStream(new FileInputStream("src/Exercises1/ex2/files/file1.bin"));
            while (dis.available() > 0){
                dis.readInt();
                x++;
            }
            System.out.println(findInFile("file1.bin", x));
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("IOException");
        }

        //Addition of 10 random numbers to "file2.bin"
        addNums("file2.bin", generateNums(60, 50, 10));

        //Addition of the numbers in odd positions in "file1.bin" to "file2.bin"
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream("src/Exercises1/ex2/files/file1.bin"));
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/Exercises1/ex2/files/file2.bin", true));
            int x = 0;
            while (dis.available() > 0){
                int readbyte = dis.readInt();
                if (x%2 == 0){
                    dos.writeInt(readbyte);
                }
                x++;
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("IOException");
        }


        //Display of "file1.bin" and "file2.bin"
        try {
            displayFile(new DataInputStream(new FileInputStream("src/Exercises1/ex2/files/file1.bin")));
            displayFile(new DataInputStream(new FileInputStream("src/Exercises1/ex2/files/file2.bin")));
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }




    }
}
