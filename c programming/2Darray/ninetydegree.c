#include<stdio.h>
int main()
{
    int arr[3][3]={{1,2,3},{4,5,6},{7,8,9}};
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
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }
    printf("\n");
    //swap two extreme ends
    for(int i=0;i<3;i++)
    {
        int k=2;
        for(int j=0;j<k;j++)
        {
           int temp=arr[i][j];
           arr[i][j]=arr[i][k];
           arr[i][k]=temp;
           k--; 
        }
    }
    //print the rotated matrix
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }
}