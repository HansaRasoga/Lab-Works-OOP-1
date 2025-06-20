import java.util.Scanner;
public class BMICal 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("BMI Calculator");
        System.out.println("Choose input type:");
        System.out.println("1. Kilograms and Meters");
        System.out.println("2. Pounds and Inches");
        System.out.print("Enter 1 or 2: ");
        int choice = scanner.nextInt();

        double bmi = 0;

        if (choice == 1) 
        {
            // Metric input
            System.out.print("Enter weight in kilograms: ");
            double weight = scanner.nextDouble();

            System.out.print("Enter height in meters: ");
            double height = scanner.nextDouble();

            bmi = weight / (height * height);

        } 
        else if (choice == 2) 
        {
            // Imperial input
            System.out.print("Enter weight in pounds: ");
            double weight = scanner.nextDouble();

            System.out.print("Enter height in inches: ");
            double height = scanner.nextDouble();

            bmi = (weight * 703) / (height * height);
        } 
        else 
        {
            System.out.println("Invalid choice.");
            scanner.close();
            return;
        }

        // Display BMI
        System.out.println("Your BMI is: "+ bmi);

        // Display category
        System.out.println("BMI Category :");

        if (bmi < 18.5) 
        {
            System.out.println(" Underweight");
        } 
        else if (bmi < 24.9) 
        {
            System.out.println(" Normal weight");
        } 
        else if (bmi < 29.9) 
        {
            System.out.println(" Overweight");
        } 
        else 
        {
            System.out.println(" Obesity");
        }

        scanner.close();
    }
}