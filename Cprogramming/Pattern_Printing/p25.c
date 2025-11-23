
/*

    1
   123
  12345
 1234567
123456789
*/
#include <stdio.h>
int main(){
    printf("Enter number of lines ");
    int n;
    scanf("%d",&n);
    for(int i=1;i<=n;i++){//number of lines
        int cnt=1;
        for(int j=1;j<=n-i;j++){ //in each line how many spaces
            printf(" ");
        }
        for(int k=1;k<=2*i-1;k++){//in each line how many stars
            printf("%d",cnt);
            cnt++;
        }
        printf("\n");
    }
    return 0;

}