#include<stdio.h>
int main()
{
    int r;
    printf("Enter row:");
    scanf("%d",&r);
    int a=65;
    for(int i=1;i<=r;i++)
    {
        a=65;
        for(int j=1;j<=i;j++)
        {
            printf("%c",a);
            a=a+1;
        }
        printf("\n");
    }
    return 0;
}