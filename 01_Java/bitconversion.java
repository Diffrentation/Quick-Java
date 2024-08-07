public class bitconversion {
    public static void main(String[] args) {
        int n = 23; // Example decimal number
        String binary = decimalToBinary(n);
        System.out.println("Decimal: " + n);
        System.out.println("Binary: " + binary);
    }

    public static String decimalToBinary(int n) {
        StringBuilder binary = new StringBuilder();
        
        // Loop until the number is greater than 0
        while (n > 0) {
            // Get the last bit using bitwise AND with 1
            int bit = n & 1;
            // Prepend the bit to the result (since we build binary from right to left)
            binary.insert(0, bit);
            // Right shift the number to move to the next bit
            n >>= 1;
        }
        
        // If the number was 0, handle that case
        if (binary.length() == 0) {
            binary.append("0");
        }

        return binary.toString();
    }
}