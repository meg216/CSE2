// Maura Godfrey
//cse 002
//March 22, 2016
//homework 7
// Program 1- Twisty

import java.util.Scanner;

public class Twisty{
    //main method required for all Java programs
    public static void main(String[] args){
        Scanner myscan= new Scanner(System.in);
        System.out.print("Input your desired length: ");
        int length=0;
        int l=0;            //counter
        int width=0;
        int s=0;            //space counter between different characters
        int s1=0;           //space counter between like characters
        int s2=0;
        String space=" ";
        String num="#";
        String forSlash="/";
        String backSlash="\\";
        
        while(true){                        //getting the length
            if(myscan.hasNextInt()){        //checking that an int was input
                length=myscan.nextInt();
                
                if(length>=0&&length<=80){               //checking that the int is between 0 and 80
                    break;
                }
                else{
                    System.out.print("Integer between 0 and 80 required ");
                }
                
            }
            else{                   //throwing an error when the input was not an integer
                
                System.out.print("ERROR: need an integer ");
                myscan.next();
            }
       
        }            
        
        System.out.print("Input your desired width: ");
        while(true){                                       //getting the width
            if(myscan.hasNextInt()){        //checking that an int was input
                width=myscan.nextInt();
                
                if(width>=0&&width<length){               //width needs to be positive and less than length
                    break;
                }
                else{
                    System.out.print("Integer greater than zero and less than the length required"); 
                }
                
            }
            else{                   //asking for new input when a non integer is given
                
                System.out.print("ERROR: need an integer ");
                myscan.next();
            }
       
        }
        
        // spaces between top of diamonds is width-2, and it decrements by 2 each line until center
        
        // spaces within diamonds starts at zero and increases by 2 until center
        
        while(width>0){
            l=0;
            while(l<length){
                s=width-2;
                System.out.print(num);      //printing the first number sign
                l++;
                if(l==length){              //checking counter to ensure correct number of characters printed
                    break;
                }
               
                while(s>0&&l<length){       //spaces between different characters
                System.out.print(space); 
                s--;
                l++;
                }
                
                if(l==length){
                    break;
                }
                
                System.out.print(forSlash);
                l++;
                if(l==length){
                    break;
                }
                
                s2=s1;
                while(s2>0&&l<length){                  //spaces between like characters
                    System.out.print(space);
                    l++;
                    s2--;
                }
                if(l==length){
                    break;
                }
                
                System.out.print(backSlash);
                l++;
                if(l==length){
                    break;
                }
                 
                s=width-2;
                while(s>0&&l<length){       //same loop as first space group
                System.out.print(space); 
                s--;
                l++;
                }
                
                if(l==length){
                    break;
                }
                
                System.out.print(num);      
                l++;
                if(l==length){              //checking counter to ensure correct number of characters printed
                    break;
                }
                s2=s1;
                while(s2>0&&l<length){                  //spaces between like characters
                    System.out.print(space);
                    l++;
                    s2--;
                }
                if(l==length){
                    break;
                }
              
                
            }
            
            
        
            System.out.println(""); //after each individual line is done moves to the next line
            width--;
            s1++;
        }
        
        
        
        
        
        
        
       
        
    }
}    

//sorry, i know its not right but i dont have time to fix it