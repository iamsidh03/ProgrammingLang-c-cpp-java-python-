#include<iostream>
using namespace std;

class Stack{
    public:
    int *arr;
    int top;
    int size;
    Stack(int size){
        arr=new int[size];
        top=-1;
        this->size=size;
    }


void push(int data){
    if(size-top>1){
        //space available
        top++;
        arr[top]=data;
        cout<<"Element inserted "<<arr[top]<<endl;
    }
    else{
        cout<<"stack overflow"<<endl;
    }
}
void pop(){
    if(top==-1){ //stack is empty
        cout<<"stack underflow"<<endl;
    }
    else{
        cout<<"Element deleted "<<arr[top]<<endl;
        top--;
    }
}
int getTop(){
    if(top==-1){
        cout<<"stack is empty "<<endl;
        return -1;
    }else{
        return arr[top];
    }
}
int getSize(){ //number of valid element present in stack
    return top+1;
}
bool isEmpty(){
    if (top==-1)
    return true;

    else return false;
}
};
int main(){
 Stack s(10);
 s.push(10);
 s.push(20);
 s.push(30);
 s.push(40);
  s.pop();
  cout<<"Element at top is "<<s.getTop()<<endl;
  cout<<"Size of stack is "<<s.getSize()<<endl;
  cout<<"Stack is empty or not "<<s.isEmpty()<<endl;

  //see the element of stack
  while(!s.isEmpty()){
      cout<<s.getTop()<<endl;
      s.pop();
  }
 return 0;
}


