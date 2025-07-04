#include<iostream>
using namespace std;

class Node{
    public:
    int data;
    Node* prev;
    Node* next;

    Node(){
        this->data = 0;
        this->prev = NULL;
        this->next = NULL;
    }
    Node(int data){
        this->data =data;
        this->prev = NULL;
        this->next = NULL;
    }
};

 void print(Node* &head){
        Node* temp =head;
        while(temp!=NULL){
            cout<<temp->data<<" ";
            temp = temp->next;
        }
        cout<<endl;
    }

int getlen(Node* &head){
    Node* temp=head;
    int len=0;
    while(temp!=NULL){
        temp=temp->next;
        len++;
    }
    return len;
}
void insertAtHead(int data, Node* &head, Node* &tail){
    if(head==NULL){
        Node* newNode = new Node(data);
        head = tail = newNode;
        return;
    }
    Node* newNode = new Node(data);
    newNode->next = head;
    head->prev = newNode;
    head = newNode;

}
void insertAtTail(int data, Node* &head, Node* &tail)
    {
if(head ==NULL){
    Node* newNode =new Node(data);
    head=tail=newNode;
    return;
}
Node* newNode = new Node(data);
tail->next=newNode;
newNode->prev=tail;
tail=newNode;
    }
void insertAtposition(Node * &head, Node* &tail, int data, int position){
 if(head==NULL){
    Node* newNode =new Node(data);
    head=tail=newNode;
    return;
 }
 //ll is not empty
 if(position==0){
    insertAtHead(data, head, tail);
    return;
 }
 int len=getlen(head);
 if(position>len){
    insertAtTail(data, head, tail);
    return;
 }
 //insert at any position in between
 int i=1;
 Node* prev=head;
 
 while(i<position-1){
    prev=prev->next;
    i++;
 }
 Node* newNode=new Node(data);
 Node* curr=prev->next;
 prev->next=newNode;
 newNode->prev=prev;
 curr->prev=newNode;
 newNode->next=curr;



}
void deleteFromPosition(Node* head,Node* tail, int position){
    
    if(head==NULL){
        cout<<"List is empty, nothing to delete."<<endl;
        return;
    }
    if(head-> next==NULL){
        Node* temp=head;
        tail=head=NULL;
        delete(temp);
        return;
        }
    int len=getlen(head);
    if(position>len){
        cout<<"Position is greater than length of list, nothing to delete."<<endl;
        return;
    }
    if(position==1){
        Node * temp=head;
        head=head->next;
        temp->next=NULL;
        delete(temp);
        return;
    }
    if(position==len){
        Node* temp=tail;
        tail=tail->prev;
        temp->prev=NULL;
        tail->next=NULL;
        delete(temp);
        return;
    }
    //delete at middle
}
   
int main(){
    Node* head = NULL;
    Node* tail = NULL; 

    Node* first = new Node(10);
    Node* second = new Node(20);
    Node* third = new Node(30);
    Node* fourth = new Node(40);
    head = first;
    tail = fourth;
    first->next = second;
    second->prev = first;
    second->next = third;
    third->prev = second;
    third->next = fourth;
    fourth->prev = third;
    print(head);
    

    cout<<"after inserting "<<endl;
    insertAtHead(500, head, tail);
    insertAtTail(600, head, tail);
    
    print(head);
    insertAtposition(head, tail, 700, 8 );
    cout<<"after inserting at position call"<<endl;
    print(head);
    cout<<"Length of LL is "<<getlen(head)<<endl;
    return 0;
} 