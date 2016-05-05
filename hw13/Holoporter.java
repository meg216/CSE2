//Maura Godfrey
//CSE 002
//April 25, 2016
//Homework 13- Holoport
import java.util.Scanner;


public class Holoporter{
    public static void main(String[] args){
        
        
        
        String[][][] array= soRandom();// allocates empty array with soRandom method
             for(int i=0;i<array.length;i++){
             for(int j=0; j<array[i].length; j++){
                for(int k=0; k<array[i][j].length; k++){
                   
                    array[i][j][k]=coder();
                    
                
                    //System.out.println(input[i][j][k]);
                }//ends inner for loop
            }// ends middle for loop
        }//fills array using coder
        print(array);//prints filled with coder using print method
        String[][][] contArray = holoport(array, soRandom());
        
        //System.out.println(" holoported array ");
      //  print(contArray);
        Scanner myScan=new Scanner(System.in);
        System.out.println();
        System.out.print( "Enter a code to search for: ");
        String search=myScan.next();
        sampling(array, search);
        percentage(array,contArray);
        frankenstein(array);
        
    }//ends main method
    
    public static String[][][] soRandom( ){
        int rand1=(int)(Math.random()*10);
        int rand2=0;
        int rand3=0;
        String[][][] randarray = new String[rand1][][];
        for (int i = 0; i<rand1;i++){
            rand2=(int)(Math.random()*10);
            randarray[i] = new String[rand2][];
            for (int j =0; j<rand2;j++){
            rand3=(int)(Math.random()*10);
                randarray[i][j]=new String[rand3];
            }
        }
        return randarray;
    } //Builds empty array
 
    public static String coder(){
    
                    int xa= (int)(65+(int)(Math.random()*25));
                    int xb= (int)(65+(int)(Math.random()*25));
                    char x1= (char)xa;
                    char x2= (char)xb;
                    int y1=(int)(Math.random()*10);
                    int y2=(int)(Math.random()*10);
                    int y3=(int)(Math.random()*10);
                    int y4=(int)(Math.random()*10);
                    String code=""+x1+""+x2+""+y1+""+y2+""+y3+""+y4;
                  
    return code;
    } //generates string
    
    public static void print(String[][][] pArray){
       
       
        for(int i=0; i<pArray.length; i++){
    
            
            for(int j=0; j<pArray[i].length; j++){
                System.out.print("[");
                
                for(int k=0; k<pArray[i][j].length; k++){
               
                System.out.print(pArray[i][j][k]);
                
                if(k<(pArray[i][j].length-1)){
                    System.out.print(",");
                }
                
                }//inner
                
                System.out.print("]");
                
                
                if(j<(pArray[i].length-1)){
                    System.out.print("|");
                }
                
            }// middle
            if(i<(pArray.length-1)){
            System.out.print("---");
            }
        }  // outer 
    }//prints the array
    
    public static String[][][] holoport(String[][][] orig, String[][][] container){
        
       for(int i=0; i<container.length; i++){
           for(int j=0; j<container[i].length; j++){
               for(int k=0;k<container[i][j].length;k++){
                    container[i][j][k]="$$$$$$";
                           
                       
                       
                   
               }//k for
           }//j for
       }//fills the container with $$$$$$
       
       for(int c=0; c<container.length&&c<orig.length; c++){
           for(int v=0;v<container[c].length&&v<orig[c].length;v++){
               for(int b=0; b<container[c][v].length&&b<orig[c][v].length; b++){
                   container[c][v][b]=orig[c][v][b];
               }
           }
       }
    
    return container;
    }//end of holoport
    
    public static void sampling(String[][][] searchArray, String inCode){
        Scanner myScan1=new Scanner(System.in);
        int x=0;
        for(int i=0; i<2; i++){
            
            if((int)(inCode.charAt(x))<65||(int)(inCode.charAt(x))>90){
                System.out.println("char that failed"+inCode.charAt(x));
                System.out.println("Incorrect format, please enter valid input.");
                String newsearch= myScan1.next();
                sampling(searchArray,newsearch);
            }
            x++;
        }//checks format of first two in string
        for(int j=0; j<4; j++){
            if((int)inCode.charAt(x)<48||(int)inCode.charAt(x)>57){
                
                System.out.println("char that failed second loop"+(int)(inCode.charAt(x)));
                System.out.println("Incorrect format, please enter valid input.");
                String newsearch1= myScan1.next();
                sampling(searchArray,newsearch1);
            }
            x++;
        }//checks format of string
        
     
        boolean check=true;
        for(int k=0;k<searchArray.length;k++){
            for(int l=0;l<searchArray[k].length; l++){
                for(int p=0;p<searchArray[k][l].length; p++){
                    for(int w=0;w<6;w++){
                    if((int)(searchArray[k][l][p].charAt(w))!=(int)(inCode.charAt(w))){
                        break;
                    }
                    if(w==5){
                        System.out.println("("+k+","+l+","+p+")");
                        check=false;
                    }
                    }
                }
                
            }//end middle loop
        }//end outer loop
        if(check){
            System.out.println("Code not found");
        }
    }//end method
    
    public static void percentage(String[][][] original, String[][][] made){
        int origNum=0;
        int madeNum=0;
        
        for(int i=0;i<original.length;i++){
            for(int j=0;j<original[i].length;j++){
                for(int k=0;k<original[i][j].length;k++){
                    origNum++;
                }
            }
        }
        
        for(int l=0;l<made.length;l++){
            for(int m=0;m<made[l].length;m++){
                for(int n=0;n<made[l][m].length;n++){
                    madeNum++;
                }
            }
        }
        int percentage=0;
        int difference=madeNum-origNum;
        if(origNum!=0){
        percentage=(difference/origNum);
        }
    
        System.out.println("The holoportation was "+percentage+"% complete." );
    
    }
    
    public static void frankenstein(String[][][] input){
     
     String smallest="test";
     String temp="wrong";
     int pos=0;
     int i=0;
     int j=0;
     int k=0;
     for( i=0;i<input.length;i++){
            for( j=0;j<input[i].length;j++){
                for( k=0;k<input[i][j].length;k++){
                       smallest= input[i][j][k];
                       temp=input[i][j][k];
                       pos=k;
                       int hold=(int)(temp.charAt(0));
                    for(int y=k+1;y<input[i][j].length;y++){
                        int in=(int)(input[i][j][y].charAt(0));
                        if(in<hold){
                            hold=in;
                            pos=y;
                        }//alphabatizes if not same first letter

                      
                        
                    }//end y
                        
                        
               
                     smallest=input[i][j][pos];
                   
            
                     input[i][j][pos]=temp;
                     input[i][j][k]=smallest;
                    }
            }//end j
    }//end i
     for(int z=0;z<input.length;z++){
         int temporary=input[z].length;
         int position=0;
         int e=0;
         for( e=z+1; e<input.length;e++){
             if (input[e].length< temporary){
                 temporary=input[e].length;
                 position=e;
             }
         }
         if(e<input.length){
         String[][] tempString=input[z];
         input[z]=input[e];
         input[e]=tempString;
         }
     }      
    
        print(input);
    }//end frankenstein    
    
    
}// end of class

