//Create a program to check if a number is an Armstrong number.
#include<stdio.h>
#include<math.h>
#include<stdio.h>
#include<math.h>

int main(){
    int n, original, sum = 0, rem, cube;
    printf("Enter a number: ");
    scanf("%d", &n); // note the ampersand (&) before n
    original = n; // store the original value of n

    while(n != 0){
        rem = n % 10;
        cube = pow(rem, 3);
        sum += cube;
        n /= 10; // reduce n by one digit
    }

    if(sum == original){
        printf("%d is an Armstrong number", original);
    } else {
        printf("%d is not an Armstrong number", original);
    }

    return 0;
}