#include <stdio.h>
#include <math.h>

void binaryToHexadecimal(char binary[]) {
    int length = 0;
    while (binary[length] != '\0') length++;  // Find the length of the binary string

    int decimal = 0;
    for (int i = 0; i < length; i++) {
        if (binary[i] == '1') {
            decimal += pow(2, length - 1 - i);  // Convert binary to decimal
        }
    }

    // Print the decimal value in hexadecimal format
    printf("Hexadecimal: %X\n", decimal);
}

int main() {
    char binary[100];

    printf("Enter a binary number: ");
    scanf("%s", binary);

    binaryToHexadecimal(binary);
    return 0;
}
