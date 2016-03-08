// Maura Godfrey
//cse 002
//March 8, 2016
//homework 6
// Program 2- Run Factorial

import java.util.Scanner;

public class RunFactorial{
    //main method required for all Java programs
    public static void main(String[] args){
        Scanner myscan= new Scanner(System.in);
        System.out.print("Please enter an integer that is between 9 and 16: ");
        int f=0;
        int a=1;
        int g=0;
        while(true){
            if(myscan.hasNextInt()){        //checking that an int was input
                f=myscan.nextInt();
                
                if(f>=9&& f<=16){               //checking that the int is between 9 and 16
                    break;
                }
                else{
                    System.out.print("Invalid input, enter again! ");
                }
            
            }
            else{                   //asking for new input when a non integer is given
                
                System.out.print("Invalid input, enter again! ");
                myscan.next();
            }
       
        }
        g=f;     //need to store the value of f for the print statement before it is decremented
        while(f>0){
            
            a=f*a;        //since a starts as one first a becomes f, then become f*(f-1), then f*(f-1)*(f-2) etc until f is 1
            f--;
            
        }
        
        System.out.println(g+ "! = "+ a);
        
    }    
}    