//Maura Godfrey
//Homework 3
//Due Feb 16 2016
//cse002

import java.util.Scanner; //import scanner class

public class Pyramid{ //main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner ( System.in ); //declaring instance of scanner
        System.out.print("Enter the length of the square side of the pyramid:");
        double squareside=myScanner.nextDouble();
        System.out.print("Enter the height of the pyramid:");
        double pyramidHeight=myScanner.nextDouble();
         //all input data taken
         
        double volume;
        
        volume=((squareside*squareside)*pyramidHeight)/3;
        System.out.println("The volume inside the pyramid is: "+volume+ '.');
    }
}