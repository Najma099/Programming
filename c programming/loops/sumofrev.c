#include<stdio.h>
int main()
{
    int n;
    printf("Enter n:");
    scanf("%d",&n);
    int sum=0;
    int ld=0;
    int rev=0;
    
    while(n!=0)
    {
        ld=n%10;
        rev=rev*10+ld;
        sum=sum+ld;
        n=n/10;
    }
    printf("%d %d",rev,sum);
    return 0;
}