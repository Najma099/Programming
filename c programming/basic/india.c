#include<stdio.h>
void namaste();
void bonjour();
int main(){
    int i,f;
    printf(" enter f for french and i for indian : ");
    char ch;
    scanf("%c", &ch);

    if(ch=='i'){
        namaste();
    }
    else{
        bonjour();
    }
    return 0;
}
void namaste()
{
    printf("namaste\n");
}
void bonjour()
{
    printf("bounjour\n");
}