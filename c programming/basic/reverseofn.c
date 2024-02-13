#include<stdio.h>
int main()
{
    int n;
    printf("enter n:");
    scanf("%d",&n);
    int rev=0,ld;
    // for(int i=1;i<=n;i++)
    // {

    //     lastdigits=lastdigits+n%10;
    //     lastdigits=lastdigits*10;
    //     n=n/10;
    // }
    // printf("%d",lastdigits);
    
    while(n>0)
    {
        ld=n%10;
        rev=(rev*10)+ld;
        n=n/10;
    }
    printf("Reverse of a no: %d",rev);
    return 0;
}