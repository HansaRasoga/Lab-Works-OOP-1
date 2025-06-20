import java.util.Scanner;
public class SwappingNo 
{
    public static void main(String[] args) 
    {
        int a;
        int b;
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number (a): ");
        a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        b = scanner.nextInt();

        // Display before swap
        System.out.println("\nBefore swap: a = " + a + ", b = " + b);

        // Swapping without using third variable
        a = a + b;
        b = a - b;
        a = a - b;

        // Display after swap
        System.out.println("After swap: a = " + a + ", b = " + b);

        scanner.close();
    }
}