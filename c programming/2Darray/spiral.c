#include<stdio.h>
int main()
{
    int arr[5][6]={{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24},{25,26,27,28,29,30}};
    int minr=0;
    int maxc=5;
    int maxr=4;
    int minc=0;
    int count =0;
    int te=(5)*(6);
    while(count<te)
    {
        //minimum row
        for(int i=minc;i<=maxc;i++)
        {
            printf("%d ",arr[minr][i]);
            count++;
        }
        minr++;
        if(count>=te)
        break;
        //maximum column
        for(int j=minr;j<=maxr;j++)
        {
            printf("%d ",arr[j][maxc]);
            count++;
        }
        maxc--;
        if(count>=te)
        break;
        //maximum row(reverse direction)
        for(int k=maxc;k>=minc;k--)
        {
            printf("%d ",arr[maxr][k]);
            count++;
        }
        maxr--;
        if(count>=te)
        break;
        // minimum row(reverse order)
        for(int m=maxr;m>=minr;m--)
        {
            printf("%d ",arr[m][minc]);
            count++;
        }
        minc++;
        if(count>=te)
        break;
    }
}