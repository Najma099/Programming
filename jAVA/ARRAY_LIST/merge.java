package ARRAY_LIST;

public class merge {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int ar[]={1,3,4,7};
        int br[]={2,5,6,9};
        int crr[]=new int[8];
        for(int i=0;i<8;i++)
        {
            if(ar[a]<br[b])
            {
                crr[i]=ar[a];
                a++;
            }
            if(ar[a]>br[b])
            {
                crr[i]=br[b];
                b++;
            }
        }
        for(int ele:crr)
        {
            System.out.print(ele+" ");
        }
    }
}
