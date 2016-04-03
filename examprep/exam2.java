

public class exam2{
    
    
    
    public static int X(int x, int y){
        x+=3;
        y+=x;
        if (y>x+2){return x;}
        return x+y;
    }
    
    
    public static void main(String[] args){
        
        
      int x=10;
      int y=X(x,x);
      System.out.println(X(7, -4));
        
       
      
       
        
        
        
        
    }   
}