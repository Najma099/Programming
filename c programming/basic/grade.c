#include<stdio.h>
int main()
{
    int marks;
    printf("enter marks: ");
    scanf("%d",&marks);
    if(marks<30 && marks>0)
    {
        printf("the grade is c");
    }
    else if (marks>30 && marks<70)
    {
        printf("the grade is B");
    }
    else if(marks>70 && marks<90)
    {
        printf("the grade is A");
    }
    else if (marks >90 && marks <100)
    {
        printf("the grade is A+");
    }
    else("marks is invalid");
    return 0;
}