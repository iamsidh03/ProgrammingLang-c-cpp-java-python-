#include<stdio.h>
int a=100;
int main(){
    extern int a;
    printf("%d\n",a);
    {
        //int a=1200;
        printf("%d",a);
    }
return 0;

}