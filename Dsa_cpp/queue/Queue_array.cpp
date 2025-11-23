#include<iostream>
using namespace std;

class Queue{
    public:
    int *arr;
    int Front,rear;
    int size;
    Queue(int x){
        arr=new int[size];
        Front=-1;
        rear=-1;
        size=x;
    }
    int isEmpty(){
    return Front==-1;
}
    int isFull(){
        return rear==size-1;
    }
    void push(int x){
        if(isEmpty()){
            Front=rear=0;
            arr[Front]=x;
        }
        else if(isFull()){
            cout<<"Queue is full"<<endl;
        }
        else{
            rear++;
            arr[rear]=x;
        }
    }
    void pop(){
        if(isEmpty()){
            cout<<"Queue is empty"<<endl;
        }
        else{
            if(Front==rear){
                Front=rear=-1; // Reset queue when last element is popped
            }
            else{
                Front++;
            }                      
        }

    }
    int start(){
        if(isEmpty()){
            cout<<"Queue is empty"<<endl;
            return -1; // Indicating queue is empty
        }
        else{
            return arr[Front]; // Return the front element
        }
    }
};


int main(){
    Queue q(5);
    q.push(10);
    q.push(20);
    q.push(30);
    cout << "Front element: " << q.start() << endl; // Should print 10
    q.pop();
    cout << "Front element after pop: " << q.start() << endl; // Should print 20
    q.pop();
    q.pop();
    cout << "Front element after popping all: " << q.start() << endl; // Should indicate queue is empty
    return 0;

}