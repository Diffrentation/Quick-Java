import java.util.HashSet;
public class HasUnion {
    public int hasSet(int arr1[],int arr2[]){
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int arr1[]={3,5,4,3,5};
        int arr2[]={5,4,5,3,7,8,4};
        HasUnion has=new HasUnion();
        int result=has.hasSet(arr1, arr2);
        System.out.println(result);

    }
}
