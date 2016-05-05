// Maura Godfrey
//cse 002
//March 11, 2016
//Bowtie lab
import java.util.Scanner;

public class Bowtie{
    //main method required for all Java programs
    public static void main(String[] args){
        int nStars=9;
        int nStarsOrig=nStars-1;
        int n=nStars;
        int nSpace=0;
        int n1= nSpace;
        
        while(nStars>0){
           n=nStars;
           n1 = 0;
           while (n1<nSpace){
           System.out.print(" ");
           n1++;
           }
           
           while(n>1){
            System.out.print("*");
            n=n-1;
            }
                if(n==1){
                System.out.println("*");
                }
           
            nStars=nStars-2;
            nSpace++;
            
        }  
        
        nStars=9;
        int starMin=3;
        int starCounter=0;
         nSpace=3;
        int spaceCounter=0;
        String space=" ";
        
        for(starCounter=0;starMin<=nStars;starMin+=2){
            
            for(spaceCounter=0;spaceCounter<nSpace;spaceCounter++){
            System.out.print(space);
            }
            for(starCounter=0;starCounter<starMin;starCounter++ ){
                System.out.print("*");
            }
        
        
        nSpace--;
        System.out.println();
        }  
        
        
        
        
        Scanner myScan=new Scanner(System.in);
        
       boolean check=true;
        while(check){
          System.out.println("Enter an odd integer between 3 and 33 inclusive: ");
          if(myScan.hasNextInt()){
              int t=myScan.nextInt();
              if(t>2&&t<34&&(t%2)==1){
                  nStars=t;
                  check=false;
              }
              else{
                  myScan.next();
                  continue;
              }
          }
          else{
              myScan.next();
                  continue;
          }
          
          
            /*if(!myScan.hasNextInt()){
            System.out.println("Enter an odd integer between 3 and 33 inclusive: ");
            myScan.next();
            continue;
            }
        int t=myScan.nextInt();
        System.out.println(t);
        if(t<3||t>33||(t%2)==0){
         System.out.println("Enter an odd integer between 3 and 33 inclusive: ");
            
            myScan.next(); 
            
            continue;
        }
        
            nStars=t;
            check=false;
        
       */
        }
        
      
        
        
        
        
        
        
        System.out.println("For loop: ");
        
      int i=0;
        int spaceCount=0;
        int starCount=nStars;
        for(i=0;starCount>0;i++){
            for(int j=0;j<spaceCount;j++){
                System.out.print(" ");
            }
            for(int k=0;k<starCount;k++){
            System.out.print("*");
            }
            System.out.println();
            spaceCount++;
            starCount-=2;
            
            
        }
        
        spaceCount-=2;
        starCount=3;
          for(int l=0;starCount<=nStars;l++){
            for(int m=0;m<spaceCount;m++){
                System.out.print(" ");
            }
            for(int b=0;b<starCount;b++){
            System.out.print("*");
            }
            System.out.println();
            spaceCount--;
            starCount+=2;
        }
        //end for loop
        
        System.out.println("Do- While loop: ");
        
        
        spaceCount=0;
        starCount=nStars;
        
        
        do{
            int ss=0;
            int sts=0;
            do{
                if(ss<spaceCount){
                System.out.print(" ");
                }
                ss++;
            }while(ss<spaceCount);
            
            do{
                System.out.print("*");
                sts++;
            }while(sts<starCount);
            
            
            
            System.out.println();
            spaceCount++;
            starCount-=2;
        }while(starCount>0);
        
        spaceCount-=2;
        starCount=3;
        do{
            int ss1=0;
            int sts1=0;
            do{
                System.out.print(" ");
                ss1++;
            }while(ss1<spaceCount);
            
            do{
                System.out.print("*");
                sts1++;
            }while(sts1<starCount);
            spaceCount--;
            starCount+=2;
            System.out.println();
        }while(starCount<=nStars);
        //end do while loop
        
    }
}    
    