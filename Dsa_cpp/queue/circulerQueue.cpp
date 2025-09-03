#include<iostream>
using namespace std;

class CircularQueue{
    public:
    int *arr;
    int front;
    int rear;
    int size;
    CircularQueue(int x){
        arr=new int[x];size=x;
        front=rear=-1;
    }
    bool isempty(){
        return front==-1;
    }
    bool isfull(){
        return rear==(front+size-1)%size;
    }
    void push( int ele){
        if(isempty()){
            front=rear=0;
            arr[front]=ele;
        }
        else if(isfull()){
            cout<<"queue is full\n";
        }
        else{
            rear=(rear+1)%size; // Circular increment
            arr[rear]=ele;
        }
    }
    void pop(){
        if(isempty()){
            cout<<"queue is empty\n";
        }
        else if(front==rear){
            front=rear=-1;
        }
        else{
            front=(front+1)%size;
        }
    }
    int start(){
        if(isempty()){
            cout<<"queue is empty\n";
            return -1; // Indicating queue is empty
        }
        else{
            return arr[front]; // Return the front element
        }
    }
    
};
int main(){
    CircularQueue q(5);
    q.push(10);
    q.push(20);
    cout << "Front element: " << q.start() << endl; // Should print 10
    q.pop();
    cout << "Front element after pop: " << q.start() << endl; // Should print 20
    q.push(30);
    q.push(40);
    q.push(50);
    q.push(60); // This should indicate that the queue is full
    cout << "Front element after pushing more elements: " << q.start() << endl; // Should still print 20
    return 0;
}
