#include <iostream>
using namespace std;

class Node {
public:
    int data;
    Node* next;

    Node() {
        this->data = 0;
        this->next = NULL;
    }

    Node(int value) {
        this->data = value;
        this->next = NULL;
    }
};

int findLength(Node* &head){
    int len=0;
    Node* temp=new Node;
    while(temp!=NULL){
        len++;
        temp=temp->next;
    }
    return len;
}

void insertAtHead(int data, Node*& head, Node*& tail) {
    if(head==NULL){
    Node* newNode = new Node(data);
    head = tail = newNode;
    return;
    }
   /*  // if list is empty
    if (head == NULL) {
        head = tail = newNode;
        return;
    } */
    Node* newNode = new Node(data);
    newNode->next = head;
    head = newNode;
}

void insertAtTail(int data, Node*& head, Node*& tail) {

      if(head==NULL){
    Node* newNode = new Node(data);
    head = tail = newNode;
    return;
    }

   /*  // if list is empty
    if (tail == NULL) {
        head = tail = newNode;
        return;
    } */
    Node* newNode = new Node(data);
    tail->next = newNode;
    tail = newNode;
}
void inserAtposition(int data,int position,Node* &head,Node* &tail){
   
    if(head==NULL){ //if list is empty
        Node* newNode=new Node(data);
        head=tail=newNode;
        return;
    }
    if(position==0){//insert at head
        insertAtHead(data,head,tail);
        return;
    }
    int len=findLength(head);
    if(position>len){  //if position is greater than length of list, insert at tail
        insertAtTail(data, head, tail);
        return;
    }
    int i=1;
    Node* prev=head;
    while(i<position && head!=NULL){ //insert at any position in between
        prev=prev->next;
        i++;
    }
    Node* curr= prev->next;

    Node* newNode = new Node(data);
    newNode->next=curr;
    prev->next=newNode;

}

void print(Node*& head) {
    Node* temp = head;
    while (temp != NULL) {
        cout << temp->data << " ";
        temp = temp->next;
    }
    cout << endl;
}


int main() {
    Node* head = NULL;
    Node* tail = NULL;

    // Instead of assigning manually to head->next (head is NULL), insert using function
    insertAtTail(20, head, tail);
    insertAtTail(30, head, tail);
    insertAtTail(40, head, tail);

    insertAtHead(5, head, tail);
    insertAtHead(15, head, tail);
    insertAtHead(25, head, tail);
    insertAtHead(35, head, tail);
     cout << "Printing the Linked List:" << endl;
    print(head);
    cout<<endl;
    inserAtposition(100, 7, head, tail);

     cout << "Printing the Linked List after insert at position call:" << endl;
    print(head);
  
   

    return 0;
}
