package Exercises5.ex4.Class;

import java.util.*;

public class Agenda {

    private Map<String, String[]> entries;
    private int max_number;

    public Agenda(int max_number){

        this.entries = new HashMap<String, String[]>(max_number);

        this.max_number = max_number;
    }

    public void addEntry(String name, String[] numbers){

        Scanner sc = new Scanner(System.in);
        boolean add = true;

        if (this.entries.containsKey(name)){
            System.out.print("Your agenda contains these phone number for " + name + ": ");
            System.out.println(Arrays.toString(entries.get(name)));
            System.out.println("Want to replace them by new ones?");
            String answer = sc.next();

            if (!answer.equalsIgnoreCase("yes")){
                add = false;
            }
        }

        if (add && this.entries.size()<this.max_number){
            this.entries.put(name, numbers);
            System.out.println(name + " added to the agenda");
        }else if (this.entries.size() == this.max_number){
            System.out.println("Full agenda");
        }else if (!add){
            System.out.println("Not updated");
        }
    }

    public void display(){
        System.out.println("AGENDA: ");
        if (this.entries.size() > 0){
            for (Map.Entry<String, String[]> set: this.entries.entrySet()){
                System.out.println(set.getKey() + " " + Arrays.toString(set.getValue()));
            }
        }else{
            System.out.println("The agenda is empty");
        }
    }



    public String searchName(String name){
        String result = "";
        String[] numbers = this.entries.get(name);

        if (numbers != null){
            result = name + ":";

            for (int i = 0; i <= numbers.length-2; i++){
                result += numbers[i] + ",";
            }

            result += numbers[numbers.length-1];

        }else{
            System.out.println(name + " is not in the agenda");
        }

        return result;
    }



    public int numberOfPhones(String phone){

        int amount = 0;

        for (Map.Entry<String, String[]> set: this.entries.entrySet()){
            if (Arrays.asList(set.getValue()).contains(phone)){
                amount++;
            }
        }

        return amount;
    }

}
