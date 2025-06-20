public class Q10 
{
        public static void main(String[] args) 
    {
        int rows = 5; // predefined row count

        for (int i = 1; i <= rows; i++) 
        {
            // Print '*' i times in each row
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("* ");
            }
            // Move to next line
            System.out.println();
        }
    }
}
