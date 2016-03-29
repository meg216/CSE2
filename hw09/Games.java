//Maura Godfrey
//cse 002
//March 29 2016
//Homework 9
//Program 1- games

import java.util.Scanner;
import java.util.Random;


public class Games{
    
    public static void guessTheBox(int guess){
           Random randomGenerator= new Random();
            int randomInt= randomGenerator.nextInt(3);    //gives integer less than three
            
            int correct =randomInt+1;  //corrects so that it gives 1-3
            System.out.println(correct);
            if(guess==correct){
                System.out.println("Congratulations! You have won 10 tickets!");
            }
            else{
                System.out.println("Sorry, you are not a winner.");
            }
            
        }
    public static void spinTheWheel(int spinPick){   
       Scanner mySpinScan= new Scanner(System.in);
       Random randGenerator= new Random();
       int randInt=randGenerator.nextInt(5);
       int randCorrect=randInt+1;
       int randColor=randGenerator.nextInt(2);  //no need to correct since I want a random int or 1
       
       int colorNum;
        System.out.println("Do you think the spinner will land on red or black?");
        String colorChoice=mySpinScan.next();
        while(true){
            if(colorChoice.equals("red")||colorChoice.equals("Red")){    //changing the string to a number to compare to the random number
                colorNum=0;
                break;
            }
            else if(colorChoice.equals("Black")||colorChoice.equals("black")){
                colorNum=1;
                break;
            }
            else{
                System.out.println("Sorry, that is not a choice, please choose again");
                colorChoice=mySpinScan.next();
            }
        }
        
        
        if(spinPick==randCorrect&&colorNum==randColor){
            System.out.println("Congratulations! You have won 10 tickets!");
        }
        else{
            System.out.println("Sorry, you did not win");
        }
    }
    public static void scrambler(String original){
        int length=original.length();
        for(int i=0; i<length;i++){
            Random randgen= new Random();            
  
            int randInt1=randgen.nextInt(length);
            int randScramble=randInt1+1;
            int randInt2=randgen.nextInt(length);
            int randScramble2=randInt2+1;

            char a=original.charAt(randScramble);
            char b=original.charAt(randScramble2);
            
            original.replace(a, b);
            original.replace(b, a);
            
            System.out.println(original);
            
            
        }
    }
    
    public static void main(String[] args){
        Scanner myScan= new Scanner(System.in);
        
        System.out.println("Welcome to Maura's game center");
        System.out.println(" Do you want to play guessTheBox, spinTheWheel, or scrambler?");
        
        String gameChoice=myScan.next();
        
        
        
        if(gameChoice.equals("guessTheBox")){
            System.out.println("To win the game you have to choose the correct box, please guess 1, 2, or 3 to select your box");
            
            int boxChoice=myScan.nextInt();
            while(true){
              
                if(boxChoice>=1&&boxChoice<=3){
                    guessTheBox(boxChoice);
                    break;
                }
                else{
                    System.out.println("Sorry, that is not a choice, please try again.");
                    boxChoice=myScan.nextInt();
                }
        
            }
            
        }
        
        else if(gameChoice.equals("spinTheWheel")){
            System.out.println("Guess which number the spinner will land on (1-5)");
            int spinnerChoice=myScan.nextInt();
            while(true){
            if(spinnerChoice>=1&&spinnerChoice<=5){
                spinTheWheel(spinnerChoice);
                break;
            }
            else{
                System.out.println("Sorry, that is not a choice, please try again.");
                spinnerChoice=myScan.nextInt();
            }
            }
            
        }
        
        else if(gameChoice.equals("scrambler")){
            System.out.println("Choose a word to scramble");
            String word=myScan.next();
            scrambler(word);
        }
        
        else{
            System.out.println("Sorry! Maura's arcade does not have that game.");
        }
        
        
        
        
    }
}