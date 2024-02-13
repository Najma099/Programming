#include<stdio.h>
int main()
{
    int a[2][3];
    int b[3][2];
    int c[3][3];
    printf("enter the elements of first array:");
    for(int i=0;i<2;i++)
    {
        for(int j=0;j<3;j++)
        scanf("%d",&a[i][j]);
    }
    printf("enter the elements of second array:");
    for (int i=0;i<3;i++)
    {
        for(int j=0;j<2;j++){
            scanf("%d",&b[i][j]);
        }
    }
    for (int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        { 
            int sum=0;
            for (int k=0;k<2;k++)
            {
                sum=sum+a[i][k]*b[k][j];
                c[i][j]=sum;
           
            }
            printf("%d",c[i][j]);
        }
 
    }
     return 0;
    }
    
