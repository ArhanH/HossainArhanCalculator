import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        int members = scan.nextInt();
        scan.nextLine();

        System.out.print("What is the tip percentage? (0 - 100) ");
        int tipPercentage = scan.nextInt();
        final double INTPERCENTTODECIMAL = tipPercentage / 100.0;
        scan.nextLine();

        //double bill = item ;
        System.out.print("Enter a cost in dollars and cents! (-1 to end) ");
        double item = scan.nextDouble();
        while (item != -1) {
            System.out.print("Enter a cost in dollars and cents! (-1 to end) ");
            item = scan.nextDouble();
        }
        scan.nextLine();

        System.out.println("------------------------");
        //System.out.print("Total Bill Before Tip: " + bill);
    }
}