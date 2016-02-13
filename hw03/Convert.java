//Maura Godfrey
//Homework 3
//Due Feb 16 2016
//cse002

import java.util.Scanner; //import scanner class

public class Convert{ //main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner ( System.in ); //declaring instance of scanner
        System.out.print("Enter the distance in meters:");//user will input meters
        double meters=myScanner.nextDouble(); // stores their input as meters
        
        
        double conversionFactor, inches1, inches2, inches; //declaring the conversion factor
        
        conversionFactor=39.3701; //1 meter is 39.37inches
        inches1=conversionFactor*meters;
        inches2=(int)(inches1*10000); //limiting the number of decimal places
        inches=inches2/10000;
        System.out.println(meters+" meters is "+inches+"inches.");



    }
}
