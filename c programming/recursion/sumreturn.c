#include<stdio.h>
int sum(int n)
{
    if(n==0 || n==1)
    return 1;
   int sol=n+sum(n-1);
   return sol;

}
int main()
{
    int n;
    printf("Enter n:");
    scanf("%d",&n);
    int ans=sum(n);
    printf("%d",ans);
    return 0;
}