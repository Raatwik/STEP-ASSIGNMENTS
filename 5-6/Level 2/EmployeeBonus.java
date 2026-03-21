import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] oldSalaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("--- Employee " + (i + 1) + " ---");
            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();
            
            System.out.print("Enter years of service: ");
            double years = scanner.nextDouble();
            
            if (salary < 0 || years < 0) {
                System.out.println("Invalid input. Salary and years of service cannot be negative. Please try again.");
                i--;
            } else {
                oldSalaries[i] = salary;
                yearsOfService[i] = years;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = oldSalaries[i] * 0.05;
            } else {
                bonuses[i] = oldSalaries[i] * 0.02;
            }
            
            newSalaries[i] = oldSalaries[i] + bonuses[i];
            
            totalOldSalary += oldSalaries[i];
            totalBonus += bonuses[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("\n--- Zara Company Payout Summary ---");
        System.out.printf("Total Old Salary: $%.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Payout: $%.2f\n", totalBonus);
        System.out.printf("Total New Salary: $%.2f\n", totalNewSalary);
        
        scanner.close();
    }
}