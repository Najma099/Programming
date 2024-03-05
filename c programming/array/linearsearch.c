#include<stdio.h>
int main()
{
    int arr[19]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,16,17,18,19,20};
    for(int i=0;i<=19;i++)
    {
       if(arr[i]==i+1)
       continue;
       else
       printf("The missing element is %d",i+1);
       break;
    }
    return 0;
}