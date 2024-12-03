import java.util.HashSet;
public class HashIntersection {
    public static int interSec(int[] arr1, int[] arr2){
        HashSet<Integer> intersection=new HashSet<Integer>();
        for(int i=0; i<arr1.length; i++){
            intersection.add(arr1[i]);
        }
        for(int j=0; j<arr2.length; j++){
            if(intersection.contains(arr2[j])){
                System.out.print(arr2[j]+" ");
                intersection.remove(arr2[j]);
            }
            if(intersection.isEmpty()){
                break;
            }
        }
        System.out.println();
        return intersection.size();
    }
    public static void main(String[] args) {
        int []arr1={1,8,3,2,7,4,5,1};
        int []arr2={1,5,4,2,8,1};
        HashIntersection hashIntersection=new HashIntersection();
        System.out.print("Size of intersection: "+hashIntersection.interSec(arr1,arr2));
    }
}
