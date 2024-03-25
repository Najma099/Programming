package twoD_array;

public class transpose {
    public static void main(String[] args) {
        int [][] arr={{1,2,3,4},{5,6,7,8}};
        for(int i=0;i<arr[0].length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.print("\n");
        }
    }
}
