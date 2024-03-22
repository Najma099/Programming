#include<stdio.h>
int main()
{
   int r; 
   printf("Enter row:");
   scanf("%d",&r);
   int c;
   printf("Enter col:");
   scanf("%d",&c);
   int arr[r][c];
   for(int i=0;i<r;i++)
   {
    for(int j=0;j<c;j++)
    {
        scanf("%d",&arr[i][j]);
    }
   }
   //transpose
   for(int i=0;i<c;i++)
   {
    for(int j=0;j<r;j++)
    {
        printf("%d ",arr[j][i]);
    }
    printf("\n");
   }
}
