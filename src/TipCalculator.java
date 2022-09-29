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

        System.out.print("Enter a cost in dollars and cents! (-1 to end) ");
        double item = scan.nextDouble();
        double bill = item;
        while (item != -1) {

            System.out.print("Enter a cost in dollars and cents! (-1 to end) ");
            item = scan.nextDouble();
            bill = bill + item;
         if (item == -1) {
            bill = 1 + bill;
         }
        }
        scan.nextLine();
        System.out.println("------------------------");
        System.out.println("Total bill before tip: " + bill);
        System.out.println("Tip percentage: " + tipPercentage);
        System.out.println("Total tip:" + (bill * INTPERCENTTODECIMAL));
        System.out.println("Total bill with tip: " + (bill + (INTPERCENTTODECIMAL * bill)));
        System.out.println("Per person cost before tip: " + (bill / members));
        System.out.println("Tip per person: " + (INTPERCENTTODECIMAL * bill) / members);
        System.out.println("Total cost per person:" + (bill + (INTPERCENTTODECIMAL * bill)) / members);


    }
}