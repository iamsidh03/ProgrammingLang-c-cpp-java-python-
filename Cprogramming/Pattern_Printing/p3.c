
/*
1234
1234
1234
1234
*/
#include <stdio.h>
int main(){
    printf("Enter number of rows");
    int n;
    scanf("%d",&n);
    for(int i=1;i<=n;i++){// Number of Rows
       // int k=1; this is also work
        for(int j=1;j<=n;j++){ //Number of column
            printf("%d",j);
          //  k++;
    }
    printf("\n");
}
return 0;
}