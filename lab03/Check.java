//Maura Godfrey
//Feb 12 2016
//cse002
//Check program

//Using the scanner class obtain the cost of the check, tip, and ways split
//determine how much each person will pay

import java.util.Scanner; //importing the scanner class

public class Check{
    //main method required for all Java programs
    public static void main(String[] args){
        Scanner myScanner = new Scanner ( System.in ); //declaring instance of scanner
        System.out.print("Enter the original cost of the check in the form xx.xx: "); //not adding the ln keeps the cursor on the line of the enter statement
        double checkCost=myScanner.nextDouble();//accepts user input, part of the Scanner object method
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): " ); //tip input
        double tipPercent = myScanner.nextDouble();
        tipPercent /= 100; //converting percentage to decimal
        System.out.print("Enter the number of people who went out to dinner: ");
        int numPeople = myScanner.nextInt(); //accepts integer number of people input
        
        //all input from user complete
        
        double totalCost;
        double costPerPerson;
        int dollars, dimes, pennies; //for whole dollar amount and storing digits to the right of the decimal
        
        totalCost=checkCost*(1+tipPercent);
        costPerPerson= totalCost/numPeople; //gets the whole amount
        dollars=(int)costPerPerson; //dropping the decimals to get whole dollar amount
        dimes=(int)(costPerPerson*10)% 10; //% operator returns remainder after division (essentially gives you the ones place when %10)
        pennies=(int)(costPerPerson*100)%10; //getting the ones place after multiplying by 100 gives pennies place
        System.out.println("Each person in the group owes $" + dollars+ '.' + dimes + pennies);
        
        
        
        
        
        
        
        
    }//end of main method

}//end of class