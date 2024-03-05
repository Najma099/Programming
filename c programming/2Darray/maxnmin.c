#include<stdio.h>
int main()
{
    int m;
    printf("Enter m: ");
    scanf("%d",&m);
    int n;
    printf("Enter n: ");
    scanf("%d",&n);
    int max_index[2]={0,0};
    int arr[m][n];
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    int max=arr[0][0];
    int min=arr[0][0];
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(max<arr[i][j])
              {
                max=arr[i][j];
                max_index[0]=i;
                max_index[1]=j;
              }
              
            if(min>arr[i][j])
              min=arr[i][j];
        }
        
    }
    printf("%d\n",max);
    printf(("%d,%d\n"),max_index[0],max_index[1]);
    printf("%d",min);


}