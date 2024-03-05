#include<stdio.h>
void reverse(int arr[]);
int main()
{
    int arr[5]={5,6,3,8,9};
    reverse(arr);
    for(int j=0;j<5;j++)
    {
        printf("%d ",arr[j]);
    }

}
void reverse(int arr[])
{
    int i=0;
    int j=4;
    while(i<j){
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp; 
       i++;
       j--;
    }
    
}