import java.util.*;

public class main {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap <>();
        mp.put("Akash",21);
        mp.put("Yash",16);
        mp.put("Lav",17);
        mp.put("rishika",18);
        mp.put("harry",19);

        //getting value of a key from the HashMap
        System.out.println(mp.get("Yash"));
        mp.put("Akash",25);
        System.out.println(mp.get("rts"));
        System.out.println(mp.get("Akash"));
        System.out.println(mp.remove("Akash"));
        System.out.println(mp.remove("kiya"));
        System.out.println(mp.containsKey("Akash"));
        mp.putIfAbsent("Yashika",34);
        System.out.println(mp.values());
        System.out.println(mp.keySet());
        System.out.println(mp.entrySet());
        for(String key : mp.keySet()){
            System.out.printf("the age of %s is %d\n",key,mp.get(key));
        }
        System.out.println();

        for(Map.Entry<String, Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }

        System.out.println();
        for(var e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
    }
}
