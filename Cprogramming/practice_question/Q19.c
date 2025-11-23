//Create a program to find the Greatest Common Divisor (GCD) of two integers.
#include<stdio.h>
int main(){
    int a,b,gcd;
    printf("Enter two integers: \n");
    scanf("%d %d",&a,&b);
    for(gcd=a<b?a:b;gcd>=1;gcd--){
        if(a%gcd==0&&a%gcd==0){
            break;
        }

}
printf("Hcf is %d ",gcd);
}