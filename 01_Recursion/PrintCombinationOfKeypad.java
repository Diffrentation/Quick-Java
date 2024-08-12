import java.util.Scanner;

public class PrintCombinationOfKeypad {
    public static String map[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void PrintCombinationOfKeypad(String str, String Combination, int i) {
        if (i == str.length()) {
            System.out.print(Combination+" ");
            return;
        }

        char CurrChar = str.charAt(i);
        String Mapping = map[CurrChar - '0'];
        for (int j = 0; j < Mapping.length(); j++) {
            PrintCombinationOfKeypad(str, Combination + Mapping.charAt(j), i + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the Number to Find Combination of characters: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        PrintCombinationOfKeypad(str, "", 0);
    }
}
