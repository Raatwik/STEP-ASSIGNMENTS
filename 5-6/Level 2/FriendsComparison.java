import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] names = {"A", "B", "C"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            
            System.out.print("Enter height (in cm or inches) for " + names[i] + ": ");
            heights[i] = scanner.nextDouble();
        }

        int minAge = ages[0];
        int youngestIndex = 0;
        
        double maxHeight = heights[0];
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestIndex = i;
            }
            
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestIndex = i;
            }
        }

        System.out.println("\n--- Results ---");
        System.out.println("The youngest friend is " + names[youngestIndex] + " at " + minAge + " years old.");
        System.out.println("The tallest friend is " + names[tallestIndex] + " with a height of " + maxHeight + ".");
        
        scanner.close();
    }
}