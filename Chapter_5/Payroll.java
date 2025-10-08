

import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee number: ");
        int empNum = input.nextInt();

        System.out.print("Enter pay rate: ");
        double rate = input.nextDouble();

        System.out.print("Enter hours worked this week: ");
        double hours = input.nextDouble();

        
        Employee emp = new Employee(empNum, rate, hours);

        
        double regularPay = emp.getRegularPay();
        double overtimePay = emp.getOvertimePay();
        double totalPay = regularPay + overtimePay;

        
        System.out.println("\n----------------------------------");
        System.out.println("Employee Number: " + emp.getEmployeeNumber());
        System.out.println("Pay Rate: $" + emp.getPayRate());
        System.out.println("Hours Worked: " + emp.getHoursWorked());
        System.out.println("Regular Pay: $" + String.format("%.2f", regularPay));
        System.out.println("Overtime Pay: $" + String.format("%.2f", overtimePay));
        System.out.println("Total Pay: $" + String.format("%.2f", totalPay));
        System.out.println("----------------------------------");
    }
}

// Employee class (included in same file)
class Employee {
    private int employeeNumber;
    private double payRate;
    private double hoursWorked;

    
    public static final int MAX_EMPLOYEE_NUMBER = 9999;
    public static final double MAX_RATE = 60.00;
    public static final double OVERTIME_MULTIPLIER = 1.5;
    public static final double REGULAR_HOURS = 40.0;

    
    public Employee(int employeeNumber, double payRate, double hoursWorked) {
        if (employeeNumber > MAX_EMPLOYEE_NUMBER)
            this.employeeNumber = MAX_EMPLOYEE_NUMBER;
        else
            this.employeeNumber = employeeNumber;

        if (payRate > MAX_RATE)
            this.payRate = MAX_RATE;
        else
            this.payRate = payRate;

        this.hoursWorked = hoursWorked;
    }

   
    public double getRegularPay() {
        if (hoursWorked <= REGULAR_HOURS)
            return hoursWorked * payRate;
        else
            return REGULAR_HOURS * payRate;
    }

    
    public double getOvertimePay() {
        if (hoursWorked > REGULAR_HOURS)
            return (hoursWorked - REGULAR_HOURS) * payRate * OVERTIME_MULTIPLIER;
        else
            return 0.0;
    }

    
    public int getEmployeeNumber() { return employeeNumber; }
    public double getPayRate() { return payRate; }
    public double getHoursWorked() { return hoursWorked; }
}

