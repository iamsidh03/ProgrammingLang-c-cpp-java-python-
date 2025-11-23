//Create a program that determines if a number is odd or even.
#include<stdio.h>
int main(){
    int a;
    scanf("%d",&a);
    if(a%2==0){
        printf("%d Number is even",a);
    }
    else{
        printf("%d Number is odd",a);
    }

}