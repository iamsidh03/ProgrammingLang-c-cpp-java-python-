/*

    *
   ***
  *****
 *******
*********


*/

// #include <stdio.h>
// int main(){
//     printf("Enter number of lines ");
//     int n;
//     scanf("%d",&n);
//     for(int i=1;i<=n;i++){//number of lines
//         for(int j=1;j<=n-i;j++){ //in each line how many spaces
//             printf(" ");
//         }
//         for(int k=1;k<=2*i-1;k++){//in each line how many stars
//             printf("*");
//         }
//         printf("\n");
//     }
//     return 0;

// }

#include <stdio.h>
int main(){
    printf("Enter number of lines ");
    int n;
    scanf("%d",&n);
    int nst=1;
    int nsp=n-1;
    for(int i=1;i<=n;i++){//number of lines
        for(int j=1;j<=nsp;j++){ //in each line how many spaces
            printf(" ");
        }
        nsp-=1;
        for(int k=1;k<=nst;k++){//in each line how many stars
            printf("*");
        }
        nst+=2;
        printf("\n");
    }
    return 0;

}