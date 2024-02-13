#include<stdio.h>
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

