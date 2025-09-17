import java.util.Scanner;

public class DemoGrossPay {
    
    static final double HOURLY_RATE = 22.75;

    
    public static void calculateGross(double hoursWorked) {
        double grossPay = hoursWorked * HOURLY_RATE;
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Hourly rate: $" + HOURLY_RATE);
        System.out.println("Gross pay: $" + String.format("%.2f", grossPay));
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of hours worked: ");
        double hours = input.nextDouble();

        calculateGross(hours);
    }
}
