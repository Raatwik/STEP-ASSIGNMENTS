import java.util.Scanner;

public class LargestCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter number3: ");
        int n3 = sc.nextInt();

        boolean isFirstLargest = (n1 >= n2 && n1 >= n3);
        boolean isSecondLargest = (n2 >= n1 && n2 >= n3);
        boolean isThirdLargest = (n3 >= n1 && n3 >= n2);

        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);

        sc.close();
    }
}