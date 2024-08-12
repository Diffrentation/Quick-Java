public class GCDRecursion {
    public static int GCD(int a, int b){
        if(b==0){
            return a;
        }
        int gcd=GCD(b, a%b);
    }
    public static void main(String[] args) {
        
    }
}
