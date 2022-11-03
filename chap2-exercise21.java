package c2e21;

import java.util.Scanner;

public class C2e21 {

    public static void main(String[] args) {
        /*
        *2.21 (Financial application: calculate future investment value) 
        Write a program that reads in investment amount, annual interest rate, 
        and number of years and displays the future investment value using the 
        following formula:
            futureInvestmentValue =
                investmentAmount * (1 + monthlyInterestRate)^(numberOfYears*12)
        For example, if you enter amount 1000, annual interest rate 3.25%, and 
        number of years 1, the future investment value is 1032.98.
        Here is a sample run:
            Enter investment amount: 1000.56
            Enter annual interest rate in percentage: 4.25
            Enter number of years: 1
            Future value is $1043.92
        */
        
        //create scanner object for user input
        Scanner input = new Scanner(System.in);
        
        //welcome to line
        System.out.println("FINANCIAL APPLICATION: FURTURE INVESTMENT VALUE");
        System.out.println("Welcome! This program will display the future investment "
                + "value using: ");
        System.out.println("    - investment amount in dollars ($) ");
        System.out.println("    - annual interest rate in percentage (%) ");
        System.out.println("    - number of years (365 days = 1 year) in integer value. ");
        
        //user input of starting investment amount
        System.out.println("Please enter investment amount in dollars ($). ");
        double amount = input.nextDouble();
        
        //amount checker: if amount is positive, proceed further
        if (amount > 0) {
            
            //user input of annual interest rate
            System.out.println("Please enter annual interest rate in percentage (%). ");
            double air = input.nextDouble();
            
            //annual interest rate checker: if its between 0 and 100, proceed further
            if (air > 0 && air <= 100) {
                
                //user input of number of years
                System.out.println("Please enter number of years. ");
                int years = input.nextInt();
                
                //years checker: if its positive, proceed further
                if (years > 0) {
                    
                    //change annual interest rate from percentage to decimal
                    double aid = air / 100D;
                    
                    //change annual interest decimal from annual to monthly
                    double mid = aid /12D;
                    
                    //formula computation
                    double f1 = 1 + mid;
                    double f2 = years * 12D;
                    double f3 = Math.pow(f1, f2);
                    double fiv = amount * f3;
                    
                    //display future investment value
                    System.out.println("Future investment value is $"+fiv);
                    
                    //EXTRA----------------------------------------------------
                    
                    //calculate future investment value rounded to the nearest dollar
                    double fivrounded = Math.ceil(fiv);
                    
                    //display rounded value
                    System.out.println("    Rounded to the nearest dollar is $"+fivrounded);
                    
                }
                //years checker: if its negative, output error message and stop
                else
                    System.out.println("ERROR: Please enter a positive value for number of years. ");
                
            }
            //annual interest rate checker: if its negative, output error message and stop
            else if (air <= 0)
                System.out.println("ERROR: Please enter a positive value for annual interest rate. ");
            
            //annual interest rate checker: if its above 100, output error message and stop
            else
                System.out.println("ERROR: Please enter a value for annual interest rate within the range 0 to 100. ");
            
        }
        //amount checker: if amount is negative or 0, output error message and stop.
        else
            System.out.println("ERROR: Please enter a positive value for investment amount. ");
        
    }
    
}