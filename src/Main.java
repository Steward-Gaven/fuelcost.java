import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double gallons = 0;
        double efficiency = 0;
        double price = 0;
        double hundred;
        double distanceLeft;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of gallons in tank: ");
        if (in.hasNextDouble()) {
            gallons = in.nextDouble();
            in.nextLine();
        }
        else
        {
            String trash1 = in.nextLine();
            System.out.println("You entered: " + trash1);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);
        }

        System.out.print("Enter fuel efficiency in miles per gallon: ");
        if (in.hasNextDouble()) {
            efficiency = in.nextDouble();
            in.nextLine();
        }
        else
        {
            String trash2 = in.nextLine();
            System.out.println("You entered: " + trash2);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);
        }

        System.out.print("Enter price per gallon of gas: ");
        if (in.hasNextDouble()) {
            price = in.nextDouble();
            in.nextLine();
        }
        else
        {
            String trash3 = in.nextLine();
            System.out.println("You entered: " + trash3);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);
        }

        hundred = (100 / efficiency) * price;
        System.out.println("Cost per 100 miles: " + hundred);

        distanceLeft = gallons * efficiency;
        System.out.println("distance until out of gas: " + distanceLeft);
    }
}