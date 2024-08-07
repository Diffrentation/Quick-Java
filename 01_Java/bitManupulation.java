import java.util.Scanner;

public class bitManupulation {
    // Write a program to find if a number is a power of 2 or not.
    // Write a program to toggle a bit a position = “pos” in a number “n”.
    // Write a program to count the number of 1’s in a binary representation of the number.
    // Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another. [BONUS]
    // public static void checkOddEven() {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.print("Enter a number::");
    //     int n=sc.nextInt();
    //     boolean isOdd = (n & 1) == 1;
    //     if (isOdd) {
    //         System.out.println("Number is odd");
    //     } else {
    //         System.out.println("Number is even");
    //     }
    // }


    public static void toogleBit(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        System.out.print("Enter the position for Toogle the bit: ");
        int pos=sc.nextInt();
        int result= 1<<pos;
        int newResult=~(result);
        int FinalNum=newResult&num;
        System.out.print("Toggled number is: "+FinalNum);

    }

    
    public static void main(String[] args) {
        // Call the checkOddEven method from the main method
        // checkOddEven();
        toogleBit();
    }
}