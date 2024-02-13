//1-2+3-4+5
#include<stdio.h>
int main()
{
    int n;
    printf("Enter n:");
    scanf("%d",&n);
    int sum=0;
    for(int i=1;i<=n;i++)
    {
        if(i%2==0)
        sum=sum+i;
        else sum=sum-i;
        

    }
    printf("sum of series is %d",sum);
    return 0;
}