/*
1
3 5
7 9 11
13 15 17 19


*/

#include <stdio.h>
int main(){
   method2();
 method1();
return 0;
}
int method1(){
     printf("Enter number of rows");
    int n;
    scanf("%d",&n);
    int k;
    for(int i=1;i<=n;i++){
       if(i%2!=0) k=1;
       else k=0;
        for(int j=1;j<=i;j++){
            printf("%d ",k);
            if(k==0) k=1;
            else k=0;
            
    }
    printf("\n");
}
}


/*
        if (row+columns)%2==2 then 1
        else 0
        */
int method2(){
     printf("Enter number of rows");
    int n;
    scanf("%d",&n);
    
    for(int i=1;i<=n;i++){
       
        for(int j=1;j<=i;j++){
            
            if((i+j)%2==0) printf("1 ");
            else printf("0 ");
            
    }
    printf("\n");
}
return 0;
}