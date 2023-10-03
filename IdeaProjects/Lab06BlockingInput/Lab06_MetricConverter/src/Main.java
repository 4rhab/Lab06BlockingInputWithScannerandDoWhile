import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meters = 0;
        boolean done = false;

        do {
            System.out.print("Enter a measurement in meters: ");
            if (in.hasNextDouble()) {
                meters = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                String trash = in.next();
                System.out.println("Not a valid input.");
            }
        } while (!done);

        double miles = meters * 0.000621371;
        double feet = meters * 3.28084;
        double inches = meters * 39.3701;

        System.out.println("The measurement in miles is: " + miles);
        System.out.println("The measurement in feet is: " + feet);
        System.out.println("The measurement in inches is: " + inches);
    }
}
