#include<iostream>
using namespace std;
class Node{
    public:
    int data;
    Node* next;
    Node( int data)
    {
        this->data=data;
        this->next=NULL;
    }
};
void print(Node* &head){
    Node* temp=head;
    while(temp!=NULL){
        cout<<temp->data<<" ";
        temp=temp->next;
    }
}
int lenList(Node* head){
    Node* temp=head;
    int len=0;
    while(temp){
        temp=temp->next;
        len++;
    }
    return len;
}
int kthNode(Node* head,int pos){
    int posFromStart=lenList(head)-pos-1;
    Node* temp=head;
    while(posFromStart--){
        temp=temp->next;
    }
    return temp->data;
    
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
    cout<<kthNode(first,2)<<endl;
    return 0;
}