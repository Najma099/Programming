#include<stdio.h>
int sum(int a)
{
    if(a<=9)
    return a;
    else{
        return (a%10)+sum(a/10);
    }
}
int main()
{
    int n;
    printf("Enter n:");
    scanf("%d",&n);
    int sum(n);
    return;
}