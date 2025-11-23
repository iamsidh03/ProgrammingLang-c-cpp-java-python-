// Online C compiler to run C program online
#include <stdio.h>
#include <stdlib.h>


int main() {
    // Write C code here
    int n,*ptr;
    printf("enter amount of memeory to allocate");
    scanf("%d",&n);
    ptr=(int*)malloc(n*sizeof(n));
    printf("Enter value\n");
    for(int i=0;i<n;i++){
        scanf("%d",(ptr+i));
        
    }
    printf("printing the values\n");
    for(int i=0;i<n;i++){
        printf("%d\n",*(ptr+i));
        
    }
    
    
    printf("Try programiz.pro");

    return 0;
}