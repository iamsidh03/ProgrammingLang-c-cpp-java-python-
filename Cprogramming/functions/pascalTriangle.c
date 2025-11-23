#include <stdio.h>
int fac(int x){
    int n=1;
    for(int i=2;i<=x;i++){
        n=n*i;
        
    }
    return n;
}
int comb(int x,int r){
  return  fac(x)/(fac(r)*fac(x-r));
}
int main(){
    int n=4;
    
        
    
    
    
    for(int i=0;i<=n;i++){
        for(int j=0;j<=n-i;j++){
            printf(" ");
        }
        for(int j=0;j<=i;j++){
            int icj=comb(i,j);
            printf("%d ",icj);
        }
        printf("\n");
    }

}