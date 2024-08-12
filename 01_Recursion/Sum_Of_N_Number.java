import java.util.Scanner;

/**
 * RecursionProblems
 */
public class Sum_Of_N_Number {

    public static int sumOfN(int n) {
        // Base case
        if (n == 0) {
            return 0;
        }
        // Recursive case
        return n + sumOfN(n > 0 ? n - 1 : n + 1);
    }

    public static void main(String[] args) {
        System.out.println("Enter the N: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         // Change this to any positive or negative number
        System.out.println("Sum of first " + n + " numbers is: " + sumOfN(n));
    }
}
