// Maura Godfrey
//cse 002
//March 11, 2016
//Bowtie lab


public class Bowtie{
    //main method required for all Java programs
    public static void main(String[] args){
        int nStars=9;
        int nStarsOrig=nStars-1;
        int n=nStars;
        int nSpace =0;
        int n1 = nSpace;
        
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
            
        }  //downward triangle
        
        if(nStars==1){
           while(nStars<nStarsOrig){
               nStars=nStars+2;
                
              System.out.print("*");
                
           }
        }   
            
    }
}    
    