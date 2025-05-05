/*


   1
  121
 12321
1234321


*/


#include <stdio.h>
int main(){
    printf("Enter number of lines ");
    int n;
    scanf("%d",&n);
    for(int i=1;i<=n;i++){//number of lines
    int cnt=1;
    int ct=i-1;
        for(int j=1;j<=n-i;j++){ //in each line how many spaces
            printf(" ");
        }
        for(int k=1;k<=i;k++){//in each line how many stars
            printf("%d",cnt);
            cnt++;
        }
        if(i>=2){
        for(int l=1;l<=i-1;l++){
            printf("%d",ct);
            ct--;
        }
        }
        printf("\n");
    }
    return 0;

}