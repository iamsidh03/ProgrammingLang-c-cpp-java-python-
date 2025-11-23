//Create a program to reverse the digits of a number.
#include<stdio.h>
int main(){
    int num=321,rem,rev=0;
    //printf("Enter Number to reverse");
    //scanf("%d",num);
    while(num>0){
        rem=num%10;
        rev=(rev*10)+rem;
        num/=10;

    }
    printf("reverse of %d is %d",num,rev);
}