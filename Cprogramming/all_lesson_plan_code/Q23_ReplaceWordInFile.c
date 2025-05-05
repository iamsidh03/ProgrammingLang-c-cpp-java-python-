#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void replaceWord(FILE *file, const char *oldWord, const char *newWord) {
    char ch;
    char wordBuffer[100];
    int index = 0;

    while ((ch = fgetc(file)) != EOF) {
        if (isspace(ch) || ch == EOF) {
            wordBuffer[index] = '\0';
            if (strcmp(wordBuffer, oldWord) == 0) {
                printf("%s ", newWord);
            } else {
                printf("%s ", wordBuffer);
            }
            index = 0;
        } else {
            wordBuffer[index++] = ch;
        }
    }
}

int main() {
    FILE *file = fopen("input.txt", "r");

    if (file == NULL) {
        printf("Could not open file.\n");
        return 1;
    }

    const char *oldWord = "old";  // Word to replace
    const char *newWord = "new";  // Replacement word

    printf("Modified content:\n");
    replaceWord(file, oldWord, newWord);

    fclose(file);
    return 0;
}
