// Maura Godfrey
//cse 002
//March 22, 2016
//homework 7
// Program 2- Triangles

import java.util.Scanner;

public class Triangles{
    //main method required for all Java programs
    public static void main(String[] args){
        Scanner myscan= new Scanner(System.in);
        System.out.print("Input an integer between 5 and 35, inclusive: ");
        int num=0;
        int n=0;
        int x=1;
        int x1=x;  //for while loop
        int x2=x;  //for do while loop
        int y=1;
        int num1, num2, num3;
        while(true){                        //getting the length
            if(myscan.hasNextInt()){        //checking that an int was input
                num=myscan.nextInt();
                num1=num;
                num2=num;
                num3=num;
                if(num>=5&&num<=35){               //checking that the int is between 0 and 80
                    n=num;
                    
                    break;
                }
                else{
                    System.out.print("Integer between 5 and 35 required ");
                }
                
            }
            else{                   //throwing an error when the input was not an integer
                
                System.out.print("ERROR: need an integer ");
                myscan.next();
            }
       
        }            
        
        System.out.println("FOR LOOP :");
        for(y=1; x<num; x++){                       //top part of the triangle
            
            for(y=1; y<x; y++){                         //need to add print each number its value number of times
                System.out.print(x);
                                            
            }
            if (y==x){
                System.out.println(y);
            }
            
            
        }
        for(n=num; num>0; num--){                   //bottom half of triangle
            
            
            for(n=num; n>1; n--){
                System.out.print(num);
            
            }
            if(n==1){
                System.out.println(num);
            }
            
        }
       
        System.out.println("WHILE LOOP :");
        while(x1<num1){                       //top part of the triangle
            y=1;
            while(y<x1){                         //need to add print each number its value number of times
                System.out.print(x1);
                y++;                            
            }
            if (y==x1){
                System.out.println(y);
            }
            x1++;
            
        }
        while(num1>0){                   //bottom half of triangle
            n=num1;
            
            while(n>1){
                System.out.print(num1);
                n--;
            }
            if(n==1){
                System.out.println(num1);
            }
            num1--;
        }
       
        System.out.println("DO-WHILE LOOP :");          //same as other two loops except do{statements} while(test)
       
        y=1;
        do{ 
            y=1;
            
            do{
                System.out.print(x2);
                y++; 
            }
            while(y<=x2);
            System.out.println("");
            x2++;
        }
        while(x2<num2);
        
        
        
        do{ 
            n=num3;
            
            do{
                System.out.print(num3);
                n--;
            }
            while(n>=1);
            System.out.println("");
            num3--;
        }
        while(num3>0);
        
        
    }
}    