#include<stdio.h>
void reverse(int arr[],int a,int b)
{
    int i=a;
    int j=b;
    while(i<j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }
}
int main()
{
    int arr[7]={1,2,3,4,5,6,7};
    int a=0;
    int b=6;
    int k=3;
    reverse(arr,a,b);
    for(int i=0;i<7;i++)
    {
        printf("%d ",arr[i]);
    }
    printf("\n");
    a=0;
    b=2;
    reverse( arr,a, b);
    for(int i=0;i<7;i++)
    {
        printf("%d ",arr[i]);
    }
    printf("\n");
    a=3;
    b=6;
    reverse( arr, a, b);
     for(int i=0;i<7;i++)
    {
        printf("%d ",arr[i]);
    }

}