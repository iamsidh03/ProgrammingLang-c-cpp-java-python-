//Create a program to find the Least Common Multiple (LCM) of two numbers.
#include<stdio.h>
int main(){
int a,b,l;
printf("Enter  two Numbers\n");
scanf("%d%d",&a,&b);
for(l=a>b?a:b;l<=a*b;l=l+(a>b?a:b)){
    if(l%a==0 && l%b==0){
        break;
}
}
printf("Numbers are %d",l);
}
