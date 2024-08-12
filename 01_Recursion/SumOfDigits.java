import java.util.Scanner;

public class SumOfDigits {
        public static int CalSumOfN(int n){
        if(n<=0){
            return 0;
        }
        int digit=CalSumOfN(n/10);
        int mod=n%10;
        int sum=digit+mod;
        return sum;
    }

    public static void main(String[] args) {
            System.out.println("Enter the value of N : ");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println("Sum of N Number is: "+CalSumOfN(n));
    }
}


