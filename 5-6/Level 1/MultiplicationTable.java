import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();
        
        int[] tableResults = new int[10];

        for (int i = 1; i <= 10; i++) {
            tableResults[i - 1] = number * i;
        }

        System.out.println("\n--- Multiplication Table ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + tableResults[i - 1]);
        }
        
        scanner.close();
    }
}