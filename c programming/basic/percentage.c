#include<stdio.h>
int main()
{
   int  m1=35;
   int  m2=30;
   int  m3=29;
   int  m4=31;
   int c=(m1+m2+m3+m4);
   float b=(c/160.0);
   b=b*100;
   printf("%f",b);
   return 0;
}