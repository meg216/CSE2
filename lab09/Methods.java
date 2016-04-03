//Maura Godfrey
//CSE 002
//March 25 2016
//lab 07
//methods

import java.util.Random;
import java.util.Scanner;

public class Methods{
   public static String adjective(){
       Random randomGenerator=new Random();
                 int randomInt= randomGenerator.nextInt(10);
                switch(randomInt){
                    case 0:
                        return "fun";
                      
                    case 1:
                        return "exciting";
                       
                    case 2:
                        return "sad";
                     
                    case 3:
                        return "crazy";
                     
                    case 4:
                        return "happy";
                       
                    case 5:
                        return "bored";
                     
                    case 6:
                        return "hungry";
                       
                    case 7:
                        return "sweet";
                       
                    case 8:
                        return "cool";
                        
                    case 9:
                        return "slow";
                       
                
                } //ends switch statment
            return "error1";
            } //ends adjective
           
            public static String noun1(){
                Random randomGenerator=new Random();
                int randomInt= randomGenerator.nextInt(10);
                switch(randomInt){
                    case 0:
                        return "boy";
                      
                    case 1:
                        return "girl";
                       
                    case 2:
                        return "man";
                      
                    case 3:
                        return "woman";
                    
                    case 4:
                        return "cat";
                    
                    case 5:
                        return "child";
                   
                    case 6:
                        return "bear";
                      
                    case 7:
                        return "frog";
                        
                    case 8:
                        return "horse";
                        
                    case 9:
                        return "dog";
                       
                
                } //ends switch
                return "error2";
            }//ends noun1
            
            public static String verb(){
                Random randomGenerator=new Random();
               int  randomInt= randomGenerator.nextInt(10);
                switch(randomInt){
                    case 0:
                        return "ran";
                       
                    case 1:
                        return "walked";
                       
                    case 2:
                        return "fell";
                        
                    case 3:
                        return "jumped";
                        
                    case 4:
                        return "skated";
                       
                    case 5:
                        return "swam";
                        
                    case 6:
                        return "biked";
                       
                    case 7:
                        return "drove";
                      
                    case 8:
                        return "flew";
                        
                    case 9:
                        return "crawled";
                        
                
                }
             return "error3";
            }//ends verb
            
            public static String noun2(){
                Random randomGenerator=new Random();
                int randomInt= randomGenerator.nextInt(10);
                switch(randomInt){
                    case 0:
                        return "table";
                     
                    case 1:
                        return "door";
                       
                    case 2:
                        return "chair";
                        
                    case 3:
                        return "meeting";
                        
                    case 4:
                        return "room";
                        
                    case 5:
                        return "bar";
                        
                    case 6:
                        return "game";
                        
                    case 7:
                        return "show";
                       
                    case 8:
                        return "car";
                        
                    case 9:
                        return "beach";
                       
                
                }
             return "error4";
            }//ends string noun2
   
   
   
   
   
    public static void main(String[] args){
        Random randomGenerator=new Random();
        Scanner myScan= new Scanner(System.in);
        int randomInt= randomGenerator.nextInt(10); //will give random integer less than 10
        int check=0;
        int cont= 1;
        
        while(cont==1){
            String adj=adjective();
            String n1=noun1();
            String v=verb();
            String n2=noun2();
            
            System.out.println("The "+adj+" "+n1+" "+v+" into the "+n2 +".");
            
            
        
        System.out.println("If you would like another sentence press 1, if not press any other integer");
        check=myScan.nextInt();
        if(check==1){
            cont=1;
        }
        else{
            cont=0;
        }
            
            
        }
    }
}