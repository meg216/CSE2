//Maura Godfrey
// CSE002
// lab 10- search
// April 15, 2016

import java.util.Scanner;


public class Search{
    public static void main(String[] args){
        int size= 50;
        int[] array1;
        int[] array2;
        array1= new int[size];
        array2= new int[size];
        int i=0;
        int lowest;
        int highest;
        int n;
        
        Scanner myScan= new Scanner(System.in);
        
        for(i=0; i< size; i++){
            array1[i]=(int)(Math.random()*100);         
            
        }           // fills array 1
        
        lowest=array1[0];
        highest=array1[0];
        for( i=1;i<size; i++){
           
            if(array1[i]<=lowest){
                lowest=array1[i];
            }
            if(array1[i]>=highest){
                highest=array1[i];
            }
            
        }           //finding the lowest #
        System.out.println("The maximum of array1 is: "+highest);
        System.out.println("The minimum of array1 is: "+ lowest);
        
        for(i=0; i<size; i++){
            if (i==0){
                array2[i]= (int)(Math.random()*100);
            }
            else{
                int num= (int)(Math.random()*100)+ array2[(i-1)];
                array2[i]=num;
            }
        }                   //fills array 2
        System.out.println("The maximum of array2 is: "+ array2[49]);  //since already ordered just print first and last #
        System.out.println("The minimum of array2 is: "+ array2[0]);
        
        System.out.print("Enter an int greater than or equal to 0: ")
        
        if(myScan.hasNextInt()){
        n=myScan.nextInt();
        }
        else{
            System.out.println("You did not enter an int");
        }
        
        // need to do the binary search for the whether the input number is there or not 
        
    }
    
}