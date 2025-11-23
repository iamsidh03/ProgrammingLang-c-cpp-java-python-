#include <stdio.h>
#include <ctype.h>

void encryptFile(FILE *file, int shift) {
    char ch;

    while ((ch = fgetc(file)) != EOF) {
        if (isalpha(ch)) {
            if (islower(ch)) {
                ch = ((ch - 'a' + shift) % 26) + 'a';
            } else if (isupper(ch)) {
                ch = ((ch - 'A' + shift) % 26) + 'A';
            }
        }
        putchar(ch);  // Print the encrypted character
    }
}

int main() {
    FILE *file = fopen("input.txt", "r");

    if (file == NULL) {
        printf("Could not open file.\n");
        return 1;
    }

    int shift = 3;  // Shift value for Caesar Cipher (simple encryption)

    printf("Encrypted content:\n");
    encryptFile(file, shift);

    fclose(file);
    return 0;
}
/*Encrypting a File (Caesar Cipher):

The program reads the file character by character.
For alphabetic characters, it shifts the letter by a fixed number (shift) using the Caesar Cipher method.
It prints the encrypted content, preserving non-alphabet characters as they are.*/