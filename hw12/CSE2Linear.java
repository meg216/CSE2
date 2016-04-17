//Maura Godfrey
//cse002
//April 19 2016
//Homework 12 program 1 linear


import java.util.Scanner;

public class CSE2Linear{
    
    public static void main(String[] args){
        Scanner myScan= new Scanner(System.in);
        
        int[] grades;
        int size=15;
        grades=new int[size];
        int last=0;
        System.out.print("Enter 15 ints for final grades in CSE2: ");
        
        for(int i=0; i<size; i++){
            if (i==size){
                break;
            }
            if(myScan.hasNextInt()){
               
                grades[i]=myScan.nextInt();
                if(grades[i]<0||grades[i]>100){
                    System.out.println("Error, need int between 0 and 100");
                    break;
                }
                if(grades[i]<last){
                    System.out.println("Error, need an int greater than or equal to last int");
                    break;
                    
                }
                
                last=grades[i];
                
                
                
            }
            else{
                System.out.println("Error, int needed");
                break;
            }
           
                
            } //makes the array
        System.out.println("Sorted: ");
        for(int i=0;i<size;i++){
        System.out.print( grades[i]+ " ");  
        }//prints the array
        System.out.println("");
        System.out.print("Enter a grade to search for: ");
        int search=myScan.nextInt();
        for(int i=0; i<size; i++){
            if(search==grades[i]){
                System.out.println(search + " was found in the list with "+i+" iterations");
                break;
            }
            if(i==14&&search!=grades[i]){
                System.out.println(search+" was not found in the list with " + i+ " iterations");
            }
        } //search before scramble
        
        for(int i=0; i<grades.length; i++){
            int target= (int)(grades.length*Math.random());
            int temp= grades[target];
            grades[target]= grades[i];
            grades[i]=temp;
        } //scrambles array
        
        System.out.println("Scrambled:");
        for(int i=0;i<size;i++){
        System.out.print( grades[i]+ " ");  
        }//prints the scrambled loop
    System.out.println(" ");
    System.out.print("Enter a grade to search for: ");
        search=myScan.nextInt();
        for(int i=0; i<size; i++){
            if(search==grades[i]){
                System.out.println(search + " was found in the list with "+i+" iterations");
                break;
            }
            if(i==14&&search!=grades[i]){
                System.out.println(search+" was not found in the list with " + i+ " iterations");
            }
        } //search after scramble
    
    }
    
}