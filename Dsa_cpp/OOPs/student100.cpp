#include<iostream>
using namespace std;

class Student{
    public:
    string name;
    int reg_no;
    float marks;

    void input(){
        cout<<"Enter name reg_no marks"<<endl;
        cin>>name>>reg_no>>marks;
    }
    void display(){
        cout<<name<<" "<<reg_no<<" "<<marks<<endl;
    }
};

int main(){
    Student s[5];
    for(int i=0;i<5;i++){
        s[i].input();
    }
    for(int i=0;i<5;i++){
        s[i].display();
    }
}