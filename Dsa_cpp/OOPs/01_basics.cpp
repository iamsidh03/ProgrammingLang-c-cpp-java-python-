#include<iostream>
using namespace std;
class sizeclass{
    public:
    // char a;
    // char b; 
    // int c;  //8

    // char a;
    // int c;
    // char b; //12

    double a;
    char b;

};
class Student{
    private:
    string name;
    int    age,roll_no;
    string grade;
    public:
    // Constructor
    void setname(string s){
        if(s.size()==0) {
            cout<<"Invalid name"<<endl;
            return;
        }
        name=s;
    }
    void setage(int a){
        age=a;
    }
    void setroll_no(int r){
        roll_no=r;
    }
    void setgrade(string g){
        grade=g;
    } 
    string get_grade(int pin){
      if(pin ==123){
    return grade;
      }
      return "Invalid pin";
      
    }
    void display(){
        cout<<name<<" "<<age<<" "<<roll_no<<" "<<grade<<endl;
    }
};
int main(){
    Student s1;
    // s1.name="";
    // s1.age=20;
    // s1.roll_no=1;
    // s1.grade="A";
    // cout<<s1.name<<" "<<s1.age<<" "<<s1.roll_no<<" "<<s1.grade<<endl;
    // s1.setname("");
    // s1.setage(20);
    // s1.setroll_no(1);
    // s1.setgrade("A");
    // s1.display();
    // cout<<s1.get_grade(123)<<endl;
    // cout<<s1.get_grade(456)<<endl;
    sizeclass s;
    cout<<sizeof(s)<<endl;
    return 0;
}