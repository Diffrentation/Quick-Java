package Java;
public class palendrome {
    public static void main(String[] args) {
        int n=5;
        int i,j,k;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(k=i;k>=1;k--){
                System.out.print(k);
            }
            for(j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
