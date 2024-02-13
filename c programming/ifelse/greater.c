#include<stdio.h>
int main ()
{
    int a,b,c;
    printf("Enter a:");
    scanf("%d",&a);
    printf("Enter b:");
    scanf("%d",&b);
    printf("Enter c:");
    scanf("%d",&c);
    if(a>b)
    {
        if(a>c)
        printf("a is greater");
        else
        printf("c is greater");
    }
    else
    {
        if(b>c)
        printf("b is the gretest");
        else
        printf("c is the greatest");
    }
    return 0;
    
}