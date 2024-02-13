#include<stdio.h>
int pow(int a,int b)
{
    if(b==0)
    return 1;
    return a*pow(a,b-1);
    
}
int main()
{
    int a;
    printf("Enter base:");
    scanf("%d",&a);
    int b;
    printf("Enter power:");
    scanf("%d",&b);
   int ans= pow(a,b);
   printf("%d",ans);
    return 0;
    
}