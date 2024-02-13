#include<stdio.h>
int main()
{
    int a=25;
    int* x=&a;
    int** y=&x;
    printf("%p\n",&a);
    printf("%p\n",x);
    printf("%p\n",&x);
    printf("%p\n",y);
    printf("%d\n",*x);
    printf("%d",**y);
    return 0;
}