public class CheckArrSort {
        public static boolean isSorted(int arr[],int i){
            if(i==arr.length-1){
                return true;
            }
            if(arr[i]>arr[i+1]){
                return false;
            }
            else{
                return isSorted(arr, i+1);
            }
        }
    public static void main(String[] args) {
        int arr[]={2,3,5};
        System.out.println("isSorted :"+isSorted(arr, 0));
    }
}