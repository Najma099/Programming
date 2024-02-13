#include<stdio.h>
int main()
{
    int n;
    printf("Enter n:");
    scanf("%d",&n);
    if(n%3==0 || n%5==0)
    {
        if(n%15!=0)
        printf("the number is divisible by 5 or 3 and not by 15");
        else
        printf("the number is divisible by 5 or 3 and by 15");
    }
    else
    printf("the number is not divisible by 3 or 5");
    return 0;
}
