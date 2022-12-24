package c3e01;

import java.util.Scanner;

public class C3e01 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        *3.1 (Algebra: solve quadratic equations) 
        The two roots of a quadratic equation
            ax^2 + bx + c = 0 
        can be obtained using the following formula:
            r1 = (-b + (b^2 - 4ac)^0.5)/2a
        and 
            r2 = (-b - (b^2 - 4ac)^0.5)/2a
        b^2 - 4ac is called the discriminant of the quadratic equation. 
        - If it is positive, the equation has two real roots. 
        - If it is zero, the equation has one root. 
        - If it is negative, the equation has no real roots.
        Write a program that prompts the user to enter values for a, b, and c 
        and displays the result based on the discriminant. If the discriminant 
        is positive, display two roots. If the discriminant is 0, display one 
        root. Otherwise, display “The equation has no real roots.” Note you can 
        use Math.pow(x, 0.5) to compute 2x. 
        Here are some sample runs:
            Enter a, b, c: 1.0 3 1
            The equation has two roots −0.381966 and −2.61803
                Enter a, b, c: 1 2.0 1
                The equation has one root −1.0
                    Enter a, b, c: 1 2 3
                    The equation has no real roots
        */
        
        // create scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // welcome to line
        System.out.println("ALGEBRA: SOLVE QUADRATIC EQUATIONS");
        System.out.println("Welcome! This program calculates the root of an "
                + "equation ax^2 + bx + c . ");
        
        // user input of equation
        System.out.print("Please enter 'a': ");
        double a = input.nextDouble();
        System.out.print("Please enter 'b': ");
        double b = input.nextDouble();
        System.out.print("Please enter 'c': ");
        double c = input.nextDouble();
        
        // print the equation, use s.o.p for printing in same line
        
        switch ((int)a) {
            case 1 -> 
                // if a = 1, ignore 'a' when printing
                System.out.print("The equation is x^2 ");
            case 0 -> 
                // if a = 0, ignore x^2 altogether
                System.out.print("The equation is ");
            case -1 -> 
                // if a = -1 , print - infront of x^2 and ignore 'a'
                System.out.print("The equation is -x^2 ");
            default -> 
                // else display 'a' normally
                System.out.print("The equation is " + (int)a + "x^2 ");
        }
            
        // if b is positive and a does not equal to 0, then print +
        if (b > 0 && a != 0) {
            System.out.print("+ ");
        }
            
        switch ((int)b) {
            case 1 -> 
                // if b = 1, ignore 'b' when printing
                System.out.print("x ");
            case 0 -> 
                // if b = 0, ignore 'b' entirely, skip 'x'
                System.out.print("");
            case -1 -> 
                // if b = -1, print '-x' and ignore 'b'
                System.out.print("- x ");
            default -> 
                // else print b and 'x' normally
                System.out.print(""+(int)b+"x ");
        }
            
        // if c is positive then print +
        if (c > 0) {
            System.out.print("+ ");
        }

        // compute discriminant i.e. b^2 - 4ac
        double discriminant = Math.pow(b, 2D) - (4D * a * c);
        
        // discriminant checker: if its positive, calculate the two roots
        if (discriminant > 0) {
            
            // calculate root 2 
            double root2 = (-b - Math.pow(discriminant, 0.5D)) / (2D*a);
            
            // calculate root 1 
            double root1 = (-b + Math.pow(discriminant, 0.5D)) / (2D*a);
            
            // display it has two roots and the root itself
            System.out.print(""+(int)c+" and it has two real roots = "+root1+" "
                    + "and "+root2);
            
        }
        
        // discriminant checker: if its 0, calculate one root
        else if (discriminant == 0) {
            
            // calculate root 1 
            double root1 = (-b + Math.pow(discriminant, 0.5D)) / (2D*a);
            
            // output it has one root and the root itself
            System.out.print(""+(int)c+" and it has one real root = "+root1);
            
        }
        
        // discriminant checker: if its negative, output no roots and end
        else {
            
            System.out.print(""+(int)c+" and it does not have any real roots. ");
            
        }
        
        // leave a line
        System.out.println("");
        
    }
    
}