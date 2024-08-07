public class SelectionSort {
    public static void printArray(int arr[]){
        System.out.print("Sorted array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();  // To move to the next line after printing the array
    }

    public static void main(String[] args) {
        int arr[] = {8, 3, 5, 2, 9, 1, 6, 7, 4};
       
        // Selection Sort
        for(int i = 0; i < arr.length - 1; i++) {
            int sm = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[sm] > arr[j]){
                    sm = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[sm];
            arr[sm] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
}
