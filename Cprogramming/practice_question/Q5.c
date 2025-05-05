/*Create a program to print the area of a square by inputting its side length*/
#include<stdio.h>
int main(){
    int side;
    printf("Enter the side of square");
    scanf("%d",&side);
    int area=side*side;
    printf("area of square is %d",area);
    return 0;
}