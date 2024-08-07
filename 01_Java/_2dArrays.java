import java.util.Scanner;

public class _2dArrays {
    public static void main(String[] args) {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter the Cols: ");
        int cols=sc.nextInt();
        int number[][]= new int [rows][cols];

        for( i=0;i<rows;i++){
            for( j=0;j<cols;j++){
                System.out.print("Enter the data "+(i)+(j)+": ");
                number[i][j]=sc.nextInt();

            }
        }
        for( i=0;i<rows;i++){
            for( j=0;j<cols;j++){
                System.out.println("Data on  "+(i)+(j)+": "+number[i][j]);
            }
        }
        System.out.print("Enter the element to search: ");
        int x=sc.nextInt();

        for( i=0;i<rows;i++){
            for( j=0;j<cols;j++){
                if(number[i][j]==x){
                    System.out.println("Element found at "+(i) +","+(j)+":" );
                     
                }
            }
        }


    }
}
