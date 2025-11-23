
/*
******
*    *
*    *
******
*/
#include <stdio.h>
int main(){
    printf("Enter number of rows");
    int n;
    scanf("%d",&n);
    printf("Enter number of rows");
    int c;
    scanf("%d",&c);
    for(int i=1;i<=n;i++){
        
        for(int j=1;j<=n+2;j++){
           if(i==1||i==n||j==1||j==c){
            printf("*");
           }
           else{
            printf(" ");
           }
    }
    printf("\n");
}
return 0;
}

