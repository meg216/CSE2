//Maura Godrey
//CSE 002
//April 22, 2016
//Lab 12
//Ragged Array

import java.util.Scanner;

public class RaggedArray{
    
   public static void print(int[][] ascending){
       for(int f=0;f<ascending.length;f++){
           for(int g=0;g<ascending[f].length;g++){
               System.out.print(ascending[f][g]+" ");
           }
           System.out.println();
       }
   }
    
    public static void main(String[] args){
        Scanner myScan= new Scanner(System.in);
        System.out.println("Please enter the size of the main array: ");
        int columnSize=myScan.nextInt();
        int mainArray[][]= new int[columnSize][];
        for(int i=0; i<mainArray.length; i++){
            
            int memSize=1+(int)(Math.random()*columnSize);
            mainArray[i]=new int[memSize];
        }
        
        for(int j=0;j<mainArray.length;j++){
            for(int k=0;k<mainArray[j].length;k++){
                mainArray[j][k]=(int)(Math.random()*20);
            }
        }
        System.out.println("Here is your unsorted Array:");
        print(mainArray);
        int pos=0;
        int min=0;
        int r=0;
        int e=0;
        int temp=0;
        int origposition=0;
        for(int w=0;w<mainArray.length;w++){
            for(e=0;e<mainArray[w].length;e++){
                min=mainArray[w][e];
                origposition=e;
                for( r=e+1;r<mainArray[w].length;r++){
                    if(mainArray[w][r]<min){
                        min=mainArray[w][r];
                        pos=r;
                     //   System.out.println(min+" at position "+pos);
                    }
                }
            
           // System.out.println("length "+mainArray[w].length+ " r "+r);
            
          if(e<mainArray[w].length){
                temp=mainArray[w][origposition];
                mainArray[w][origposition]=min;
                mainArray[w][pos]=temp;
                //System.out.println(temp);
        }
            }        
            
        }
        
        System.out.println("Array with members sorted:");
        print(mainArray);
    }
    
    
}