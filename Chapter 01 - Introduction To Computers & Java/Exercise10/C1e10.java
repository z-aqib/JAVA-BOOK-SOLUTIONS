package Exercise10;

public class C1e10 {

    public static void main(String[] args) {
        
        System.out.println("Welcome! This program will display the average speed of a runner in miles per hour.");
        System.out.println("He has run 14 kilometers in 45 minutes and 30 seconds. ");
        double miles = 14/1.6; // convert kilometers into miles 
        double hours = 45.5/60; // compute minutes into hours
        double speed = miles/hours; // using formula distance/time, compute average speed
        System.out.println("The average speed is: "+speed+" miles per hour. ");
        
    }
}
