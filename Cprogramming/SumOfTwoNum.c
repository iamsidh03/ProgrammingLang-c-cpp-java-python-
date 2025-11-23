#include <Stdio.h>
int sum(){
    int a,b;
    printf("Enter two numbers: ");
    scanf("%d %d",&a,&b);
    printf("Sum of two numbers : %d %d  is %d ", a,b, a+b );
    return 0;
}
int main(){
    sum();
    return 0;
}
