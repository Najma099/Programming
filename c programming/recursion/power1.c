#include<stdio.h>
int power(int a,int b,int c)
{
    if(b==0)
    return 1;
    int result=power(a,b-1,c);
    return(a*result)%c;
    
}
int main()
{
    int a;
    printf("Enter base:");
    scanf("%d",&a);
    int b;
    printf("Enter power:");
    scanf("%d",&b);
    int c;
    printf("Enter c:");
    scanf("%d",&c);
   int ans= power(a,b,c);
   printf("%d",ans);
    return 0;
    
}