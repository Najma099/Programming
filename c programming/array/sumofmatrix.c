#include<stdio.h>
int main()
{
    int a[3][3];
    int sum1=0;
    int sum2=0;
    printf("enter the elements of array:");
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++){
           scanf("%d",&a[i][j]);  
        }
    }
    for (int i=0;i<3;i++)
    {
        sum1=sum2=0;
        for(int j=0;j<3;j++){
            sum1=sum1+a[i][j];
            sum2=sum2+a[j][i];
        }
      printf("sum1=%d,sum2=%d",sum1,sum2);
      printf("\n");
    }
    return 0;
}
