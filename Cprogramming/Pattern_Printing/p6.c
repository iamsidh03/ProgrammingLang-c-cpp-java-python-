/*
1
12
123
1234


*/

#include <stdio.h>
int main(){
    printf("Enter number of rows");
    int n;
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
       // int k=1;
        for(int j=1;j<=i;j++){
            printf("%d",j);
          //  k++;
    }
    printf("\n");
}
return 0;
}