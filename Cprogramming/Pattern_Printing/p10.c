/*
ABCD
ABCD
ABCD
ABCD
    */

#include <stdio.h>
int main(){
    int r,c;

    printf("Enter number of rows");
    scanf("%d",&r);
    
    for(int i=0;i<r;i++){//----------Numbers of lines

            char ch='A';
        for(int j=0;j<r;j++){//----------In each line how many stars present
            printf("%c",ch);
            ch++;//----------Increment the character

        }
        printf("\n");
    }

    return 0;
}


/*
 this will also works
 for(int i=0;i<r;i++){
 int a=1;
 for(int j=0;j<r;j++){
 int d=a+64;
 char ch=(char)d;
 printf("%c",ch);
 a++;
    */