//Maura Godfrey
//cse 002
//Feb 23 2016

import java.util.Scanner; //importing scanner class

public class ToHex{ //main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner ( System.in );
        System.out.print("Please enter the three numbers representing RGB values:");
       while(!myScanner.hasNextDouble()){                                               
           System.out.println("Sorry, your input must consist of integers.");  //checking for doubles
           myScanner.next();                     
            }
        double rInput=myScanner.nextDouble();
        while(!myScanner.hasNextDouble()){
           System.out.println("Sorry, your input must consist of integers.");
           myScanner.next();
            }
        double gInput=myScanner.nextDouble();
        while(!myScanner.hasNextDouble()){
           System.out.println("Sorry, your input must consist of integers.");
           myScanner.next();
            }
        double bInput=myScanner.nextDouble();
        
        
        String rHex1, gHex1, bHex1, rHex2, gHex2, bHex2;
        rHex1 ="";
        gHex1="";
        bHex1="";       //errors when not given a variable outside of the if statements
        rHex2="";
        gHex2="";
        bHex2="";
        if(rInput>=0&& rInput<=255 && rInput>=0&& rInput<=255 && rInput>=0&& rInput<=255){
            
           int rInt=(int)(rInput/16);   //the whole number that needs to be converted to the first part of the hexidecimal
           int gInt=(int)(gInput/16);
           int bInt=(int)(bInput/16);
           
           
            if (rInt>=0&&rInt<=9){
                rHex1=String.valueOf(rInt);
            }
            else{
            switch((int)rInt){       //finding the first part of the hex for R if it is not 0-9
                case 10:
                    rHex1="A";
                    break;
                case 11:
                    rHex1="B";
                    break;
                case 12:
                    rHex1="C";
                    break;
                case 13:
                    rHex1="D";
                    break;
                case 14:
                    rHex1="E";
                    break;
                case 15:
                    rHex1="F";
                    break;
                
            }}
            if(gInt>=0&&gInt<=9){     //0-9 is still 0-9 in hex
                gHex1=String.valueOf(gInt);
            }
            else{
                switch((int)gInt){       //finding the first part of the hex for G if it is not 0-9
                case 10:
                    gHex1="A";
                    break;
                case 11:
                    gHex1="B";
                    break;
                case 12:
                    gHex1="C";
                    break;
                case 13:
                    gHex1="D";
                    break;
                case 14:
                    gHex1="E";
                    break;
                case 15:
                    gHex1="F";
                    break;
                
            }
            }
            if(bInt>=0&&bInt<=9){
                bHex1=String.valueOf(bInt);
            }
            
            else{
            switch((int)bInt){       //finding the first part of the hex for B if it is not 0-9
                case 10:
                    bHex1="A";
                    break;
                case 11:
                    bHex1="B";
                    break;
                case 12:
                    bHex1="C";
                    break;
                case 13:
                    bHex1="D";
                    break;
                case 14:
                    bHex1="E";
                    break;
                case 15:
                    bHex1="F";
                    break;
               
            }
            }
            
            //end of finding first part of strings
            int rMod=(int)(rInput%16);
            int gMod=(int)(gInput%16);   //the remainders that need to be converted to the second part
            int bMod=(int)(bInput%16);
            
            if (rMod>=0&&rMod<=9){
                rHex2=String.valueOf(rMod);
            }
            else{
            switch((int)rMod){       //finding the second part of the hex for R if it is not 0-9
                case 10:
                    rHex2="A";
                    break;
                case 11:
                    rHex2="B";
                    break;
                case 12:
                    rHex2="C";
                    break;
                case 13:
                    rHex2="D";
                    break;
                case 14:
                    rHex2="E";
                    break;
                case 15:
                    rHex2="F";
                    break;
                
            }}
            if(gMod>=0&&gMod<=9){     //0-9 is still 0-9 in hex
                gHex2=String.valueOf(gMod);
            }
            else{
                switch((int)gInt){       //finding the second part of the hex for G if it is not 0-9
                case 10:
                    gHex2="A";
                    break;
                case 11:
                    gHex2="B";
                    break;
                case 12:
                    gHex2="C";
                    break;
                case 13:
                    gHex2="D";
                    break;
                case 14:
                    gHex2="E";
                    break;
                case 15:
                    gHex2="F";
                    break;
                
            }
            }
            if(bMod>=0&&bMod<=9){
                bHex2=String.valueOf(bMod);
            }
            
            else{
            switch((int)bMod){       //finding the second part of the hex for B if it is not 0-9
                case 10:
                    bHex2="A";
                    break;
                case 11:
                    bHex2="B";
                    break;
                case 12:
                    bHex2="C";
                    break;
                case 13:
                    bHex2="D";
                    break;
                case 14:
                    bHex2="E";
                    break;
                case 15:
                    bHex2="F";
                    break;
               
                              }//ends the switch
                }//ends the else
            System.out.println("The decimal numbers R:"+rInput+", G:"+gInput+", B:"+bInput+", is represented in hexidecimal as: "+rHex1+rHex2+gHex1+gHex2+bHex1+bHex2);
            
        } //ends original if
        else{
            System.out.println("Sorry, you must enter values between 0-255.");
            }//ends else
        
    }    
}
