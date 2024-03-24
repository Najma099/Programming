package array;
public class Rotatearr {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90};
        int n=arr.length;
        //display original array
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
        System.out.print("\n");
        //reverse the entire array
       int i=0;
       int j=n-1;
       while(i<j)
       {
        swap(arr,i,j);
        i++;
        j--;
       }
       //print the reverse array
       for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
        System.out.print("\n");
        //reverse first segment of array
        int k=5%n;
        i=0;
        j=k-1;
        while(i<j)
       {
        swap(arr,i,j);
        i++;
        j--;
       }
       //print that array 
       for(int ele:arr)
       {
            System.out.print(ele+" ");
       }
       System.out.print("\n");
       //reverse remaining array
       i=k;
       j=n-1;
       while(i<j)
       {
          swap(arr,i,j);
          i++;
          j--;
       }
       // print the entire rotated array
       for(int ele:arr)
       {
          System.out.print(ele+" ");
       }
       System.out.print("\n");
    }
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
