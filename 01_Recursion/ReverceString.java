import java.util.Scanner;

public class ReverceString {
    public static void reverseString(String str, int i) {
        if(i==0){
            System.out.print(str.charAt(i));
            return;

        }
        System.out.print(str.charAt(i));
        reverseString(str, i-1);
    }
    public static void main(String[] args) {
        System.out.print("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        reverseString(input, input.length()-1);
    }
}
