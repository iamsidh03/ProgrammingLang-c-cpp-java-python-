/*Create a program to define a constant for the mathematical value pi (3.14159)
 and use it to calculate and print the circumference of a circle with a radius input from user.*/
 #include <stdio.h>
 int main(){
    const float PI=3.14159;
    float rad;
    printf("Enter the radius of circle ");
    scanf("%f",&rad);
    float circum=2*PI*rad;
    printf("Circumference of circle is %f ",circum);
 }