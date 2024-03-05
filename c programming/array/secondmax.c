#include<stdio.h>
int main()
{
int arr[7]={1,2,3,4,5,6,8};
   int max=arr[0];
   int smax=0;
   for(int i=0;i<7;i++)
   {
    if(arr[i]>max)
    {
      smax=max;
    max=arr[i];   
    }
    else if(arr[i]>smax && max!=arr[i])
    {
        smax=arr[i];
    }
    

   }
   printf("%d",smax); 
}