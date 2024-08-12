public class CalPowerOfDigit {
    public static int CalPower(int base,int exponent){
        if(exponent==0){
            return 1;
        }
        else{
            int ans=base*CalPower(base, exponent-1);

            return ans;
        }
    }
    public static void main(String[] args) {
        System.out.println(CalPower(2, 5));
    }
}
