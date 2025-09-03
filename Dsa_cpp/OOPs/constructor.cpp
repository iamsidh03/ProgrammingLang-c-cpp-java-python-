#include<iostream>
using namespace std;

class Customer
{
    string name;
    int account_number;
    int bal;
    public:
   /*  Customer(){
        cout<<"Default constructor called"<<endl;
    } */
   Customer(){
    name="Default Name";
    account_number=0;
    bal=0;
   }
  /* Customer(string a,int b,int c){
    name=a;
    account_number=b;
    bal=c;
  } */
  Customer(string a,int b){
    name=a;
    account_number=b;
    
  }
  //Inline constructor
  inline Customer(string a,int b,int c):name(a),account_number(b),bal(c){}

   void display(){ 
     cout<<name<<" "<<account_number<<" "<<bal<<endl;
   }
};
int main(){
    Customer c1;
    c1.display();
    // / Customer c2;
    // c2.display();

    Customer c3("abc",123,1000);
 
    c3.display();
    Customer c4("abc",123);
    c4.display();                            

    return 0;
}