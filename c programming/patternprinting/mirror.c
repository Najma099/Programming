#include<stdio.h>
int main()
{
    int n;
    printf("Enter n:");
    scanf("%d",&n);
    for(int i=1;i<=n;i++)
    {
        for(int s=1;s<=n-i;s++)
        {
            printf(" ");
        }
        for(int k=1;k<=i;k++)
        {
            printf("%d",k);
        }
        for(int m=i-1;m>=1;m--)
        {
            printf("%d",m);
        }
        printf("\n");
    }
    return 0;
}