/*
1234
123
12
1
*/

#include <stdio.h>
int main(){
    int a;
    printf("Enter umber of row");
    scanf("%d",&a);
    
    for(int i=1;i<=a;i++){
        int k=1;
        for(int j=a;j>=i;j--){
            printf("%d",k);
            k++;
    }
    printf("\n");

   
    }
 return 0;
}



