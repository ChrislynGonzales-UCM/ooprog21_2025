
public class BankBalanceByRateAndYear {
    public static void main(String[] args) {
        double initialBalance = 1000.0; 
        double balance;
        double[] rates = {0.02, 0.03, 0.04, 0.05}; 

        System.out.println("Bank Balance and Interest by Year and Rate");
        System.out.println("------------------------------------------");

       
        for (int i = 0; i < rates.length; i++) {
            double rate = rates[i];
            System.out.printf("\nInterest Rate: %.0f%%\n", rate * 100);
            System.out.println("Year\tBalance");

            
            balance = initialBalance;

            
            for (int year = 1; year <= 4; year++) {
                balance += balance * rate; 
                System.out.printf("%d\t%.2f\n", year, balance);
            }
        }
    }
}
