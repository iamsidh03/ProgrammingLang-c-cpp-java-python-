//Create a program to sum all odd numbers from 1 to a specified number N
#include<stdio.h>
int main(){
    int n, sum = 0,i=1;
    printf("enter Number");
    scanf("%d",&n);
    while(i<=n){
        if(i%2!=0){
            sum+=i;
            
    }
    i++;

}
printf(" sum is: %d",sum);
}