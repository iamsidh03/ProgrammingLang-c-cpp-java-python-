 
 //9
 /*
 #include<stdio.h>
 struct s{int *p;};
 int main(){int a=200;struct s s1;
 s1.p=&a;
 *(s1.p)=*(s1.p)+100;
 printf("%d %d\n",a,*(s1.p));
 return 0;}
 */

//10
/*
#include<stdio.h>
 int main(){
 struct s1{
 char *z;
 int i;
 struct s1 *p;
 };
 struct s1 a[]={{"SOA",1,a+1},
 {"ITER",4,a+2},
 {"CSE",5,a}
 };
 struct s1 *ptr=a;
 printf("%s%s%s\n",a[0].z,a[1].z,a[2].z);
 printf("%s%s%s",(*ptr).z, ptr->z,a[2].p->z);
 return 0;
 }
 */

//11
/*
#include<stdio.h>
/// Draw the node connectivity of the structure s1 and determine the output of the code snippet that
 //simulates the array of structures and also the self-referential structure;
 int main(){
 struct s1{
 char *z;
 int i;
 struct s1 *p;
 };
 struct s1 a[]={{"SOA",1,a+1},
 {"ITER",2,a+2},
 {"CSE",3,a}};
 struct s1 *ptr=a;
 printf("%s\n", ++(ptr->z));
 printf("%s\n", a[(++ptr)->i].z);
 printf("%s\n",a[--(ptr->p->i)].z);
 printf("%d\n",--a[2].i);
 return 0;
 }
 */
//12
/*
#include<stdio.h>
int main(){
    struct test{
        int i;
        char *c;
    };
    struct test st[] = {
        {5, "Cse-Engg"},
        {4, "computer"},
        {6, "Electrical"},
        {8, "Mechnical"},
        {7, "All-Engg"}
    };
    struct test *p = st;

    printf("%s\n", ++(p++->c));
    printf("%c\n", *p++->c);
    printf("%d\n", ++p->i);
    printf("%s\n", p[0].c);
    printf("%s\n", p->c);
    return 0;
}
*/



//13
/*
#include<stdio.h>

int main(){
    struct out{
        char ch[10];
        char *str;
    };
    struct b{
        char *c;
        struct out o;
    };
    struct b s2 = {"ODISHA", "KHURDA", "JOYDEV"}; // Initialization
    printf("%s %s %s\n", s2.c, s2.o.ch, s2.o.str); // First printf
    printf("%s %s\n", ++s2.c, ++s2.o.str);         // Second printf
    return 0;
}
*/
//14
/*
#include<stdio.h>
 int main(){
 union unit{
 int marks;
 int roll;
 }s1,s2;
 s2.roll=23;
 s1.roll=23;
 s1.marks=60;
 printf("%d..%d\n",s1.marks,s1.roll);
 printf("%d..%d\n",s2.marks,s2.roll);
 return 0;
 }
 */ 


//15
/*
#include<stdio.h>
int main(){
 union unit{
 int marks;
 int roll;
 }s1,s2;
 s2.roll=23;
 s2.marks=60;
 printf("Check memory alloc for union\n");
 printf("%d..%d\n",s2.marks,s2.roll);
 return 0;
 }
 */
 
