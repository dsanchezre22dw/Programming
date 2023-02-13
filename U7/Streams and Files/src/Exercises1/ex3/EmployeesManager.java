package Exercises1.ex3;

import java.io.*;
import java.util.List;

public class EmployeesManager {

    private String filename;

    public EmployeesManager(String filename){
        this.filename = filename;
    }

    public void saveEmployees(List<Employee> emps){

        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("src/Exercises1/ex3/files/" + this.filename));
            for (Employee elem:emps){
                oos.writeObject(elem);
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("Exception");
        }

        try{
            if (oos != null){
                oos.close();
            }
        }catch (IOException e){
            System.out.println("IOException");
        }
    }

    public void displayEmployees(){

        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("src/Exercises1/ex3/files/" + this.filename));
            while (ois.available() > 0){
                Employee emp = (Employee)ois.readObject();
                emp.display();
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("Exception");
        }catch (ClassNotFoundException e){
            System.out.println("Class not found");
        }

        try{
            if (ois != null){
                ois.close();
            }
        }catch (IOException e){
            System.out.println("IOException");
        }

    }

}
