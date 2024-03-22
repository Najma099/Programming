#include<stdio.h>
//1 2 3 
//5 6 7 
//9 1 1 


//1 5 9
//2 6 1
//3 7 1
int main()
{
    int arr[3][3]={{1,2,3},{4,5,6},{7,8,9}};
    //int brr[3][3];
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
           // brr[i][j]=arr[j][i];
           printf("%d ",arr[j][i]);
        }
        printf("\n");
    }
    //for java
    // for(int ele :arr)
    // {
    //     system.out.println(ele+ " ");
    // }



    // for(int i=0;i<3;i++)
    // {
    //     for(int j=0;j<3;j++)
    //     {
    //       printf("%d ",brr[i][j]);  
    //     }
    //     printf("\n");
        
    // }
}