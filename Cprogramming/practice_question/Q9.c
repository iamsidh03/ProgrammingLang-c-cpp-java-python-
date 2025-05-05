//Create a program that takes two numbers and shows result of all arithmetic operators (+,-,*,/,%).
#include <stdio.h>
int main(){
printf("Enter two numbers ");
int a,b;
scanf("%d %d",&a,&b);
printf("Addition of %d and %d is %d\n",a,b,a+b);
printf("Subtraction of %d and %d is %d\n",a,b,a-b);
printf("Multiplication of %d and %d is %d\n",a,b,a*b);
printf("Division of %d and %d is %d\n",a,b,a/b);
printf("Modulus of two Numbers is %d",a%b);
}
