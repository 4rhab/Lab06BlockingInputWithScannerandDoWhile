import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons= 0;
        double efficiency = 0;
        double price = 0;
        // wouldn't let me run my code without adding 0's here? Told me not initialized properly?
        boolean done = false;

        do {
            System.out.print("Enter gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                String trash = in.next();
                System.out.println("Not a valid Input.");
            }
        } while (!done);

        done = false;

        do {
            System.out.print("Enter fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                efficiency = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                String trash = in.next();
                System.out.println("Not a valid Input.");
            }
        } while (!done);

        done = false;

        do {
            System.out.print("Enter price of gas per gallon: ");
            if (in.hasNextDouble()) {
                price = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                String trash = in.next();
                System.out.println("Not a valid Input.");
            }
        } while (!done);

        double costPerHundredMiles = (price / efficiency) * 100;
        double distance = gallons * efficiency;

        System.out.println("Cost per 100 miles is: $" + costPerHundredMiles);
        System.out.println("Distance car can go with the gas in tank: " + distance + " miles");
    }
}
