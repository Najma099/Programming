#include<stdio.h>
int main()
{
    int r;
    printf("Enter row:");
    scanf("%d",&r);
    for(int i=1;i<=r;i++)
    {
        for(int j='A';j<='D';j++)
        {
            printf("%c",j);
        }
        printf("\n");
    }
    return 0;
}