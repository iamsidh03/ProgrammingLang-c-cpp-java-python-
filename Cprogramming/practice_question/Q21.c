//Create a program to check whether a given number is prime using while.
#include<stdio.h>
#include <stdbool.h>
#include <math.h>
bool forPrime(int n){
     int i;
    for(i=2;i<=sqrt(n);i++){
        if(n%i==0){
        return false;
        }
    }
    return true;
}
int main(){
    printf("Enter number");
    int num;
    scanf("%d",&num);
   if(forPrime(num)){
    printf("Prime");
   }
   else{
    printf("Not Prime");
   }
   return 0;
}


