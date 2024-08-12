import java.util.Scanner;
import java.math.BigInteger;
import java.util.*;

/**
 * FibonacciSeriesRecursion
 */
public class FibonacciSeriesRecursion {
    public static BigInteger CalFib(int n){

        if(n<=1){
            return BigInteger.valueOf(n);
        }
        BigInteger FinalFib=CalFib(n-1).add(CalFib(n-2));
        return FinalFib;
    }
    
    public static void printFib(int n){
        for(int i=0;i<n;i++){
        System.out.print(CalFib(i)+", ");
        }

    }

    public static void main(String[] args) {
        System.out.print("Enter the Number of Digits for print Fibonacci Series :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Final Fibonacci Series is : ");
        printFib(n);

        
    }
}