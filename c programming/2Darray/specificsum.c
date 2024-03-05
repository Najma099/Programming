#include<stdio.h>
int main()
{
    int m;
    printf("Enter m:");
    scanf("%d",&m);
    int n;
    printf("Enter n:");
    scanf("%d",&n);
    int sum=0;
    int arr[m][n];
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    int l1;
    printf("Enter l1:");
    scanf("%d",&l1);
    int r1;
    printf("Enter r1:");
    scanf("%d",&r1);
    int l2;
    printf("Enter l2:");
    scanf("%d",&l2);
    int r2;
    printf("Enter r2: ");
    scanf("%d",&r2);
    for(int i=l1 && l1<m ;i<=l2;i++)
    {
        for(int j=r1 && l2<n ;j<=r2;j++)
        {
            sum=sum+arr[i][j];
        }
    }
    printf("%d",sum);
}