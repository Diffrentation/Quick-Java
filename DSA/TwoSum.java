import java.util.Scanner;

public class TwoSum {
    // Method to find two indices whose corresponding values add up to the target
    public int[] twoSum(int nums[], int target) {
        // Outer loop to iterate through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Inner loop to check every subsequent element for a valid pair
            for (int j = i + 1; j < nums.length; j++) {
                // Calculate the sum of the current pair of numbers
                int check = nums[i] + nums[j];

                // If the sum matches the target, return the indices of the two numbers
                if (check == target) {
                    return new int[]{i, j};  // Return the pair of indices
                }
            }
        }
        // If no solution is found after checking all pairs
        System.out.println("No Possible Solution");
        return null;  // Return null if no valid pair is found
    }

    // Main method to test the twoSum method
    public static void main(String[] args) {
        TwoSum solution = new TwoSum(); // Create an instance of TwoSum class

        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        // Prompt the user to enter the target element
        System.out.print("Enter the Target Element: ");
        int target = sc.nextInt();

        // Call the twoSum method and store the result
        int[] result = solution.twoSum(nums, target);

        // Print the result if a valid pair is found
        if (result != null) {
            System.out.println("Indices: [" + result[0] + ", " + result[1]+"]");
        }
    }
}
