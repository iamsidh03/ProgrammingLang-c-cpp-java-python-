//Given an integer value, convert it to a floating-point value and print both.
#include<stdio.h>
int main(){
    int a;
    printf("Enter your number \n");
    scanf("%d",&a);
    
    float b=a;
    printf("Integer value of your number is %d ",&a);
    printf("Floating point value of your number is %f",&b);

}