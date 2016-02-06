//Maura Godfrey
//Due Feb 8 2016
//cse 002
//hw02 Arithmetic Program

//Caculate for the following:
    // A.Total cost of each kind of item
    // B.Sales tax charged buying all of each kind of item
    // C.Total cost of purchases (before tax)
    // D.Total Sales tax
    // E.Total paid for this transaction including sales tax
    
public class Arithmetic {
    //set up main method
    public static void main(String[] args) {
        //input data
        
        int numPants = 3; //number of pants
        double pantsPrice = 34.98; //cost per pair of pants
        
        int numShirts = 2; //number of shirts
        double shirtPrice = 24.99; //cost per shirt
        
        int numBelts = 1; //number of belts
        double beltPrice = 33.99; //cost per belt
        
        double paSalesTax = 0.06; // tax rate
    
        //Part A
        double totalCostOfPants, totalCostOfShirts, totalCostOfBelts; //declaration of variables
        totalCostOfPants=numPants*pantsPrice;
        totalCostOfShirts=numShirts*shirtPrice;
        totalCostOfBelts=numBelts*beltPrice;
        //calculating the cost of each item before tax is applied
        
        System.out.println("The total cost of pants is "+totalCostOfPants+" dollars.");
        System.out.println("The total cost of shirts is "+totalCostOfShirts+" dollars.");
        System.out.println("The total cost of belts is "+totalCostOfBelts+" dollars.");
        
        //Part B
        double salesTaxOnPants1, salesTaxOnShirts1, salesTaxOnBelts1,
        salesTaxOnPants, salesTaxOnShirts, salesTaxOnBelts,
        salesTaxOnPants2, salesTaxOnBelts2,salesTaxOnShirts2;
        salesTaxOnPants1=totalCostOfPants*paSalesTax;
        salesTaxOnShirts1=totalCostOfShirts*paSalesTax;
        salesTaxOnBelts1=totalCostOfBelts*paSalesTax;
        //calculating the sales tax
        
        salesTaxOnPants2=(int)(salesTaxOnPants1*100);
        salesTaxOnShirts2=(int)(salesTaxOnShirts1*100);
        salesTaxOnBelts2=(int)(salesTaxOnBelts1*100);
        //converting the sales tax an integer, multiplied by 100 so that it cut off at the correct decimal place
        
        salesTaxOnPants=salesTaxOnPants2/100;
        salesTaxOnShirts=salesTaxOnShirts2/100;
        salesTaxOnBelts=salesTaxOnBelts2/100;
        
        System.out.println("The sales tax on pants is "+salesTaxOnPants+" dollars.");
        System.out.println("The sales tax on shirts is "+salesTaxOnShirts+" dollars.");
        System.out.println("The sales tax on belts is "+salesTaxOnBelts+" dollars.");
        
        //Part C
        double totalCostOfPurchases;
        totalCostOfPurchases=totalCostOfPants+totalCostOfShirts+totalCostOfBelts;
        //calculating the cost before tax
        
        System.out.println("The total cost of the purchases before tax is "+
        totalCostOfPurchases+" dollars.");
        
        //Part D
        double totalSalesTax;
        totalSalesTax=salesTaxOnPants+salesTaxOnShirts+salesTaxOnBelts;
        //calculating the sales tax
        
        System.out.println("The total sales tax is "+totalSalesTax+" dollars.");
        
        //Part E
        double totalTransaction;
        totalTransaction=totalCostOfPurchases+totalSalesTax;
        //calculating the total cost of the transaction
        
         System.out.println("The total cost of the transaction is "+totalTransaction+" dollars.");
    }
}