/*Define variables for storing a user's first name, last name, and age
 using appropriate naming conventions and then display them. */
 #include <stdio.h>
 int main(){
    char firstName[20];
    scanf("%19s" ,firstName);
    char lastname[30];
    scanf("%29s" ,lastname);
    int age=20;
    printf("firstname and lastname is %s %s\n and age is %d ",firstName,lastname,age);
 }