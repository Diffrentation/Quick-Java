public class Recursion {
    public static void calSum(int n, int i,int sum){

        if(i==n){
            sum+=i;
            System.out.println(sum);
            return ;
        }
        sum+=i;
        calSum(n, i+1, sum);
    }

    public static void main(String[] args) {

        int n=5;
        int i=1;
        int sum=0;
        calSum(n,i,sum);
            
        }
}
