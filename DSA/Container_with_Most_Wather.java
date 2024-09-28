import java.util.Scanner;;
public class Container_with_Most_Wather { // Typo in class name, should be 'Water'

    // Method to calculate the maximum water that can be stored
    public int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0;
        int j = height.length - 1;  // Two pointers, i at the start, j at the end

        // Two-pointer technique
        while (i < j) {
            int currentHeight = Math.min(height[i], height[j]);  // Take the smaller height
            int width = j - i;  // Calculate the distance between the two pointers
            int area = currentHeight * width;  // Calculate the area

            // Update maxArea if the current area is larger
            maxArea = Math.max(maxArea, area);

            // Move the pointer that points to the smaller height
            if (height[i] < height[j]) {
                i++;  // Move left pointer if it's smaller
            } else {
                j--;  // Otherwise, move the right pointer
            }
        }

        return maxArea;  // Return the maximum area found
    }

    public static void main(String[] args) {
        // Create an instance of the class
        Container_with_Most_Wather solution = new Container_with_Most_Wather();
        
        // Take user input for the number of heights
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of the Heights: ");
        int arr = sc.nextInt();
        
        // Create an array to store heights and input each height
        int height[] = new int[arr];
        for (int i = 0; i < arr; i++) {
            System.out.print("Enter the Height of wall " + i + " :");
            height[i] = sc.nextInt();
        }
        
        // Call the maxArea method and print the result
        int result = solution.maxArea(height);
        System.out.println("Maximum area of stored water is: " + result);
    }
}
