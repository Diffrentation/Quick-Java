import java.util.Scanner;

public class Tawer_OF_Hanoi {
    public static void tawerofHanoi(int n, String src,String helper,String dest){
            if(n==1){
                System.out.println("Transfer dist "+n+" from "+src+" to "+dest);
                return;
            }
            tawerofHanoi(n-1, src, dest, helper);
            System.out.println("Transfer dist "+n+" from "+src+" to "+dest);
            tawerofHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        System.out.print("Enter the number disks to transfer:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        tawerofHanoi(n, "Src", "Helper", "Dest");

    }
}
