//.Create a program that determines if a number is positive, negative, or zero.
#include<stdio.h>
int main(){
int a;
printf("Enter a number");
scanf("%d ",&a);
if(a>0){
    printf("%d is positive",a);
}
else if(a<0){
    printf("%d is negative",a);
}
else{
    printf("Number is zero");
}
}
