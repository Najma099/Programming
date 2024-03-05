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
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
          sum=sum+arr[i][j];
        }
    }
    printf("%d",sum);
    
    

}