#include<stdio.h>
int main()
{
    int n;
    printf("Enter n:");
    scanf("%d",&n);
    int fac=1;
    for (int i=n;i>0;i--)
    {
       fac=fac*i;
    }
    printf("%d",fac);
    return 0;
}