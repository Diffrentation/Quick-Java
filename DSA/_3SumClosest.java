import java.util.Arrays;

public class _3SumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sorting the nums array
        int closestSum = nums[0] + nums[1] + nums[2]; // Initial closest sum
        
        for (int i = 0; i < nums.length - 2; i++) { // Traversing on the nums array
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {  // While left is less than right
                int currentSum = nums[i] + nums[left] + nums[right]; // Current sum of the triplet
                
                // If the current sum equals the target, return immediately as it's the best possible answer
                if (currentSum == target) {
                    return currentSum;
                }
                
                // Check if the current sum is closer to the target than the previous closest sum
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }
                
                // If the current sum is less than the target, move the left pointer to increase the sum
                if (currentSum < target) {
                    left++;
                } else { // If the current sum is greater than the target, move the right pointer to decrease the sum
                    right--;
                }
            }
        }

        return closestSum; // Return the closest sum found
    }

    public static void main(String[] args) {
        int nums[] = {-1, 2, 1, -4};
        int target = 1;
        _3SumClosest solution = new _3SumClosest();
        int result = solution.threeSumClosest(nums, target);
        System.out.println("Closest Sum is " + result);
    }

}
