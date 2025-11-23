/*Create a program that declares one variable of each of the fundamental
 data types (int, float, double, char) and prints their size using sizeof() operator.*/
 #include <stdio.h>
 int main(){
    int a=100000;
    float b=10.5;
    double c=100.3;
    char d='z';
    printf("Size of int is %d\n",sizeof(a));
    printf("Size of float id %d\n",sizeof(b));
    printf("Size of double is %d\n",sizeof(c));
    printf("Size of char is %d\n",sizeof(d));

 }