//Maura Godfrey
//cse 002
//March 29 2016
//Homework 9
//Program 2 rectangularize

import java.util.Scanner;

public class Rectangularize{
    public static void main(String[] args){
        System.out.println("Please enter an input");
        Scanner myScan= new Scanner(System.in);
        
        if(myScan.hasNextInt()){
            int input=myScan.nextInt();
            Rectangle(input);
        }
        else{
            String input=myScan.next();
            Rectangle(input);
        }
        
    }
    



public static void Rectangle(int x){
    int counter=0;
    int lineCounter=0;
    while(lineCounter<x){
    counter=0;
    while(counter<x){
        System.out.print("%");
        counter++;
    }
    if(counter==x){
        System.out.println("");
    }
    lineCounter++;
    }
    
}



public static void Rectangle(String word){
     int length=word.length();
     int counter=1;
     while(counter<=length){
         System.out.println(word);
         counter++;
     }
    
}

}