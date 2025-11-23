#include <stdio.h>

void convertVowelsToUppercase(char str[]) {
    for (int i = 0; str[i] != '\0'; i++) {
        if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || 
            str[i] == 'o' || str[i] == 'u') {
            str[i] -= 32; // Convert lowercase vowels to uppercase
        }
    }
}

int main() {
    char sentence[100];

    printf("Enter a sentence: ");
    fgets(sentence, sizeof(sentence), stdin);

    convertVowelsToUppercase(sentence);

    printf("Modified sentence: %s", sentence);
    return 0;
}
