
/*
*   *
 * *
  *
 * *
*   *
*/
#include <stdio.h>
int main(){
    printf("Enter number of rows");
    int n;
    scanf("%d",&n);
    
    for(int i=1;i<=n;i++){
        
        for(int j=1;j<=n+2;j++){
           if(i==j||i+j==n+1){
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

