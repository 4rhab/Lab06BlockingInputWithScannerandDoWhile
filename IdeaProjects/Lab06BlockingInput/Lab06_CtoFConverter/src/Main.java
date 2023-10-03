import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius;
        boolean done = false;

        do {
            System.out.print("Enter temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("The Temperature in Fahrenheit is: " + fahrenheit);
                done = true;
            } else {
                String trash = in.next();
                System.out.println("Not a valid Input.");
            }
        } while (!done);
    }
}