//Create a program to verify if a number is a palindrome.
#include<stdio.h>
int main(){
    int num=98,rev=0;;
    //printf("Enter a number");
    //scanf("%d",num);
    while(num!=0){
        int rem=num%10;
        rev=(rev*10)+rem;
        num/=10;

    }
    printf("%d",rev);
}