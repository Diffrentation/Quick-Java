import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _3Sum {

   public static List<List<Integer>> threeSum(int[] nums, int TriplateSum) {
      List<List<Integer>> result = new ArrayList<>(); // create a result ArrayList
      Arrays.sort(nums); // Sort the array
      for (int i = 0; i < nums.length - 2; i++) {
         if (i > 0 && nums[i] == nums[i - 1]) { // remove duplicates
            continue;
         }
         int left = i + 1;
         int right = nums.length - 1;
         while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];
            if (sum == TriplateSum) {
               result.add(Arrays.asList(nums[i], nums[left], nums[right]));
               // Move left and right pointers and skip duplicates
               while (left < right && nums[left] == nums[left + 1]) {
                  left++;
               }
               while (left < right && nums[right] == nums[right - 1]) {
                  right--;
               }
               left++;
               right--;
            } else if (sum < TriplateSum) {
               left++;
            } else {
               right--;
            }
         }
      }
      return result;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      // Ask the user for the size of the array
      System.out.print("Enter the number of elements in the array: ");
      int n = sc.nextInt();

      // Create an array to store user input
      int[] nums = new int[n];

      // Accept the array input from the user
      System.out.println("Enter the elements of the array:");
      for (int i = 0; i < n; i++) {
         nums[i] = sc.nextInt();
      }

      // Ask the user for the target sum for the triplets
      System.out.println("Enter the target sum for the triplets: ");
      int TriplateSum = sc.nextInt();

      // Call the threeSum method
      _3Sum solution = new _3Sum();
      List<List<Integer>> result = solution.threeSum(nums, TriplateSum);

      // Print the result
      if (result.isEmpty()) {
         System.out.println("No triplets found.");
      } else {
         System.out.println("Triplets that sum to " + TriplateSum + ":");
         for (List<Integer> triplet : result) {
            System.out.println(triplet);
         }
      }

      sc.close(); // Close the scanner
   }
}
