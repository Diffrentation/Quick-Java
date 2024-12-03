import java.util.HashMap;

public class HasMajorityElem {
    public static int hash(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        // Count occurrences of each element
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        // Check if any element occurs more than n/3 times
        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                System.out.println("Majority element found: " + key);
                return key;
            }
        }

        return -1; // No majority element exists
    }

    public static void main(String[] args) {
        int nums[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};

        // Create an instance of HasMajorityElem
        HasMajorityElem has = new HasMajorityElem();

        // Call the hash method and store the result
        int result = has.hash(nums);

        // Output the result
        if (result != -1) {
            System.out.println("The majority element is: " + result);
        } else {
            System.out.println("No majority element found.");
        }
    }
}
