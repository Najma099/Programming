
public class merge {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int ar[]={1,3,4,7};
        int br[]={2,5,6,9};
        int crr[]=new int[8];
        int i=0;
        while(a < ar.length && b < br.length) {
            if(ar[a]<br[b]) {
                crr[i]=ar[a];
                a++;
            }
            else {
                crr[i]=br[b];
                b++;
            }
            i++;
        }
        // Copy remaining elements of ar
        while(a < ar.length) {
            crr[i]=ar[a];
            a++;
            i++;
        }
        // Copy remaining elements of br
        while(b < br.length) {
            crr[i]=br[b];
            b++;
            i++;
        }
        for(int ele:crr) {
            System.out.print(ele+" ");
        }
    }
}
