//Maura Godrey
//CSE 002
//April 22, 2016
//Lab 12
//Ragged Array

import java.util.Scanner;

public class RaggedArray{
    
   public static void print(int[][] ascending){
       for(int f=0;f<ascending.length;f++){
           for(int g=0;g<ascending[f].length;g++){
               System.out.print(ascending[f][g]+" ");
           }
           System.out.println();
       }
   }
    
    public static void main(String[] args){
        Scanner myScan= new Scanner(System.in);
        System.out.println("Please enter the size of the main array: ");
        int columnSize=myScan.nextInt();
        int mainArray[][]= new int[columnSize][];
        for(int i=0; i<mainArray.length; i++){
            
            int memSize=1+(int)(Math.random()*columnSize);
            mainArray[i]=new int[memSize];
        }
        
        for(int j=0;j<mainArray.length;j++){
            for(int k=0;k<mainArray[j].length;k++){
                mainArray[j][k]=(int)(Math.random()*20);
            }
        }
        System.out.println("Here is your unsorted Array:");
        print(mainArray);
        int pos=0;
        int min=0;
        int r=0;
        int e=0;
        int temp=0;
        
        for(int w=0;w<mainArray.length;w++){
            for(e=0;e<mainArray[w].length;e++){
                min=mainArray[w][e];
                pos=e;
                for(r=(e+1);r<mainArray[w].length;r++){
                    if(mainArray[w][r]<min){
                        min=mainArray[w][r];
                        pos=r;
                     //   System.out.println(min+" at position "+pos);
                    }
                }
            
                if(e<mainArray[w].length){
                temp=mainArray[w][e];
                mainArray[w][e]=min;
                mainArray[w][pos]=temp;
                }
        
            }        
            
        }//sorts the members
        System.out.println("Here is your sorted array:");
        print(mainArray);
        
        
        int b=0;
        for(int s=0;s<mainArray.length;s++){
            int mini=mainArray[s].length;
            int posArray=s;
            int[] array=mainArray[s];
            for(b=s+1;b<mainArray.length;b++){
                if(mainArray[b].length<mini){
                    mini=mainArray[b].length;
                    posArray=b;
                }
            }
           //if(s<mainArray[s].length){
            int[] tempArray=mainArray[s];
            mainArray[s]=mainArray[posArray];
            mainArray[posArray]=tempArray;
           //}
        }//rearranges the arrays
        System.out.println("Here is your rearranged array:");
        print(mainArray);
        
        System.out.println("What number would you like to search for? ");
        int find=myScan.nextInt();
        boolean notfound=true;
        int q1=0;
        for(int q=0;q<mainArray.length;q++){
            for( q1=0;q1<mainArray[q].length;q1++){
                if(mainArray[q][q1]==find){
                    System.out.println("Column "+ q1+" Row "+q);
                    notfound=false;
                    break;
                }
                
            }
            if(q1<mainArray[q].length){
            if(mainArray[q][q1]==find){
                break;
            }
            
        }
        }
        if(notfound){
            System.out.println("Not in the array.");
            
        }
        
        
        
    }
    
    
}