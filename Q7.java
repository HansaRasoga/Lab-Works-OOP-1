import java.util.Scanner;
public class Q7 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Get temperature in Celsius from user
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Display result
        System.out.println("Temperature in Fahrenheit = "+ fahrenheit);

        scanner.close();
    }
}
