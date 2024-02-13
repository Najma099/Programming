#include<stdio.h>
int main()
{
    int r;
    printf("Enter row:");
    scanf("%d",&r);
    // int c;
    // printf("Enter col:");
    // scanf("%d",&c);
    int c;
    c=1;
    for(int i=1;i<=r;i++)
    {
        c=1;
        for(int j=1;j<=i;j++)
        {
            printf("%d ",c);
            c=c+2;
        }
        printf("\n");
    }
    return 0;
}