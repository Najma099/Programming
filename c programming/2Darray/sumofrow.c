//maximum sum in a given matrix
#include<stdio.h>
int main()
{
    int arr[3][4]={{1,2,3,4},{5,6,7,8},{1,2,88,4}};
    int sum=0;
    int sumc=0;
    int index=0;
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<4;j++)
        {
            sum=sum+arr[i][j];
        }
        if(sum>sumc)
        sumc=sum;
        index=i;
    }
    printf("%d ",sum);
    printf("%d ",index+1);
}