#include<stdio.h>
int main()
{
    // int r;
    // printf("Enter the value of row:");
    // scanf("%d",&r);
    // int c;
    // printf("Enter the value of column:");
    // scanf("%d",&c);
    // int arr[r][c];
    // for(int i=0;i<r;i++)
    // {
    //     for(int j=0;j<c;j++)
    //     {
    //         scanf("%d",&arr[i][j]);
    //     }
    // }
    int arr[4][5]={{1,2,3,4,5},{5,6,7,8,9},{1,2,3,4,5},{6,7,3,4,3}};
    int sum=0;
    int r1=0;
    int c1=1;
    int r2=2;
    int c2=4;
    for(int i=0;i<=2;i++)
    {
        for(int j=1;j<=4;j++)
        {
            sum=sum+arr[i][j];
        }
    }
    printf("%d",sum);
    return 0;
}