#include<iostream>
using namespace std;

/* class Human{
    public:
    int a;
    protected:
    int b;
    private:
    int c;
    public:
    void fn(){
        a=10;
        b=20;
        c=30;
    }
}; */


class Human{
    string religion,color;
    protected:
    string name;
    int age,weight;
};
class Student: private Human{
    int rollNo, fees;
    public:
    Student(string name,int age, int weight,int rollNo,int fees){
        this->name=name;
        this->age=age;
        this->weight=weight;
        this->rollNo=rollNo;
        this->fees=fees;
    }
    void display(){
        cout<<"name is "<< name<<"\n age is "<< age<<"\n Weight is "<<weight<<"\nRoll Number"<<rollNo<<"\n fee is"<<fees<<endl;
    }
};

class 
int main(){
    // Human raj;
    // raj.a=10;
   /*  
   can't access privte and protected outside calss directly
   raj.b=10; 
    raj.c=10; */
    // raj.fn();

    Student A("Raj",12,30,2241018,1000000);
    A.display();



}