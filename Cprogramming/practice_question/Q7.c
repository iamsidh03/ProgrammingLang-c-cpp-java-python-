/*Create a program to print the area of a circle by inputting its radius.*/
#include<stdio.h>
int main(){
const float PI=3.14159;
    float radius,area;
    printf("Enter the radius of the circle: ");
    scanf("%f",&radius);
    area=PI*radius*radius;
    printf("The area of circle is %f" ,area);
}
