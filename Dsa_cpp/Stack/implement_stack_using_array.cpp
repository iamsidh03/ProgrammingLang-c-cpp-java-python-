#include<iostream>
using namespace std;

class Stack{
    
    int top;
    int *arr;
    int size;
public:
    Stack(){
        top=-1;
        size=10000;
        arr=new int[size];
        }
    void push(int element){
        top++;
        arr[top]=element;
    }
    int pop(){
        int x=arr[top];
        top--;
        return x;
    }
    int Top_(){
        return arr[top];
    }
    int size_(){
        return top+1;
    }
};

int main(){
 Stack s;
  s.push(6);
  s.push(3);
  s.push(7);
  cout << "Top of stack is before deleting any element " << s.Top_() << endl;
  cout << "Size of stack before deleting any element " << s.size_() << endl;
  cout << "The element deleted is " << s.pop() << endl;
  cout << "Size of stack after deleting an element " << s.size_() << endl;
  cout << "Top of stack after deleting an element " << s.Top_() << endl;
  return 0;
}