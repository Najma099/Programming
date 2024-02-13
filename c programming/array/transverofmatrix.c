#include<stdio.h>
int main()
{
    int a[2][3];
    printf("enter the elements of array:");
    for(int i=0;i<2;i++)
    {
        for(int j=0;j<3;j++)
        scanf("%d",&a[i][j]);
    }
    for (int i=0;i<3;i++)
    {
        for(int j=0;j<2;j++){
            printf("%d ",a[j][i]);
        }
      printf("\n");
    }
    return 0;
}
