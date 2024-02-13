#include<stdio.h>
int main()
{
    int x=30;
    int *ptr=&x;
    printf("%p\n",&x);
    printf("u",ptr);
    return 0;
}