package Exercises1.ex3;

import java.io.*;
import java.util.ArrayList;
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
            oos.writeObject(null);
        }catch (FileNotFoundException a){
            System.out.println("File not found");
        }catch (IOException b){
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
            Employee emp = (Employee)ois.readObject();
            while (emp != null){
                emp.display();
                emp = (Employee)ois.readObject();
            }
        }catch (FileNotFoundException a){
            System.out.println("File not found");
        }catch (IOException b){
            System.out.println("Exception");
        }catch (ClassNotFoundException c){
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

    public Employee searchEmployee(String empname){

        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("src/Exercises1/ex3/files/" + this.filename));
            Employee emp = (Employee)ois.readObject();
            while (emp != null){
                if (emp.getName().equalsIgnoreCase(empname)){
                    return emp;
                }
                emp = (Employee)ois.readObject();
            }
        }catch (FileNotFoundException a){
            System.out.println("File not found");
        }catch (IOException b){
            System.out.println("Exception");
        }catch (ClassNotFoundException c){
            System.out.println("Class not found");
        }

        try{
            if (ois != null){
                ois.close();
            }
        }catch (IOException e){
            System.out.println("IOException");
        }

        System.out.println("There is not any employee with that name");
        return null;
    }

    public void generateMobilesFile(String filename){

        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("src/Exercises1/ex3/files/" + filename));
            ois = new ObjectInputStream(new FileInputStream("src/Exercises1/ex3/files/" + this.filename));
            Employee emp = (Employee)ois.readObject();
            while (emp != null){
                emp.getMp().setCredit(0);
                oos.writeObject(emp.getMp());
                emp = (Employee)ois.readObject();
            }
            oos.writeObject(null);
        }catch (FileNotFoundException a){
            System.out.println("File not found");
        }catch (IOException b){
            System.out.println("Exception");
        }catch (ClassNotFoundException c){
            System.out.println("Class not found");
        }

        try{
            if (oos != null){
                oos.close();
            }

            if (ois != null){
                ois.close();
            }
        }catch (IOException e){
            System.out.println("IOException");
        }
    }

    public void workEveryone(){
        ObjectInputStream ois = null;
        List<Employee> emps = new ArrayList<Employee>();

        try {
            ois = new ObjectInputStream(new FileInputStream("src/Exercises1/ex3/files/" + this.filename));
            Employee emp = (Employee)ois.readObject();
            while (emp != null){
                emp.work();
                emps.add(emp);
                emp = (Employee)ois.readObject();
            }

            saveEmployees(emps);
        }catch (FileNotFoundException a){
            System.out.println("File not found");
        }catch (IOException b){
            System.out.println("Exception");
        }catch (ClassNotFoundException c){
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

    public static void main(String[] args) {

        //Creation of an EmployeesManager object, with the file "employees.data"
        EmployeesManager em = new EmployeesManager("employees.data");

        //Creation of an arrayList and addition of 5 employees
        List<Employee> emps = new ArrayList<Employee>(5);
        emps.add(new Employee("David", 2203.45, new MobilePhone("624873214", 15)));
        emps.add(new Employee("Mikel", 1721.97, new MobilePhone("698993201", 27)));
        emps.add(new Employee("Ruben", 1983.32, new MobilePhone("645980432", 64)));
        emps.add(new Employee("Irene", 5213.56, new MobilePhone("612666954", 98)));
        emps.add(new Employee("Miriam", 1243.89, new MobilePhone("632547002", 3)));

        //Saving the arrayList in a file
        em.saveEmployees(emps);

        //Display of the employees inside the file
        em.displayEmployees();
        System.out.println();
        //Looking for an employee called "Mikel" (existing)
        em.searchEmployee("Mikel").display();

        //Looking for an employee called "Manuel" (non-existing)
        em.searchEmployee("Manuel");
        System.out.println();
        //Generation of the files with the mobiles
        em.generateMobilesFile("mobiles.data");

        //Display of the file with the mobiles
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("src/Exercises1/ex3/files/mobiles.data"));
            MobilePhone mp = (MobilePhone) ois.readObject();
            while (mp != null){
                mp.display();
                System.out.println();
                mp = (MobilePhone) ois.readObject();
            }
        }catch (FileNotFoundException a){
            System.out.println("File not found");
        }catch (IOException b){
            System.out.println("Exception");
        }catch (ClassNotFoundException c){
            System.out.println("Class not found");
        }

        try{
            if (ois != null){
                ois.close();
            }
        }catch (IOException e){
            System.out.println("IOException");
        }
        System.out.println();

        //workEveryone() and displayEmployees()
        em.displayEmployees(); //Display of all the employees before working
        System.out.println();
        em.workEveryone(); //All the employees work (David, Mikel, and Miriam can't work, so a message will be printed)
        System.out.println();
        em.displayEmployees(); //Display of all the employees after working

    }

}
