#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#define MAX 50
int main(){
    char str[MAX];
    int pp[2];
    if(pipi(pp)<0){
        perror("pipe creation is fail");
        exit(1);
    }
    printf("Enter first message to write in pipe");
    fget(str,MAX,stdin);
    write(pp[1],str,MAX);
    printf("Enter second message to write int pipe");
    read(pp[0],str,MAX);
    printf("%s",str);
    read(pp[0],str,MAX);
    printf("%s",str);
    return 0;
}