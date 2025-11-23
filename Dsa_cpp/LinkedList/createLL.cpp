#include<iostream>
using namespace std;
class Node{
    public:
    int data;
    Node* next;
    Node(int data){
        this->data=data;
        this->next=NULL;
    }
    Node(){
        this->data=0;
        this->next=NULL;
    }
};

void print(Node* &head){
    cout<<"This is a linked list"<<endl;
    Node* temp =head;
    while(temp!=NULL){
        cout<<temp->data<<" ";
        temp=temp->next;
    }

}
int main(){
    Node* first=new Node(10);
    Node* second=new Node(20);
    Node* third=new Node(30);
    Node* fourth=new Node(40);
    first->next=second;
    second->next=third;
    third->next=fourth;
    cout<<"printing the LL"<<  endl;
    print(first);
    cout<<endl;
    return 0;
}