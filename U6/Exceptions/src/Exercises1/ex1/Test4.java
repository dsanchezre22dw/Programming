package Exercises1.ex1;

import java.io.IOException;

public class Test4 {
    private static int method(){
        int value = 0;
        try{
            value = value + 1;
            value = value + Integer.parseInt("s");
            value = value + 1;
            System.out.println("Value at the end of try block:" + value);
            throw new IOException();
        }
        catch (IOException e){
            value = value + Integer.parseInt("42");
            System.out.println("Value at the end of catch block:" + value);
        }finally {
            value = value + 1;
            System.out.println("Value at the end of finally block:" + value);
        }
        value = value + 1;
        System.out.println("Value before return:" + value);
        return value;
    }

    public static void main(String[] args) {
        try{
            System.out.println(method());
        }catch (Exception e){
            System.err.println("Exception in method()");
            e.printStackTrace();
        }
    }

}
