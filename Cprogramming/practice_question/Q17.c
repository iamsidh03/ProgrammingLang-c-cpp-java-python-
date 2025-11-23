//Write a function that calculates the factorial of a given number.
#include<stdio.h>
int main(){
    int n,fact=1;
    printf("Enter the number: ");
    scanf("%d",&n);
    for(int i=n;i>=1;i--){
        fact=fact*i;
    }
    printf("Factorial of %d is %d",n,fact);
}