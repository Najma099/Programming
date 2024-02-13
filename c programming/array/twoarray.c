#include<stdio.h>
int main()
{
    int a[2][3];
    int sum=0;
    printf("enter the elements of array:");
    for(int i=0;i<2;i++)
    {
        for(int j=0;j<3;j++)
        scanf("%d",&a[i][j]);
    }
    for (int i=0;i<2;i++)
    {
        for(int j=0;j<3;j++){
            printf("%d ",a[i][j]);
            sum=sum+a[i][j];
        }
      printf("\n");
    }
    printf("%d",sum);
    return 0;
}
