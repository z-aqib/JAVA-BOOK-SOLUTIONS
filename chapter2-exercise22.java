package c2e22;

import java.util.Scanner;

public class C2e22 {

    public static void main(String[] args) {
        
        /*
        *2.22 (Financial application: monetary units) 
        Rewrite Listing 2.10, ComputeChange.java, to fix the possible loss of 
        accuracy when converting a double value to an int value. Enter the input 
        as an integer whose last two digits represent the cents. For example, 
        the input 1156 represents 11 dollars and 56 cents.
        */
        
        /*
        Listing 2.10 ComputeChange.java
            import java.util.Scanner;
            
            public class ComputeChange {
                public static void main(String[] args) {
                    
                    // Create a Scanner
                    Scanner input = new Scanner(System.in);

                    // Receive the amount
                    System.out.print("Enter an amount in double, for example 11.56: ");
                    double amount = input.nextDouble();

                    int remainingAmount = (int)(amount * 100);

                    // Find the number of one dollars
                    int numberOfOneDollars = remainingAmount / 100;
                    remainingAmount = remainingAmount % 100;

                    // Find the number of quarters in the remaining amount
                    int numberOfQuarters = remainingAmount / 25;
                    remainingAmount = remainingAmount % 25;

                    // Find the number of dimes in the remaining amount
                    int numberOfDimes = remainingAmount / 10;
                    remainingAmount = remainingAmount % 10;

                    // Find the number of nickels in the remaining amount
                    int numberOfNickels = remainingAmount / 5;
                    remainingAmount = remainingAmount % 5;

                    // Find the number of pennies in the remaining amount
                    int numberOfPennies = remainingAmount;

                    // Display results
                    System.out.println("Your amount " + amount + " consists of");
                    System.out.println(" " + numberOfOneDollars + " dollars");
                    System.out.println(" " + numberOfQuarters + " quarters ");
                    System.out.println(" " + numberOfDimes + " dimes");
                    System.out.println(" " + numberOfNickels + " nickels");
                    System.out.println(" " + numberOfPennies + " pennies");
                }
            }
        */
        
        //create scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Receive the amount
        System.out.print("Enter an amount in integer, for example 11.56 as 1156: ");
        int amount = input.nextInt();

        // Find the number of one dollars
        int numberOfOneDollars = amount / 100;
        int remainingAmount = amount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        // Display results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters ");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
    }
}
