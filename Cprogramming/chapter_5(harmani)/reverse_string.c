#include<stdio.h>
#include<string.h>
void rever_string( char *str){
    char *start=str; //pointes to first string (CHAR POINTER)
    char *end= str+strlen(str)-1;  //point to last string
    char temp;
    while(start<end){ //swap till star and end points to same string
        temp=*start;
        *start=*end;
        *end=temp;
        start++;
        end--;
    }

}
int main(){
        char str[]="Helloo";
        rever_string(str);
        printf("reverse %s\n",str);
        return 0;
}