public class InvertTriangle {
    public static void pattern(int n){
        int k,j,i;
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    public static void pattern2(int n){
        int i,j;
        int sum;
        for(i=0;i<n;i++){
            for(j=1;j<=i;j++){
                 sum=i+j;
                 if((sum%2)==0){
                    System.out.print("1 ");
                 }
                 else{
                    System.out.print("0 ");
                 }
                }
                System.out.println();
        }
    }




    public static void ButterFlypattern3(int n){
        int i,j,k,l;
        for(i=0;i<=n;i++){//outer loop for printig the stars and spaces;
            for(j=0;j<=i;j++){   // inner loop for printing the stars;
                System.out.print("* ");
            }
            int spaces=2*(n-i);
            for(l=0;l<spaces;l++){
                System.out.print("  "); //inner loop for printing spaces;
            }
            for(k=0;k<=i;k++){  //inner loop for printing second stars;
            System.out.print("* ");
            }
            System.out.println();
        }
        for(i=n;i>=1;i--){//outer loop for printig the stars and spaces;
            for(j=0;j<=i;j++){   // inner loop for printing the stars;
                System.out.print("* ");
            }
            int spaces=2*(n-i);
            for(l=0;l<spaces;l++){
                System.out.print("  "); //inner loop for printing spaces;
            }
            for(k=0;k<=i;k++){  //inner loop for printing second stars;
            System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void palandrom(int n){
        int i,j,k;
        for(i=0;i<n;i++){
            for(j=0;j<=n-i;j++){
                System.out.print("  ");
            }
            for(k=i;k>=1;k--){
                System.out.print(" "+k);
            }
            for(int l=2;l<=i;l++){
                System.out.print(" "+l);
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        int i;
        int j;
        int n=5;
        for(i=0;i<n;i++){
            for(j=0;j<n-i;j++){
        System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.print("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println();
        pattern(5);
        System.out.println(" ");
        System.out.print("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println();
        pattern2(5);
        System.out.println(" ");
        System.out.print("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println();
        ButterFlypattern3(5);
        System.out.println(" ");
        System.out.print("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println();
        palandrom(5);


    }
}
