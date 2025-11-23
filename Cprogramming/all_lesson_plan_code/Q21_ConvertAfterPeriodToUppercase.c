#include <stdio.h>
#include <ctype.h>

void convertAfterPeriodToUppercase(FILE *file) {
    char ch;
    int periodEncountered = 0;

    // Read each character from the file
    while ((ch = fgetc(file)) != EOF) {
        if (periodEncountered) {
            // Convert to uppercase if after a period
            ch = toupper(ch);
        }

        // Check if the character is a period
        if (ch == '.') {
            periodEncountered = 1;  // Start converting to uppercase after period
        }

        // Print the character
        putchar(ch);
    }
}

int main() {
    FILE *file = fopen("input.txt", "r");

    if (file == NULL) {
        printf("Could not open file.\n");
        return 1;
    }

    // Call the function to convert characters after period to uppercase
    convertAfterPeriodToUppercase(file);

    fclose(file);
    return 0;
}
/*The program reads a text file, processes it character by character, 
and converts all characters after the first period (.) in the file to uppercase.*/
/*After encountering the first period (.), it converts all subsequent characters to uppercase.
It prints the modified content of the file to the screen.
Finally, the file is closed after processing.*/