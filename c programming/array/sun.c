//given an array containing element from 1 to N except one element in this range is missing .find the missing element
//lets assume the number 1 to 10 and missing number is 6
#include<stdio.h>
int main()
{
    int arr[9]={1,2,3,4,5,7,8,9,10};
    int sum=0;
    for(int i=0;i<9;i++)
    {
        sum=sum+arr[i];
    }
    int sum2=(10*(10+1))/2;
    printf("The missing element is %d",sum2-sum);

    
}