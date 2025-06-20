import java.util.Scanner;
public class Q6
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        // Initialize an array to hold marks for 5 subjects
        int[] marks = new int[5];
        int sum = 0;
        // Input marks for 5 subjects
        System.out.println("Enter marks for 5 subjects (out of 100):");
        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            sum += marks[i];
        }

        // Calculate percentage
        double percentage = (sum / 500.0) * 100;

        // Display results
        System.out.println("\nTotal Marks = " + sum );
        System.out.println("Percentage = "+ percentage+ "%");

        scanner.close();
    }
}