#include<string.h>
#include<stdio.h>

int main()
{
    char arr[]="i am learning coding\0";
    int i=0;
    while(arr[i]!='\0')
    {
        printf("%c ",arr[i]);
        i++;
    }
}