import java.util.HashMap;
import java.util.Map;  // Import the Map interface

public class Hashmap {
    public static void main(String[] args) {
        // Creating a HashMap with String keys and Integer values
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 1340909);            // Adding key-value pairs to the map
        map.put("China", 1427000000);
        map.put("Japan", 490310);
        
        // // Print the entire map
        // System.out.println(map);
        
        // Check if "India" exists in the map and print its population
        // if (map.containsKey("India")) {
        //     System.out.println("India Exists in the Map and India's population is: " + map.get("India"));
        // } else {
        //     System.out.println("India not found in the map");
        // }

        // Iterating over the map using Map.Entry
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.print(e.getKey() + ": ");  // Print the country name (key)
            System.out.println(e.getValue());     // Print the population (value)
        }
        
        // Example integer array (not related to HashMap logic, but part of your original code)
        int arr[] = {2, 4, 3, 6, 5, 8, 7, 9};
        // You can perform operations on this array, but it’s separate from the HashMap part.
        // For example, printing the array:
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
