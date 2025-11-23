/*
* * * *
* * *
* *
*
*/

#include <stdio.h>
int main(){
    printf("Enter number of rows");
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){// Number of lines---(rows)
        for(int j=n;j>i;j--){ //Number of stars in each line
            printf("* ");
    }
    printf("\n");
}
return 0;
}