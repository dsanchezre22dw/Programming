package Exercises5;

import java.util.*;

public class ex1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Number n: ");
        int n = s.nextInt();

        List<Integer> numbers = new ArrayList<Integer>();

        load(numbers, n);
        display1(numbers);
        System.out.println();
        numbers.clear();
        load2(numbers);
        display2(numbers);
        System.out.println();
        numbers.clear();
        display3(load3());

    }



    public static void load(List<Integer> numbers, int n){
        int amount = 0, i = 1;

        while (i <= n && amount < 10){
            if (n % i == 0){
                numbers.add(i);
                amount++;
            }
            i++;
        }
    }

    public static void load2(List<Integer> numbers){
        for (int i = 1; i <= 20; i++){
            numbers.add((int)(Math.random()*(100 + 100 + 1) -100));
        }
    }

    public static Set<Integer> load3(){
        Set<Integer> set1 = new HashSet<>();

        while (set1.size()<20){
            if(set1.add((int)(Math.random()*(20 + 20 + 1) -20))){
            }
        }
        return set1;

    }


    public static void display1(List<Integer> numbers){

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }

    public static void display1(Set<Integer> numbers){
        // Transform into an array
        Object[] array = numbers.toArray();
        for (int i=0; i<array.length; i++){
            System.out.print((Integer)array[i] + " ");
        }
        System.out.println();
    }

    public static void display2(List<Integer> numbers){

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()){
            Integer elem = (Integer) it.next();
            System.out.print(elem + " ");
        }
    }

    public static void display2(Set<Integer> numbers){

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    public static void display3(List<Integer> numbers){

        for (Integer elem:numbers){
            System.out.print(elem + " ");
        }
    }

    public static void display3(Set<Integer> numbers){

        for (Integer elem:numbers){
            System.out.print(elem + " ");
        }
    }
}
