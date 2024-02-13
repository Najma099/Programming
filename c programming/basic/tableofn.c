#include<stdio.h>
int main()
{
    int n;
    printf("enter the value of n:");
    scanf("%d",&n);
    for (int i=1;i<=10*n;i++)
    {
        if(i%n==0)
        printf("%d ",i);

    }
    return 0;
}