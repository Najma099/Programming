 
#include<stdio.h>// output 1,2,3,...n
void decreasing(int x,int n)
{
  if(x>n)
    return ;
  else
  printf("%d ",x);
  decreasing(x+1,n);
  return;
}
int main()
{
    int n;
    printf("Enter n:");
    scanf("%d",&n);
    decreasing(1,n);
    return 0;
}
// #include<stdio.h>// output 7,6,5,4,3,2,1
// void inctodec(int n)
// {
//     if(n==0)
//     return;
//     printf("%d ",n);
//     inctodec(n-1);
//     return ;

// }
// int main()
// {
//     int n;
//     printf("Enter n:");
//     scanf("%d",&n);
//     inctodec(n);
//     return 0;
// }