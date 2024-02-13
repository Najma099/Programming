#include<stdio.h>
int main()
{
    int r;
    printf("Enter row:");
    scanf("%d",&r);
    int a=r;
    for(int i=1;i<=r;i++)
    {
        for(int j=1;j<=a;j++)
        {
            printf("%d",j);
        }
        printf("\n");
        a--;
    }
    return 0;
}