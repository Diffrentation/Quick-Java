public class CalculatePower {
    public static int calculatePower(int base, int exponent) {
        if(exponent == 0) {
            return 1;
        }
        int power=calculatePower(base, exponent-1);
        return base * power;
    }
    public static void main(String[] args) {
            int base=2;
            int exponent=5;
            int power=calculatePower(base,exponent);
            System.out.println(power);
    }
}
