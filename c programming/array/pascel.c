#include<stdio.h>
int fac(int x)
    {
        int f=1;
        for(int i=1;i<=x;i++)
        {
            f=f*i;
        }
        return f;

    }
int ncr(int n,int r)
{
    int result;
    result=fac(n)/(fac(r)*fac(n-r));
    return result;
}
int main()
{
   int n;
   printf("Enter n:");
   scanf("%d",&n);
   int a=0;
   for(int i=0;i<=n;i++)
   {
    for(int k=n;k>=i;k--)// spaces
    {
        printf(" ");
    }
    for(int j=0;j<=i;j++)
    {
       int ans=ncr(i,j);
       printf("%d ",ans);
    }
    printf("\n");
   }
   return 0;
}