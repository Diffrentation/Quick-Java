package Java;
import java.util.*;

public class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        int marks[] = new int[n];
        
        // Input the marks for each subject
        for(int i = 0; i < n; i++) {
            System.out.print("Enter the marks for subject " + (i) + ": ");
            marks[i] = sc.nextInt();
        }
        
        // Display the marks
        System.out.println("Marks for each subject:");
        for(int i = 0; i < n; i++) {
            System.out.println("Subject " + (i) + ": " + marks[i]);
        }
    }
}
