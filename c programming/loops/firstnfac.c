#include<stdio.h>
int main()
{
    int n;
    printf("Enter n:");
    scanf("%d",&n);
    int fac=1;
    for(int i=1;i<=n;i++)
    {
        fac=1;
        for(int j=1;j<=i;j++)
        {
           fac=fac*j;
        }
        printf("%d ",fac);
    }
    return 0;
}