#include<stdio.h>
#include<string.h>

int main()
{
    char ch[]="hellowww";
    int i=0;
    int length=strlen(ch);
    while(i<length)
    {
        printf("%c ",ch[i]);
        i++;
    }
}