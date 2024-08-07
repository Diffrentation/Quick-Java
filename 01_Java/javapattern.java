package Java;
public class javapattern {
    public static void main(String[] args) {
        int i,k;
        int n=5;
        int j;
        for(i=1;i<=n;i++){
            for(j=i;j<=n-1;j++){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
