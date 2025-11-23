/*
    A
   AB
  ABC
 ABCD
ABCDE
*/

#include <stdio.h>
int main(){
    printf("Enter number of lines ");
    int n;
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        char ch='A';
        for(int j=1;j<=n-i;j++){
            printf(" ");
        }
        for(int k=1;k<=i;k++){
            printf("%c",ch);
            ch++;
        }
        printf("\n");
    }
    return 0;
}