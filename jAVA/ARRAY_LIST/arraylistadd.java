
import java.util.ArrayList;

public class arraylistadd {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        System.out.println(arr+" "+arr.size());
        arr.add(40);
        System.out.println(arr+" "+arr.size());
        arr.add(40);
        System.out.println(arr+" "+arr.size());
        arr.remove(1);
        System.out.println(arr+" "+arr.size());
    }
}
