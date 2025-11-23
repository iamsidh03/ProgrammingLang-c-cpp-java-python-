#include<iostream>
using namespace std;
class Node{
    public:
    int data;
    Node* next;
    Node* tail;
    Node(){
        data = 0;
        next = NULL;
        tail = NULL;
    }
    Node(int data){
        this->data=data;
        this->next=NULL;
        this->tail=NULL;
    }
};
void print(Node* &head){
    Node* temp=head;
    while(temp!=NULL){
        cout<<temp->data<<" ";
        temp=temp->next;
    }
}
Node* reverse(Node* &prev,Node* &curr){
  
    if(curr==NULL) return prev;
    Node* nextNode = curr->next;
    curr->next = prev;
    return reverse(curr, nextNode);

}
Node* revloop(Node* &head){
    Node* prev=NULL;
    Node* curr=head;
    while(curr!=NULL){
        Node* newNode=curr->next;
        curr->next=prev;
        prev=curr;
        curr=newNode;

    }
    return prev;
}


int main(){
    Node* head = NULL;
    Node* tail = NULL;
    Node* first= new Node(10);
    Node* second= new Node(20);
    Node* third= new Node(30);
    Node* fourth= new Node(40);
    head=first;
    tail=fourth;
    first->next=second;
    second->next=third;
    third->next=fourth;
    fourth->next=NULL;
    Node* prev=NULL;
    Node* curr=head;
    //Node* temp=reverse(prev, curr);
    Node* temp=revloop(head);
    print(temp);
    return 0;
}