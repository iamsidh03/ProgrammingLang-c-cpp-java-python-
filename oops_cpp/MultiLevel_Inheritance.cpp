#include<iostream>
using namespace std;

class Person{
    
     public:
     string name;
     void intro(){
        cout<<"My name is "<<name<<endl;
     }
};
class Employee: public Person{
 protected:
 double salary;


};
class Manager: public Employee{
    protected:
    string department;
    public:
    Manager(string name, double salary, string department){
        this->name=name;
        this->salary=salary;
        this->department=department;
    }
    void display(){
        cout<<"Name of person: "<<name
        <<"\n salary of person: "<<salary
        <<"\n Department of the person: "<<department<<endl;
    }
};

int main(){
    Manager a("Siddharth",20000.323,"tech and finance");
    a.display();
    a.intro();
}