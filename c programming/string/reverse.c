#include<stdio.h>
#include<string.h>
int main()
{
    char str[15];
    puts("Enter a string:");
    gets(str);
    int i=0;
    int count=0;
    while(str[i]!='\0')
    {
        count++;
        i++;
    }
    printf("%d\n",count);
    int j=0;
    int k=count-1;
    while(j<k)
    {
        char temp= str[j];
        str[j]=str[k];
        str[k]=temp;
        j++;
        k--;
    }
    puts(str);
    
}