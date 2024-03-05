#include<stdio.h>
int main()
{
    int arr[8]={45,65,77,23,43,34,67,89};
    for(int i=0;i<8;i++)
    {
        if(arr[i]<35)
        printf("%d\n",arr[i]);
    }
}