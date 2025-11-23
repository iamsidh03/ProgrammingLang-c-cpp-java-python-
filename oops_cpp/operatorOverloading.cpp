#include<iostream>
using namespace std;

class Complex{
    int real,img;
    public:
    Complex(int real,int img){
        this->real=real;
        this->img=img;
    };
    Complex(){

    };
    void Display(){
        cout<<real<<" +i"<<img<<endl;
    }
    Complex operator +(Complex &c){
        Complex ans;
        ans.real= real+c.real;
        ans.img=img+c.img;
        return ans;
    }
};
int main(){
    Complex c1(3,2);
    Complex c2(4,4);
    Complex c3=c1+c2;
    c3.Display();
}