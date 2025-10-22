import java.util.Scanner;

public class BankBalance2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double INTEREST_RATE = 0.03; 
        double balance;
        int year = 1;
        String userChoice;

        
        System.out.print("Enter starting bank balance: $");
        balance = scanner.nextDouble();

        do {
            
            balance = balance + (balance * INTEREST_RATE);

            
            System.out.printf("Year %d balance: $%.2f%n", year, balance);

            year++;

            
            System.out.print("Do you want to calculate for another year? (yes/no): ");
            scanner.nextLine(); 
            userChoice = scanner.nextLine().trim().toLowerCase();

        } while (userChoice.equals("yes"));

        System.out.println("Thank you! Final balance: $" + String.format("%.2f", balance));
        scanner.close();
    }
}
