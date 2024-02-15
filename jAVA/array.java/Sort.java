import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr={23,67,86,3,5,90};
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println(" ");
        Arrays.sort(arr);
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }
    
}
