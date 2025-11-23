#include <stdio.h>
#include <stdlib.h>
int main(){
    double n,*ptr;
    while(n<100){
        ptr=(double*)malloc(40000000.4*sizeof(n));
        printf("press 1 to continue");
        scanf("%d",&n);
        return 0;
    }
    printf("program Ends");
}
