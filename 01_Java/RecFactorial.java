public class RecFactorial {
   public static int calFact(int n){
    if(n==1||n==0){
        return 1;
    }
    int fact=calFact(n-1);
    int FinalFact=n*fact;
    return FinalFact;

   }
    public static void main(String[] args) {
        int n=5;
        int fact=calFact(n);
        System.out.println("Factorial of "+n+" is : "+fact);
        
    }
}
