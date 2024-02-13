#include<stdio.h>
int main()
{
    int n;
    printf("Enter row:");
    scanf("%d",&n);
    int b,a;
    b=n/2+1;
    a=0;
    int c=0;
    for(int i=1;i<=n;i++)
    {
        if(i<=n/2+1)
        {
          a++;
          b--;
          c++;
        }
        else{
           a--;
            b++;
            c--;
        }
        for(int j=1;j<=b;j++)//spaces
        {
            printf(" ");
        }
        for(int k=c;k>=1;k--)//innerstar
        {
            printf("*");
        }
        for(int m=a;m>1;m--)
        {
            printf("*");
        }
        printf("\n");
    }
    return 0;
}