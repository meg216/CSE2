// Maura Godfrey
//cse 002
//March 8, 2016
//homework 6
//program 1- fibonacci

import java.util.Scanner;

public class Fibonacci{
    //main method required for all Java programs
    public static void main(String[] args){
        Scanner myscan= new Scanner(System.in);
        int a1=0;
        int a2=0;
        int n=0;
        int c=0;
        
        
        System.out.print("Enter the first number of the sequence: "); //asking for the first number
        while(true){  
            if(myscan.hasNextInt()){  //checking that the value is an integer
                a1=myscan.nextInt();  //assigning a1 if integer
                if(a1>=0){             //if a1 is positive it can leave this loop and ask for the second number
                   break; 
                }
               else{                        //if a1 is negative it will ask for a new input
                  
                   System.out.print("Enter the first number of the sequence: ");
               }
            }
            
            else{                   //asking for new input when a non integer is given
                
                System.out.print("Enter the first number of the sequence: ");
                myscan.next();
            }
           
                 
               
        }
        
       //a2 and n follow same process as a1
        
        System.out.print("Enter the second number of the sequence: ");
        while(true){  
            if(myscan.hasNextInt()){
                 a2=myscan.nextInt();
                if(a2>=0){
                   break; 
                }
               else{
                  
                   System.out.print("Enter the second number of the sequence: ");
                }
                
            }
            else{ 
                myscan.next();
                System.out.print("Enter the second number of the sequence: ");
            }
                 
               
        }
  
        System.out.print("How many custom Fibonacci numbers should be printed: ");
        while(true){  
            if(myscan.hasNextInt()){
                 n=myscan.nextInt();
                 if(n>=0){
                   break; 
                }
               else{
                  
                   System.out.print("How many custom Fibonacci numbers should be printed: ");
               }
                 
            }
            else{ 
                myscan.next();
                System.out.print("How many custom Fibonacci numbers should be printed: ");
            }
                 
               
        }
         
// all inputs have now been accepted as positive integers
      
            System.out.print("The numbers are: " +a1+", ");        
            System.out.print(a2+", ");      //a1 and a2 are the first numbers of the sequence
            n=n-2;          //since the first two have been printed n is now two less
        while (n>1){        //doing fibonacci, n>1 because after that there needs to be a period instead of a comma
            c=a1+a2;        
            a1=a2;
            a2=c;
            n=n-1;
            System.out.print(c+", ");
        }
        if (n==1){              //final number and the period
            c=a1+a2;
            System.out.println(c+ ".");
        
        }
     
            
        
        
        
        
        
        
    }    
}    