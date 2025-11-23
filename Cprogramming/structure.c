#include <stdio.h>
struct stu{
    int r1;
    float m1;
    char name1[20];

};

/*struct stud{
    int r2;
    float m2;
    char name2[20];

}s;
*/
struct std{
    int r3;
    float m3;
    char name3[20];

}s3={11,99.9,"Raj"};
struct st{
    int r4;
    float m4;
    char name4[20];
};
struct st s4={1,30.4,"Sittharth"};// we can also initialise outside main
 //this is also works
int main(){
   //struct stu s={1,99.3,"Sid"} ;
   //printf("%d",s.r1); 
    // s.r2=10; // valid initialisation
   // printf("%d",s.r2);

   //to declare name 
   //strcpy(s.name2,"Raj");
  // printf("%d",s3.r3);
   printf("%d,%f,%s \n",s4.r4,s4.m4,s4.name4);

   
}