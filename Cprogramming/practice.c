#include<stdio.h>
 int func(int num) {
 int count = 0; 
while (num) { 
count++; 
num>>= 1; 
} 
return (count); 
}
 
int main(){
  
  int a = 6;  
int b = 0;  
while(a < 10) { 
a = a / 12 + 1; 
a += b; 
} 
 printf("%d", a);   }
  //printf("%d",func(65));
    //i++*++i;
    //i=++i+1;

    //printf("%d",i);

//    switch(4){ 
// case 1: printf("%d",4); break ; 
// case 1+1: printf("%d",2); break ;
//  default: printf("None"); 
// }
// int a=2; 
// switch(4){ 

// case 2: printf("%d",4); break ; 
 
// case a: printf("%d",2); break ; //expression must be a constant value
//  default: printf("None"); 

// }

// char ch ; int count=0;
// for(ch=1;ch;ch++) {
// //printf("%c\n",ch); 
// count++;

// }
// printf("%d",count);
// return 0;

