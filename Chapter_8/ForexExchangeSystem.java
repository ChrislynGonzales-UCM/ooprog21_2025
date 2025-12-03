import java.util.Scanner;

public class ForexExchangeSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] currencies = {"USD", "EUR", "JPY", "GBP", "AUD"};
        double[][] rates = new double[5][5]; 
        System.out.println("===========================================");
        System.out.println("        FOREX EXCHANGE RATE SYSTEM");
        System.out.println("===========================================\n");

        
        for (int i = 0; i < currencies.length; i++) {
            System.out.println("Enter exchange rates for " + currencies[i] + ":");
            for (int day = 0; day < 5; day++) {
                System.out.print("Day " + (day + 1) + ": ");
                rates[i][day] = sc.nextDouble();
            }
            System.out.println();
        }

        
        System.out.println("\n===========================================");
        System.out.println("            FOREX SUMMARY REPORT");
        System.out.println("===========================================\n");

        for (int i = 0; i < currencies.length; i++) {
            System.out.println("Currency: " + currencies[i]);

            double peak = rates[i][0];
            double lowest = rates[i][0];

            
            for (int day = 0; day < 5; day++) {
                System.out.print("Day " + (day + 1) + ": " + rates[i][day]);

                if (day > 0) {
                    if (rates[i][day] > rates[i][day - 1]) {
                        System.out.print("  (Increase)");
                    } else if (rates[i][day] < rates[i][day - 1]) {
                        System.out.print("  (Decrease)");
                    } else {
                        System.out.print("  (No Change)");
                    }
                }

                System.out.println();

                if (rates[i][day] > peak) peak = rates[i][day];
                if (rates[i][day] < lowest) lowest = rates[i][day];
            }

            System.out.println("Peak Rate: " + peak);
            System.out.println("Lowest Rate: " + lowest);
            System.out.println("-------------------------------------------\n");
        }

        System.out.println("===========================================");
        System.out.println("             END OF REPORT");
        System.out.println("===========================================");
    }
}
