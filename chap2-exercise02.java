package c2e2;

import java.util.Scanner;

public class C2e2 {

    public static void main(String[] args) {
        // TODO code application logic here
        /*
        2.2 (Compute the volume of a cylinder) 
        Write a program that reads in the radius and length of a cylinder and 
        computes the area and volume using the following formulas:
        area = radius * radius * π
        volume = area * length
        Here is a sample run:
            Enter the radius and length of a cylinder: 5.5 12
            The area is 95.0331
            The volume is 1140.4
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome! This program computes the area and volume of "
                + "a cylinder using the radius and length entered by you. ");
        System.out.println("Please enter the radius of the cylinder. ");
        double radius = input.nextDouble(); //user radius
        if (radius>=0) { //if radius is positive, proceed further
            System.out.println("Please enter the length of the cylinder. ");
            double length = input.nextDouble(); //user length
            if (length>=0) { //if length is positive, proceed further
                double area = radius * radius * Math.PI; //area computation
                double volume = area * length; //area volume
                System.out.println("The area is "+area); //output area
                System.out.println("The volume is "+volume); //output volume
            }
            else //if length is negative or 0, output error message and stop
                System.out.println("ERROR: Please enter a positive value for length. ");
        }
        else //if radius is negative or 0, output error message and stop
            System.out.println("ERROR: Please enter a positive value for radius. ");
    }
}
