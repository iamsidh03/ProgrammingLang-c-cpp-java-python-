 
 //4
 /*
 #include<stdio.h>
 int f(int n, int k){
 if(n==0) return 0;
 else if(n%2) return f(n/2, 2*k)+k;
 else return f(n/2, 2*k)-k;
 }
 int main(){
 printf( "%d",f(20,1));
 return 0;
 }

 //---O/p=9

*/
 //5
/*
  #include<stdio.h>
 void f(int n){
 if(n<=1){
 printf("%d",n);
 }
 else{
 f(n/2);
 printf("%d",n%2);
 }
 }
 int main()
 {
 f(173);
 return 0;
 }


//o/p---10101101
 */

//7
/*
 #include<stdio.h>
 int r(){
 
 static int num=7;
 return num--;
 }
 int main()
 {
 for(r();r();r())
 printf("%d ", r());
 return 0;
 }
*/