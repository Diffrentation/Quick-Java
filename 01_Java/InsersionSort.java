public class InsersionSort {
    public static void printArray(int arr[]){
        System.out.print("Sorted array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();  // To move to the next line after printing the array
    }


    public static void main(String[] args) {
        int arr[] = {8,  65, 21, 94, 10,  67, 4,12,16};
        for(int i=0;i<arr.length;i++) {
            int current = arr[i];
             int j = i-1;
            while(j>=0 &&current<arr[j]){
                arr[j+1] =arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printArray(arr);  // Call the function to print the sorted array
    }
}
