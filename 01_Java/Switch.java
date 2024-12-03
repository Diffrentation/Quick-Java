 import java.util.*;
 public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Button: ");
        int button=sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("HEllow");
                break;
            case 2:
            System.out.println("Namaste");
            break;
            case 3:
            System.out.println("Bonjur");
            default:
            System.out.println("Invalid Button");
        }
    }
}
