//Maura Godfrey
//Twist Generator Program
//cse002
//March 4 2016

import java.util.Scanner;

public class TwistGenerator{
    //main method required for all Java programs
    public static void main(String arg[]){
        Scanner myScanner = new Scanner ( System.in ); 
        System.out.print("Enter a positive integer for the length:");
        int length=0;
        while(true){
        
        if(myScanner.hasNextInt()){
        
            length=myScanner.nextInt();
            if(length>0){
            break;        
            }
            else{
            System.out.print("Enter a positive integer for the length:");
            myScanner.next();
            }
        }
        else{
        System.out.print("Enter a positive integer for the length:");
        myScanner.next();
            
            
        }
        
        }
        
        int counter=0;
        
        while(counter<length){
            System.out.print("\\");
            counter++;
            if(counter==length){
                break;
            }
            System.out.print(" ");
            counter++;
            if(counter==length){
                break;
            }
            System.out.print("/");
            counter++;
            if(counter==length){
                break;
            }
        }
       System.out.println();
       counter=0;
       while(counter<length){
            System.out.print(" ");
            counter++;
            if(counter==length){
                break;
            }
            System.out.print("X");
            counter++;
            if(counter==length){
                break;
            }
            System.out.print(" ");
            counter++;
            if(counter==length){
                break;
            }
        }
       System.out.println();
              counter=0;
       while(counter<length){
            System.out.print("/");
            counter++;
            if(counter==length){
                break;
            }
            System.out.print(" ");
            counter++;
            if(counter==length){
                break;
            }
            System.out.print("\\");
            counter++;
            if(counter==length){
                break;
            }
        }
        System.out.println();
        
        
    }
}    
// do a loop where it takes 3 off of legnth each time and prints full, if not 3 left take mod
//if mod is 1 print the mod1 if mod2 print mod2