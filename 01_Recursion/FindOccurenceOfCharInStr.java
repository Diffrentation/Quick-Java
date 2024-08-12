public class FindOccurenceOfCharInStr {
    public static int first = 0;
    public static int last = 0;

    public static void findOccurenceOfChar(String str, int i, char character) {
        if (i == str.length()) {
            System.out.println("First found at index: " + first);
            System.out.println("Last found at index: " + last);
            return; // Return to prevent further recursion
        }

        char currChar = str.charAt(i);
        if (currChar == character) {
            if (first == 0) {
                first = i; // Set first occurrence
            }
            last = i; // Continuously update last occurrence
        }

        findOccurenceOfChar(str, i + 1, character); // Properly increment index
    }

    public static void main(String[] args) {
        String str = "cbajlaajljadalalallaaldljaao";
        findOccurenceOfChar(str, 0, 'a'); // Use a char instead of String
    }
}
