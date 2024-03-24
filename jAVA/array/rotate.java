package array;


public class rotate {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90};
        int n=arr.length;
        //display original array
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
        //reverse entire array
        int i=0;
        int j=n-1;
        swap(arr,i,j);
        System.out.println();

        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
        //reverse part of array
         int k=2;
         i=0;
         j=k-1;
         swap(arr,i,j);
        System.out.println();

        for(int ele:arr)
        {
            System.out.print(ele+" ");
          } 
        System.out.println();
       //3rd step reverse part of array
       i=k;
       j=n-1;
       swap(arr,i,j);
       for(int ele:arr)
        {
            System.out.print(ele+" ");
          }   

    }
    public static void swap(int[] arr,int i,int j)
    {
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        
    }
}
