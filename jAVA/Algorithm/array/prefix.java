import java.util.Scanner;

public class prefix {
    static int[] makeprefix(int[] arr)
    {
       int n=arr.length;
       int[] pref= new int[n];
       pref[0]=arr[0];
       for(int i=1;i<n;i++)
       {
        pref[i]=pref[i-1]+arr[i];
       }
       return pref;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
        int[] pref=makeprefix(arr);
        for(int ele:pref)
        {
            System.out.print(ele+" ");
        }
    }
}
