#include<stdio.h>
int main()
{
    int r;
    printf("Enter row:");
    scanf("%d",&r);
    int c;
    printf("Enter column:");
    scanf("%d",&c);
    
    int b=c;
    for(int i=1;i<=r;i++)
    {
        for(int j=1;j<=c;j++)
        {
            if(j==i || j==b )
            {
            printf("*");
            }
            else
            printf(" ");
        }
         
            b--;
        printf("\n");
    }
    return 0;
}