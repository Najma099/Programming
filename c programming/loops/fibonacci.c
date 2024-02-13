#include<stdio.h>
int main()
{
    int n;
    printf("Enter n:");
    scanf("%d",&n);
    int a=1;
    int b=1;
    int sum;
    for(int i=1;i<=n;i++)
    {
      sum=a+b;
      printf("the fibonacci number of %d is %d \n",i+2,sum);
      a=b;
      b=sum;
    }
}