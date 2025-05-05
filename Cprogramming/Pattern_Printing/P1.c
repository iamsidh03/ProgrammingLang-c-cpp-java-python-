/*
*****
*****
*****
    */

#include <stdio.h>
int main(){
    int r,c;

    printf("Enter number of rows");
    scanf("%d",&r);
    printf("Enter Number of column ");
    scanf("%d",&c);
    for(int i=0;i<r;i++){//----------Numbers of lines
        for(int j=0;j<c;j++){//----------In each line how many stars present
            printf("*");

        }
        printf("\n");
    }

    return 0;
}