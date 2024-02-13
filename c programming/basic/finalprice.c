#include<stdio.h>
void calculateprice(float value);
int main()
{
    float value=100.0;
    calculateprice(value);
    printf("%d",value);
    return 0;
}
void calculatedprice(float value) {
    value=value +(0.18*value);
printf("%d",value);
}
