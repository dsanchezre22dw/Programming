package Exercises2;

import Exercises2.Parrot.*;
public class Ex2 {
    
    public static void main(String[] args){

        PersonalData parrotNames1 = new PersonalData("Parrot1", "Owner1");
        PersonalData parrotNames2 = new PersonalData("PARrot2", "Owner2");
        PersonalData parrotNames3 = new PersonalData("Parrot3", "Owner3");
        PersonalData parrotNames4 = new PersonalData("PARrot4", "Owner4");
        PersonalData parrotNames5 = new PersonalData("Parrot5", "Owner5");
        PersonalData parrotNames6 = new PersonalData("Parrot6", "Owner6");
        
        
        Parrot parrot1 = new Parrot('F', 5, parrotNames1, 'S', "Green");
        Parrot parrot2 = new Parrot('M', 15, parrotNames2, 'N', "Red");
        Parrot parrot3 = new Parrot('F', 2, parrotNames3, 'N', "Blue");
        Parrot parrot4 = new Parrot('F', 3, parrotNames4, 'W', "Yellow");
        Parrot parrot5 = new Parrot('M', 7, parrotNames5, 'E', "White");
        Parrot parrot6 = new Parrot('M', 1, parrotNames6, 'E', "Black");
        
        
        Parrot[] array1 = {parrot1, parrot2, parrot3};
        Parrot[] array2 = {parrot4, parrot5, parrot6};
        
        Parrot[] array3 = new Parrot[array1.length + array2.length];

        
        for (int i=0; i<array3.length; i++){
            if (i%2 == 0){
                array3[i] = array1[i - (i/2)];

            }else{
                array3[i] = array2[i - (i/2) - 1];
            }
        }

        for (int i=0; i<array3.length; i++){
            array3[i].sing();
        }

        for (int i=0; i<array3.length; i++){
            if (array3[i].getNames().getName().substring(0,3).equals("PAR")){
                array3[i].sing();
            }
        }


        
        
        
        
        
    }


}
