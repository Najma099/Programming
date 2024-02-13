#include<stdio.h>
int main()
{
    int a;
    printf("Enter the value of a:");
    scanf("%d",&a);
    int b;
    printf("Enter the value of b:");
    scanf("%d",&b);
    int c;
    c=a%b;
    printf("%d",c);
    return 0;
}