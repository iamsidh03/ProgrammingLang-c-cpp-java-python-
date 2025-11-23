/*
1
3 5
7 9 11
13 15 17 19


*/

#include <stdio.h>
int main(){
    printf("Enter number of rows");
    int n;
    scanf("%d",&n);
    int k=1;
    for(int i=1;i<=n;i++){
       
        for(int j=1;j<=i;j++){
            printf("%d ",k);
            k+=2;
    }
    printf("\n");
}
return 0;
}