#include <stdio.h>

void reverseString(char *str) {
    char *start = str;
    char *end = str;
    char temp;

    // Move the 'end' pointer to the last character
    while (*end != '\0') {
        end++;
    }
    end--; // Move it back to the last valid character

    // Swap characters from start and end pointers until they meet
    while (start < end) {
        temp = *start;
        *start = *end;
        *end = temp;
        start++;
        end--;
    }
}

int main() {
    char str[100];

    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);

    reverseString(str);

    printf("Reversed string: %s\n", str);
    return 0;
}
