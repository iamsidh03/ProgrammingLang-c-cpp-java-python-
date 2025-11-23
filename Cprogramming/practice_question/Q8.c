/*Create a program to swap two numbers. */
#include<stdio.h>
int main(){
   /*
    int a,b,c;
    printf("Enter the value of a and b\n");
    scanf("%d%d",&a,&b);
    c=a;
    a=b;
    b=c;
    printf("After swapping a=%d and b=%d\n",a,b);
    */
    anotherApproach();

}
int anotherApproach(){
    int a,b;
    printf("Enter the value of a and b\n");
    scanf("%d%d",&a,&b);
    a=a^b;
    b=a^b;
    a=a^b;
    printf("swap two numbers %d %d",a,b);
    return 0;

}