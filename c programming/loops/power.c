#include<stdio.h>
int main()
{
    int a;
    printf("Enter a:");
    scanf("%d",&a);
    int b;
    printf("Enter b:");
    scanf("%d",&b);
    int c=1;
    for(int i=1;i<=b;i++)
    {
        c=c*a;
    }
    printf("The value of a to the power b is %d",c);
    return 0;
}