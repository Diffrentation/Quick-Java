package Java;
import java.util.Scanner;
public class StarPattern {

    //press the buttons for getting output
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n for Row");
        int n = sc.nextInt();
        int i,j;
        //outer loop;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
        }
        for(int k=1;k<=2*(n-i);k++){
            System.out.print(" ");
        }
        for(j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();

    }

        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("*");
        }
        for(int k=1;k<=2*(n-i);k++){
            System.out.print(" ");
        }
        for(j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();

    }
}
}