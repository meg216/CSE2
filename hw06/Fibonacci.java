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
        int a=0;
        boolean goodData = true;
        
        System.out.print("Enter the first number of the sequence: ");
        while(true){  
            if(myscan.hasNextInt()){
                a1=myscan.nextInt();
                if(a1>=0){
                   break; 
                }
               else{
                  
                   System.out.print("Enter the first number of the sequence: ");
               }
            }
            
            else{ 
                
                System.out.print("Enter the first number of the sequence: ");
                myscan.next();
            }
           
                 
               
        }
        
       
        
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
         

      
            System.out.print("The numbers are: " +a1+", ");
            System.out.print(a2+", ");
            n=n-2;
        while (n>1){
            c=a1+a2;
            a1=a2;
            a2=c;
            n=n-1;
            System.out.print(c+", ");
        }
        if (n==1){
            c=a1+a2;
            System.out.println(c+ ".");
        
        }
     
            
        
        
        
        
        
        
    }    
}    