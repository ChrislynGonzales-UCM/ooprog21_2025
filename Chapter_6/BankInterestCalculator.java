import java.util.Scanner;

public class BankInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance;
        final double INTEREST_RATE = 0.03; 
        int year = 1;
        String choice;

        
        System.out.print("Enter your initial balance: ");
        balance = input.nextDouble();

        
        input.nextLine();

        
        while (true) {
            
            balance += balance * INTEREST_RATE;

            
            System.out.printf("Year %d balance: %.2f%n", year, balance);

            
            System.out.print("Do you want to calculate next year's balance? (yes/no): ");
            choice = input.nextLine().trim().toLowerCase();

            if (!choice.equals("yes")) {
                System.out.println("Thank you! Final balance: " + String.format("%.2f", balance));
                break;
            }

            year++;
        }

        input.close();
    }
}
