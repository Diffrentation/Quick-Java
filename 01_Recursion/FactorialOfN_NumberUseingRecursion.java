import java.math.BigInteger;
import java.util.*;
public class FactorialOfN_NumberUseingRecursion {
    public static  BigInteger Calfact(int n){
        if(n<=1){
            return BigInteger.ONE;
        }
        else{
            BigInteger finalFactorial=BigInteger.valueOf(n).multiply(Calfact(n-1));  //Recursive call with decremented value of n
            return finalFactorial;  //Recursive call
        }

    }
    public static void main(String[] args) {
        System.out.print("Enter the number to Know the factoral of that number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + n + " is: " + Calfact(n));
        }        
        sc.close();
    }
}