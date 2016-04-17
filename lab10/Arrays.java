//Maura Godfrey
//April 8, 2016
//cse002
//Arrays Program

import java.util.Scanner;

public class Arrays{
    
    public static void main(String[] args){
        
        Scanner myScan= new Scanner(System.in);
        int numStudents=5+(int)(Math.random()*6);
        String[] students; 
        students= new String[numStudents];
        
        System.out.println("Enter "+ numStudents+ " students names:");        
        for( int c=0; c<numStudents; c++){
 
            students[c]= myScan.next();
            
        } 
        
        
        
        int[] midterm;
        midterm= new int[numStudents];
        
        for(int c=0; c<numStudents; c++){
            midterm[c]=(int)(Math.random()*100);
            
        }
        
        System.out.println( "Here are the midterm grades of the "+ numStudents + " students above:");
        for(int c=0; c<numStudents; c++){
            System.out.println(students[c]+" : "+ midterm[c]);
        }
        
        
        
        
    }
    
    
    
}