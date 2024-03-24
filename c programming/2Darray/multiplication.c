#include<stdio.h>
int main()
{
    int arr[2][3]={{2,3,4},{5,6,7}};
    int brr[3][4]={{4,5,6,6},{3,4,5,6},{6,7,8,9}};
    for(int i=0;i<2;i++)
    {
        int sum=0;
        for(int j=0;j<4;j++)
        {
            for(int k=0;k<2;k++)
            {
               sum=sum+arr[i][k]*brr[k][j];  
            }
            printf("%d ",sum);
        }
        printf("\n");
    }
}