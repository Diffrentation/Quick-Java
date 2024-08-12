import java.util.Scanner;

public class RemoveDuplicate {
    public static boolean map[]=new boolean[26];
    public static void RemoveDuplicateString(String Str,int i,String newStr){
        //Base case: remove duplicates;
            if(i==Str.length()){
                System.out.println(newStr);
                return;
            }
        //Check if current character is already in the map;
        char CurrChar=Str.charAt(i);
        if(map[CurrChar-'a']==true){
            RemoveDuplicateString(Str, i+1, newStr);
        }
        else{
            newStr+=CurrChar;
            map[CurrChar-'a']=true;
            RemoveDuplicateString(Str, i+1, newStr);
        }
    }
    public static void main(String[] args){
        System.out.println("Enter the String to remove Duplicates: ");
        Scanner sc=new Scanner(System.in);
        String Str=sc.nextLine();
        System.out.println("String after removing Duplicates: ");
        RemoveDuplicateString(Str, 0, "");
    }
}