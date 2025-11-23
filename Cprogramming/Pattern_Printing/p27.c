#include <stdio.h>
int main(){
    int n;
    printf("Enter Number of Lines");
    scanf("%d",&n);

    for(int i=1;i<=n;i++){
        char ch='A';
        //int it=i;
        int ch2=63+i;
        for(int j=1;j<=n-i;j++){
            printf(" ");
        }
        for(int j=1;j<=i;j++){
            printf("%c",ch);
            ch++;
        }
        if(i>=2){
        for(int l=1;l<=i-1;l++){
            printf("%c",ch2);
            ch2--;
        }
        }
        printf("\n");
    }
}