#include<iostream>
using namespace std;

class Base{
    public:
    Base(){
    cout<<"this is base constructor"<<endl;
}
~Base(){
    cout<<"This is Base Class Dstructor"<<endl;
}
};

class Derived: public Base{

    public:
    Derived(){
        cout<<"This is Derived class"<<endl;
    }
    ~Derived(){
        cout<<"This is derived class Dstructor"<<endl;
    }
};

int main(){
    Base *b=new Derived();
    delete b;
    return 0;
}