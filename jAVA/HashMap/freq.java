import java.util.HashMap;
import java.util.Map;
//import java.util.Scanner;

public class freq {
    public static void main(String[] args) {
        int [] arr ={1,4,2,5,1,4,4,6,4,4,4};
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(mp.containsKey(arr[i]))
                mp.put(arr[i], mp.get(arr[i]) + 1);
            else
                mp.put(arr[i],1);
        }

        System.out.println("FREQUENCIES:");
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            System.out.println("Element: " + entry.getKey() + " Freq:" + entry.getValue());
        }
        
        int maxEle = 0;
        int maxFreq = -1;
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                maxEle = entry.getKey();
            }
        }
        

        System.out.printf("%d with hightest frequency %d",maxEle,maxFreq);
    }
}
