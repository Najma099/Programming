#include<stdio.h>
int main()
{
    int n;
    printf("Enter n:");
    scanf("%d",&n);
    if (n>99 && n<1000)
    {
       printf("the number is 3 digits number");  
    }
    else
    {
       printf("THe number is not 3 digits number"); 
    }
    return 0;
}