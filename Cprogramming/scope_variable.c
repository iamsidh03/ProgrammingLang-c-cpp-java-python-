#include<stdio.h>
int fun();
int a=50;
int main(){
    //int a=10;
   printf("%d\n",a);
    //fun();
    {
        int a=20;
        printf("%d\n",a);
    }
    {
        printf("%d\n",++a);
    }
    printf("%d\n",a);
return 0;

}