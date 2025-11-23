#include <stdio.h>
#include <math.h>

int isArmstrong(int num) {
    int sum = 0, originalNum, remainder, digits = 0;
    
    originalNum = num;
    
    // Find the number of digits in the number
    while (originalNum != 0) {
        originalNum /= 10;
        digits++;
    }
    
    originalNum = num;
    
    // Calculate the sum of each digit raised to the power of the number of digits
    while (originalNum != 0) {
        remainder = originalNum % 10;
        sum += pow(remainder, digits);
        originalNum /= 10;
    }

    return (sum == num);  // If sum equals original number, it's an Armstrong number
}

int main() {
    int num;

    printf("Enter a number: ");
    scanf("%d", &num);

    if (isArmstrong(num)) {
        printf("%d is an Armstrong number.\n", num);
    } else {
        printf("%d is not an Armstrong number.\n", num);
    }

    return 0;
}
/*
The program calculates the sum of each digit of the number raised to the power of the number of digits in the number. If the sum equals the original number, it is an Armstrong number. */