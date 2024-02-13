#include<stdio.h>
int main()
{
   char alphabet;
printf("enter alphabet:");
scanf("%c",&alphabet);
if (alphabet>='A' && alphabet<='Z')
{
    printf("uppercase alphabet");
}
else if (alphabet>='a' && alphabet<='z') 
{
    printf("lowercase alphabet");
}
else printf("not a alphabet");
return 0;
}
