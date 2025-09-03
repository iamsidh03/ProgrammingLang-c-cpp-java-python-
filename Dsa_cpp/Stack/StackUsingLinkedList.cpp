#include<iostream>
using namespace std;

class StackNode{
    int data;
    StackNode *next;
    StackNode(int data){
        int d=data;
        next=NULL;
    }
};
class Stack{
    StackNode *top;
    int size;
    Stack(){
        top=NULL;
        size=0;
    }
    void push(int data){
        
    }
};


int main(){

}