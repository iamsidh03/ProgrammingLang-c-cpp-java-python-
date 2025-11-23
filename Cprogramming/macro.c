#include<stdio.h>
#define MUL(a,b) a*b 
#define MAX(a,b) if(a>b)\
 printf("%d, is max",a);\
 else printf("%d is max",b);    // you can change line using " \ "
int main(){
MAX(3,4);

    // printf("%d\n",MUL(2,4));
    // printf("%d\n",MUL(5-2,6-1));
    // printf("%d\n",MUL((-3+7),(7-3)));

    return 0;
}