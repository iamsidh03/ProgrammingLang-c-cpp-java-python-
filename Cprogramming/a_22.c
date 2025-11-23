
// #include <stdio.h>

// int main() {
//     int num1 = 0, num2 = 0, num3 = 0;
//     printf("Enter a number:");
//     scanf("%2d%3d%4d", &num1, &num2, &num3);
//     printf("%d %d %d", num1, num2, num3);
//     return 0;
// }

// #include <stdio.h>

// int main() {
//     int num1 = 0, num2 = 0, num3 = 0;
//     printf("Enter the number as <345678>:");
//     scanf("%1d%2d%3d", &num1, &num2, &num3);
//     num1 = num1 + num2 + num3;
//     printf("%d\n", num1);
//     return 0;
// }

// #include <stdio.h>

// int main() {
//     int i = 10, m = 10;
//     printf("%d", printf("%d %d ", i, m));
//     return 0;
// }

#include <stdio.h>

int main() {
    char text[100];

    // Read the input string
    printf("Enter the string: ");
    scanf("%99[^\n]", text); // Reads up to 99 characters including spaces until a newline is encountered.

    // Output using various formatting options
    printf("%s\n", text);          // Prints the entire string.
    printf("%18s\n", text);        // Prints the string right-justified in a field of width 18.
    printf("%.18s\n", text);       // Prints the first 18 characters of the string.
    printf("%18.7s\n", text);      // Prints the first 7 characters of the string, right-justified in a field of width 18.
   // printf("%-18.7s\n", text);     // Prints the first 7 characters of the string, left-justified in a field of width 18.

    return 0;
}



