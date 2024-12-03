public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        // Start with the first index
        int first = 0;

        // If the array is empty, return 0
        if (nums.length == 0) {
            return 0;
        }

        // Loop through the array starting from the second element
        for (int next = 1; next < nums.length; next++) {
            // If the next element is different from the current first pointer element
            if (nums[next] != nums[first]) {
                first++;              // Move the first pointer ahead
                nums[first] = nums[next];  // Copy the unique element to the new position
            }
        }

        // Return the number of unique elements (first + 1)
        return first + 1;
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        
        // Create an instance of Solution class
        RemoveDuplicatesfromSortedArray solution = new RemoveDuplicatesfromSortedArray();
        
        // Call the removeDuplicates method and store the result
        int result = solution.removeDuplicates(nums);
        
        // Print the result (number of unique elements)
        System.out.println(result);
        
        // Print the modified array up to the number of unique elements
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}
