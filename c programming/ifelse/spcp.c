#include<stdio.h>
int main()
{
    int sp;
    printf("Enter sp:");
    scanf("%d",&sp);
    int cp;
    printf("Enter cp:");
    scanf("%d",&cp);
    if (sp>cp){
       printf("profit\n"); 
       int amount_of_profit =sp-cp;
       printf("amount of profit %d",amount_of_profit); 
    }
    else if(cp>sp)
    printf("loss");
    else
    printf("no profit no loss");
    return 0;

}