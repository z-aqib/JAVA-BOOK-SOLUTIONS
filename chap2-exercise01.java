package c2e1;

import java.util.Scanner;

public class C2e1 {

    public static void main(String[] args) {
        // TODO code application logic here
        /*
        2.1 (Convert Celsius to Fahrenheit) 
        Write a program that reads a Celsius degree in a double value from the 
        console, then converts it to Fahrenheit, and displays the result. The 
        formula for the conversion is as follows:
        fahrenheit = (9 / 5) * celsius + 32
        Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
        Here is a sample run:
            Enter a degree in Celsius: 43.5
            43.5 Celsius is 110.3 Fahrenheit
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome! This program will convert Celsius degree to "
                + "Farenheit. ");
        System.out.println("Enter a degree in Celsius: ");
        double celsius = input.nextDouble(); //user input
        double fahrenheit = (9.0 / 5) * celsius + 32; //fahrenheit computation 
        System.out.println(celsius+" Celsius is "+fahrenheit+" Fahrenheit. ");
    }
}
