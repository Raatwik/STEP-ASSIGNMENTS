import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (cm): ");
        double base = sc.nextDouble();
        System.out.print("Enter height (cm): ");
        double height = sc.nextDouble();

        // Calculate area in square cm
        double areaSqCm = 0.5 * base * height;

        // Convert area to square inches
        // Since 1 in = 2.54 cm, then 1 sq in = (2.54 * 2.54) sq cm
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + areaSqIn 
            + " and sq cm is " + areaSqCm);

        sc.close();
    }
}