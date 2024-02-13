#include<stdio.h>
int main()
{
    int n;
    printf("enter n:");
    scanf("%d",&n);
    float a=100.0;
    for(int i=1;i<=n;i++)
    {
      printf("%f ",a);
      a=a*0.5;
    }
    return 0;
}