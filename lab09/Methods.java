//Maura Godfrey
//CSE 002
//March 25 2016
//lab 07
//methods

import java.util.Random;
import java.util.Scanner;

public class Methods{
    public static void main(String[] args){
        Random randomGenerator=new Random();
        Scanner myScan= new Scanner(System.in);
        int randomInt= randomGenerator.nextInt(10); //will give random integer less than 10
        int check=0;
        boolean continue= true;
        
        While(continue==true){
            System.out.print("The ");
            public static string adjective(){
                randomInt= randomGenerator.nextInt(10);
                switch(randomInt){
                    case 0:
                        System.out.print("fun");
                        break;
                    case 1:
                        System.out.print("exciting");
                        break;
                    case 2:
                        System.out.print("sad");
                        break;
                    case 3:
                        System.out.print("crazy");
                        break;
                    case 4:
                        System.out.print("happy");
                        break;
                    case 5:
                        System.out.print("bored");
                        break;
                    case 6:
                        System.out.print("hungry");
                        break;
                    case 7:
                        System.out.print("sweet");
                        break;
                    case 8:
                        System.out.print("cool");
                        break;
                    case 9:
                        System.out.print("slow");
                        break;
                
                } //ends switch statment
            
            } //ends adjective
            
            public static string noun1(){
                randomInt= randomGenerator.nextInt(10);
                switch(randomInt){
                    case 0:
                        System.out.print("boy");
                        break;
                    case 1:
                        System.out.print("girl");
                        break;
                    case 2:
                        System.out.print("man");
                        break;
                    case 3:
                        System.out.print("woman");
                        break;
                    case 4:
                        System.out.print("cat");
                        break;
                    case 5:
                        System.out.print("child");
                        break;
                    case 6:
                        System.out.print("bear");
                        break;
                    case 7:
                        System.out.print("frog");
                        break;
                    case 8:
                        System.out.print("horse");
                        break;
                    case 9:
                        System.out.print("dog");
                        break;
                
                } //ends switch
            }//ends noun1
            
            public static string verb(){
                randomInt= randomGenerator.nextInt(10);
                switch(randomInt){
                    case 0:
                        System.out.print("ran");
                        break;
                    case 1:
                        System.out.print("walked");
                        break;
                    case 2:
                        System.out.print("fell");
                        break;
                    case 3:
                        System.out.print("jumped");
                        break;
                    case 4:
                        System.out.print("skated");
                        break;
                    case 5:
                        System.out.print("swam");
                        break;
                    case 6:
                        System.out.print("biked");
                        break;
                    case 7:
                        System.out.print("drove");
                        break;
                    case 8:
                        System.out.print("flew");
                        break;
                    case 9:
                        System.out.print("crawled");
                        break;
                
                }
             System.out.print(" to the ");  //articles that make the sentence work
            }//ends verb
            
            public static string noun2{
                randomInt= randomGenerator.nextInt(10);
                switch(randomInt){
                    case 0:
                        System.out.print("table");
                        break;
                    case 1:
                        System.out.print("door");
                        break;
                    case 2:
                        System.out.print("chair");
                        break;
                    case 3:
                        System.out.print("meeting");
                        break;
                    case 4:
                        System.out.print("room");
                        break;
                    case 5:
                        System.out.print("bar");
                        break;
                    case 6:
                        System.out.print("game");
                        break;
                    case 7:
                        System.out.print("show");
                        break;
                    case 8:
                        System.out.print("car");
                        break;
                    case 9:
                        System.out.print("beach");
                        break;
                
                }
            System.out.println(".");    
            }//ends string noun2
        
        System.out.print("If you would like another sentence press 1, if not press any other interger");
        check=myscan.nextInt();
        if(check=1){
            continue=true;
        }
        else{
            continue=false;
        }
            
            
        }
    }
}