//Maura Godrey
//CSE 002
//April 22, 2016
//Lab 12
//Ragged Array

import java.util.Scanner;

public class RaggedArray{
    
    public static int[] member(int columnSize){
        int size=(int)(Math.random()*columnSize);
        int array=new int[size];
        for(int i=0; i<size; i++){
            array[i]=(int)(Math.random()*20);
        }
        
        return array[];
        
    }
    
    public static void main(String[] args){
        Scanner myScan= new Scanner(System.in);
        System.out.println("Please enter the size of the main array: ");
        int columnSize=myScan.nextInt();
        int mainArray[]= new int[columnSize];
        int memberArray[];
        for(int i=0; i<columnSize; i++){
            mainArray[i]= member();
        }
        
        
        System.out.println(" Here is your unsorted Array:");
        System.out.println(mainArray);
        
        
    }
    
    
}