#include<stdio.h>

    int fac(int y){
         int result=1;
    for(int i=2;i<=y;i++)
    {
        result=result*i;
    }
    return result;
    }
    int ncr(int n,int r)
    {
        int c=n-r;
      int ncr_result=fac( n)/(fac( r)*fac( c));
      return ncr_result;
    }



int main()
{
    int n;
    printf("Enter n:");
    scanf("%d",&n);
    int r;
    printf("Enter r:");
    scanf("%d",&r);
    int result=ncr( n, r);
    printf("%d",result);
    return 0;

}