
import java.util.*;
public class CheckOddEvenNum {
    public static void checkOddEven(float num) {
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
    }

    public static void main(String[] args) {
            System.out.println("Enter the number :");
            Scanner sc = new Scanner(System.in);
           float num= sc.nextFloat();
            checkOddEven(num);
    }
}