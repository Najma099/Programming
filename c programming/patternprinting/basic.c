#include<stdio.h>
int main()
{
    int r;
    printf("Enter row:");
    scanf("%d",&r);
    int c;
    printf("Enter col:");
    scanf("%d",&c);
    for(int i=1;i<=r;i++)
    {
        for(int j=1;j<=c;j++)
        {
            printf("*");
        }
        printf("\n");
    }
    return 0;
}