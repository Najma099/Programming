#include<stdio.h>
int main()
{
    int arr[4][4]={{2,3,4,5},{5,6,7,8},{9,9,9,9},{7,6,5,4}};
    int max=0;
    int index=0;
    for(int i=0;i<4;i++)
    {
        int sum=0;
        for(int j=0;j<4;j++)
        {
            sum=sum+arr[i][j];
        }
        if(max<sum)
        {
           max=sum;  
           index=i;
        }
    }
    printf("%d",index+1);

}