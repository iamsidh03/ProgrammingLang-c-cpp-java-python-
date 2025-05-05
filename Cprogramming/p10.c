// #include <stdio.h>
// int isprsent(int a[],int size,int tar){
//         for(int i=0;i<size;i++){
//             if(a[i]==tar){
//                 return 1;
//         }

// }
// return 0;
// }
// int dif(int a[],int sa,int b[],int sb,int res[]){
//     int k=0;
//     for(int i=0;i<sb;i++){
//         if(!isprsent(a,sa,b[i])) {
//             res[k++]=b[i];


//     }
// }
// return 0;
// }
// int main(){

// }


#include <stdio.h>

int main() {
    double x = 6.7, y = 1.2, z = 2.3;
    double *p = &x;

    printf("Values through pointer:\n x: %.1f\n y: %.1f\n z: %.1f\n", *p, *(p + 1), *(p + 2));

    return 0;
}