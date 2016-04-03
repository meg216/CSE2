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
    }
}    
    