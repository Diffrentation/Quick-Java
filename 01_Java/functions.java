import java.util.Scanner;

public class functions {  // Class name should start with an uppercase letter
    public static int printMyName(int a ,int b) {
        int sum=a+b;
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {  // Corrected method signature
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        System.out.print("Sum is :");
        printMyName(a, b);
    }
}
