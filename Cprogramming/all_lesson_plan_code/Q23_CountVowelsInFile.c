#include <stdio.h>
#include <ctype.h>

int countVowels(FILE *file) {
    char ch;
    int vowelCount = 0;

    while ((ch = fgetc(file)) != EOF) {
        ch = tolower(ch);  // Convert to lowercase for simplicity
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            vowelCount++;
        }
    }

    return vowelCount;
}

int main() {
    FILE *file = fopen("input.txt", "r");

    if (file == NULL) {
        printf("Could not open file.\n");
        return 1;
    }

    int vowels = countVowels(file);
    printf("Number of vowels in the file: %d\n", vowels);

    fclose(file);
    return 0;
}
