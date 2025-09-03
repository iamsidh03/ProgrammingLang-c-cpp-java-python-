#include<iostream>
using namespace std;
class Stack{
    public:
    int *arr;
    int size;
    int top1;
    int top2;

    Stack(int size){
        arr=new int[size];
        this->size=size;
        top1=-1;
        top2=size;
    }

    void push1(int data){
        if(top1+1<top2){
            //space availabe
            top1=top1+1;
            arr[top1]=data;
            cout<<"Element inserted in stack 1 "<<arr[top1]<<endl;
        }
        else{
            cout<<"stack overflow in stack 1 "<<endl;
        }

    }
    void pop1(){
        if(top1==-1){
            cout<<"stack underflow in stack 1 "<<endl;
        }
        else{
            cout<<"Element deleted from stack 1  "<<arr[top1]<<endl;
            top1--;
        }
    }
    void push2(int data){
        if(top2-1>top1){
            //space available
            top2=top2-1;
            arr[top2]=data;
            cout<<"Element inserted  in stack 2 "<<arr[top2]<<endl;
        }else{
            cout<<"stack overflow in stack 2 "<<endl;
        }
    }
    void pop2(){
        if(top2==size){
            cout<<"stack underflow in stack 2 "<<endl;
        }else{
            cout<<"Element deleted from stack 2 "<<arr[top2]<<endl;
            top2++;
        }
    }
};

int main(){
    
    Stack s(5);
    s.push1(10);
    s.push1(20);
    s.push2(30);
    s.push2(40);
    s.pop1();
    s.pop2();
    return 0;
}