#include<stdio.h>
int main()
{
    int n;
    int c=1;
    printf("enter n:");
    scanf("%d",&n);
    for(int i=1;i<=n;i++)
    {
        c=c*i;
    }
    printf("%d",c);
    return 0;
}