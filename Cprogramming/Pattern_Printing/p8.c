/*
1
13
135
1357
*/

// #include <stdio.h>
// int main(){
//     int a;
//     printf("Enter the row");
//     scanf("%d", &a);
//     for(int i=1;i<=a;i++){
//         int k=1;
//         for(int j=1;j<=i;j++){
//             if(k%2!=0){
//                 printf("%d ",k);
//                 k+=2;
                
//             }
//             }
//             printf("\n");

//     }
// }
//Method 2
#include <stdio.h>
int main(){
    int a;
    printf("Enter the row");
    scanf("%d", &a);
    for(int i=1;i<=a;i++){
        int k=1;
        for(int j=1;j<=i;j++){
            printf("%d",k);
            k+=2;
                
            }
            
            printf("\n");

    }
}