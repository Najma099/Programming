// #include<stdio.h>
// int factor(int n)
// {
//     if(n==1)
//     return 1;
//     else
//     return n*factor(n-1);
// }
// int main()
// {
//     int n;
//     printf("Enter n:");
//     scanf("%d",&n);
//     int fac=factor(n);
//     printf("%d",fac);
//     return 0;
// }
#include<stdio.h>
int factorial(int n)
{
    
    if(n==1)
    return 1;
    else
    return n*factorial(n-1);
    
}
int main()
{
    int n;
    printf("enter n:");
    scanf("%d",&n);
    int fac=factorial(n);
    printf("%d",fac);
    return 0;
}