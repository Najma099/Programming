#include<stdio.h>
int min(int c,int d)
{
   if(c>d)
   return d;
   else
   return c;
}
int hcf(int x,int y)
{
    int answer;
    int n= min( x, y);
    for(int i=1;i<=n;i++)
    {
        if(x%i==0 && y%i==0)
        answer=i;
    }
    return answer;
}
int main()
{
    int a;
    printf("Enter the value of a:");
    scanf("%d",&a);
    int b;
    printf("Enter the value of b:");
    scanf("%d",&b);
    int result=hcf(a,b);
    printf("the hcf of %d and %d is %d",a,b,result);
    return 0;
}