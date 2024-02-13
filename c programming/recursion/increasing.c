#include<stdio.h>//ulta recursion
void greeting(int n)
{
    if(n==0)
    return;
    else
   // printf("%d\n",n);
    greeting(n-1);
    printf("%d\n",n);
    return;
}
int main()
{
   int n;
   printf("Enter n:");
   scanf("%d",&n);
   greeting(n);
   return 0; 
}