import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        boolean done = false;

        do {
            System.out.print("Enter the width: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                String trash = in.next();
                System.out.println("Not a valid Input.");
            }
        } while (!done);

        done = false;

        do {
            System.out.print("Enter the height: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                String trash = in.next();
                System.out.println("Not a valid Input.");
            }
        } while (!done);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt((width * width) + (height * height));
        // got resource from w3schools to figure out how to calculate properly

        System.out.println("The Area of the rectangle is: " + area);
        System.out.println("The Perimeter of the rectangle is: " + perimeter);
        System.out.println("The Length of the diagonal is: " + diagonal);
    }
}
