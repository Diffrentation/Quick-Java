import java.util.Scanner;

public class SendCharToLast {
    public static void sendCharlast(String str,int i,int count,String newStr ,char Char){
        if(i==str.length()){
            for(i=0;i<count;i++){
                newStr+=Char;
            }
            System.out.println(newStr);
            return;
        }


        char CurrChar=str.charAt(i);
        if(CurrChar==Char){
            count++;
        }
        else{
            newStr+=CurrChar;
        }
        sendCharlast(str, i+1, count, newStr,Char);

    }
    public static void main(String[] args) {
        System.out.println("Enter String: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Enter the Char you want to sent in the last: ");
        char Char=sc.next().charAt(0);
        sendCharlast(str, 0, 0, "", Char);
            sc.close();
        
        
    }
}
