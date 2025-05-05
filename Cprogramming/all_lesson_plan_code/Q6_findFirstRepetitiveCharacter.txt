#include <stdio.h>

char findFirstRepetitiveCharacter(char str[]) {
    for (int i = 0; str[i] != '\0'; i++) {
        for (int j = i + 1; str[j] != '\0'; j++) {
            if (str[i] == str[j]) {
                return str[i]; // Found first repetitive character
            }
        }
    }
    return '\0'; // No repetitive character found
}

int main() {
    char str[100];

    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);

    // Remove newline character if present
    for (int i = 0; str[i] != '\0'; i++) {
        if (str[i] == '\n') {
            str[i] = '\0';
            break;
        }
    }

    char result = findFirstRepetitiveCharacter(str);

    if (result != '\0') {
        printf("The first repetitive character is: %c\n", result);
    } else {
        printf("No repetitive characters found.\n");
    }

    return 0;
}
