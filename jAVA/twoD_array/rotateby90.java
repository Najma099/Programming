package twoD_array;

public class rotateby90 {
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        //transpose
        for(int i=0;i<3;i++)
        {
            for(int j=i;j<3;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        //swap two extreme end
        
        for(int i=0;i<3;i++)
        {
            int a=0;
            int b=2;
        
            
                while(a<b)
                {
                    //swap(arr[i][a],arr[i][b])
                    int temp=arr[i][a];
                    arr[i][a]=arr[i][b];
                    arr[i][b]=temp;
                    a++;
                    b--; 
                }
            
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.print("\n");
        }

    }
    
}
