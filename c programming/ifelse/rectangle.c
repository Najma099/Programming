#include<stdio.h>
int main()
{
    int l,b,area,perimeter;
    printf("The value of l:");
    scanf("%d",&l);
    printf("Enter the value of b:");
    scanf("%d",&b);
    area=l*b;
    printf("area :%d\n",area);
    perimeter=2*(l+b);
    printf("perimeter:%d\n",perimeter);
    if(area>perimeter)
    printf("area is greater");
    else if(perimeter>area)
    printf("perimeter is greater ");
    else 
    printf("both are same");
    return 0;

}