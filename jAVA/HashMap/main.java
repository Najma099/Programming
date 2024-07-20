// package HashMap;

// import java.util.*;

// public class main {
//     public static void main(String[] args) {
//         Map<String, Integer> mp = new HashMap<>();
        
//         // Adding elements to the HashMap
//         mp.put("Akash", 21);
//         mp.put("Yash", 16);
//         mp.put("Lav", 17);
//         mp.put("rishika", 18);
//         mp.put("harry", 19);

//         // Getting the value associated with a key
//         System.out.println("Value associated with Yash: " + mp.get("Yash"));

//         // Updating the value associated with a key
//         mp.put("Akash", 25);
        
//         // Trying to get the value of a key that doesn't exist
//         System.out.println("Value associated with rts (non-existent key): " + mp.get("rts"));
        
//         // Getting the updated value of Akash
//         System.out.println("Updated value associated with Akash: " + mp.get("Akash"));
        
//         // Removing a key-value pair
//         System.out.println("Removing Akash: " + mp.remove("Akash"));
        
//         // Trying to remove a key that doesn't exist
//         System.out.println("Removing kiya (non-existent key): " + mp.remove("kiya"));
        
//         // Checking if a key exists
//         System.out.println("Checking if Akash exists: " + mp.containsKey("Akash"));
        
//         // Adding a key-value pair only if the key is not already present
//         mp.putIfAbsent("Yashika", 34);
        
//         // Printing all values in the HashMap
//         System.out.println("All values: " + mp.values());
        
//         // Printing all keys in the HashMap
//         System.out.println("All keys: " + mp.keySet());
        
//         // Printing all key-value pairs in the HashMap
//         System.out.println("All entries: " + mp.entrySet());

//         // Iterating over keys
//         for (String key : mp.keySet()) {
//             System.out.printf("The age of %s is %d\n", key, mp.get(key));
//         }

//         System.out.println();

//         // Iterating over entries
//         for (Map.Entry<String, Integer> e : mp.entrySet()) {
//             System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
//         }

//         System.out.println();

//         // Using var to iterate over entries
//         for (var e : mp.entrySet()) {
//             System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
//         }
//     }
// }
