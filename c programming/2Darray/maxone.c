#include<stdio.h>
int main()
{
    int arr[3][4]={{1,0,1,1},{0,1,0,1},{1,0,0,1}};
    int count=0;
    int max_count=0;
    int x=0;
    for(int i=0;i<3;i++)
    {
        count=0;
        for(int j=0;j<4;j++)
        {
            if(arr[i][j]==1)
            count++;
        }
        if(count>max_count)
        {
            max_count=count;
            x=i;
        }
    }
    printf("%d",x);
}