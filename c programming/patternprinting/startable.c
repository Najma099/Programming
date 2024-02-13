#include<stdio.h>
int main()
{
    int n;
    printf("Enter row:");
    scanf("%d",&n);
    int str=n;
    int nsp=1;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=str;j++)
        {
            printf("*");
        }
        for(int k=1;k<=nsp;k++)
        {
            printf(" ");
        }
        for(int l=1;l<=str;l++)
        {
            printf("*");
        }
        printf("\n");
         nsp=nsp+2;
        str--;
       
    }
   
    return 0;
}