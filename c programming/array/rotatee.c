#include<stdio.h>

void swap(int arr[]);
int main()
{
    int arr[7]={1,2,3,4,5,6,7};
    int k=2;
    swap(arr);
    for(int i=0;i<7;i++)
    {
        printf("%d ",arr[i]);
    }
}
void swap(int arr[])
{
    int i=2;
    int j=5;
    while(i<j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;

    }
}