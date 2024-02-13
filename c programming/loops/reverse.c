#include<stdio.h>
int main()
{
    int n;
    printf("Enter n:");
    scanf("%d",&n);
    int ld=0;
    int rev=0;
    int i=1;
    while(n!=0)
    {
       ld=n%10;
       rev=rev*10+ld;
       n=n/10;
    }
    printf("%d",rev);
    return 0;
}