#include <stdio.h>

int main() {
    int arr[5];
    printf("Enter 5 integer elements:\n");
    for (int i = 0; i < 5; i++) {
        scanf("%d", &arr[i]);
    }
    printf("\nThe entered elements are:\n");
    for (int i = 0; i < 5; i++) {
        printf("%d ", arr[i]);
    }

    return 0;
}
