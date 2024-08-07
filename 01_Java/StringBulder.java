
import java.util.*;
public class StringBulder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Bhupendra");
        for(int i=0;i<sb.length()/2+1;i++) {
           int front=i;
           int back=sb.length()-1-i;
        //    System.out.println(front+" "+back);
           char frontchar = sb.charAt(front);
           char backchar = sb.charAt(back);
        //    System.out.println(frontchar+" "+backchar);
           sb.setCharAt(frontchar, backchar);
           sb.setCharAt(backchar, frontchar);
        }
        System.out.println(sb);

    }
}