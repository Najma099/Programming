#include<stdio.h>
int main()
{
    int arr[4]={2,3,4,5};
    int brr[4];
    int i=0;
    int j=3;
    while(i<4 && j>=0)
    {
        brr[i]=arr[j];
        i++;
        j--;
    }
    for(int k=0;k<4;k++)
    {
        printf("%d ",brr[k]);
    }

}