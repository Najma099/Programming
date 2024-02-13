#include<stdio.h>
#include <string.h>


int main() {
    int len1, len2, i;
    char a[50] = "najma";
    char b[20] = "khatun";

    len1 = strlen(a);
    len2 = strlen(b);
    for (i = 0; i < len2; i++) {
        a[len1 + i] = b[i];
    }
    a[len1 + len2] = '\0';

    puts(a);
    return 0;
}