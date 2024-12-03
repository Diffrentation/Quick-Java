import java.util.*;
public class CheckgratherLesser {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A:");
        int a=sc.nextInt();
        System.out.print("Enter B:");
        int b=sc.nextInt();
        if(a==b){
            System.out.println("A is equal to b");
        }
        else{
            if(a>b){
             System.out.println("A is grather then b");
            }
            else{
             System.out.println("B is grather then A");
            }

        }
        }
}