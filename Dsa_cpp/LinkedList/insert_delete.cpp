#include <iostream>
using namespace std;

class Node
{
public:
    int data;
    Node *next;

    Node()
    {
        this->data = 0;
        this->next = NULL;
    }

    Node(int value)
    {
        this->data = value;
        this->next = NULL;
    }
    // destructutor to delete a node
    /* ~Node() {
        if (next != NULL) {
            delete next; // Recursively delete the next node
            next = NULL; // Set next to NULL to avoid dangling pointer
        }
        cout << "Node with data " << data << " deleted." << endl;
    } */

    ~Node()
    {
        cout << "Node with data " << data << " deleted." << endl;
    }
};

int findLength(Node *&head)
{
    int len = 0;
    Node *temp = new Node;
    while (temp != NULL)
    {
        len++;
        temp = temp->next;
    }
    return len;
}

void insertAtHead(int data, Node *&head, Node *&tail)
{
    if (head == NULL)
    {
        Node *newNode = new Node(data);
        head = tail = newNode;
        return;
    }
    /*  // if list is empty
     if (head == NULL) {
         head = tail = newNode;
         return;
     } */
    Node *newNode = new Node(data);
    newNode->next = head;
    head = newNode;
}

void insertAtTail(int data, Node *&head, Node *&tail)
{

    if (head == NULL)
    {
        Node *newNode = new Node(data);
        head = tail = newNode;
        return;
    }

    /*  // if list is empty
     if (tail == NULL) {
         head = tail = newNode;
         return;
     } */
    Node *newNode = new Node(data);
    tail->next = newNode;
    tail = newNode;
}
void insertAtposition(int data, int position, Node *&head, Node *&tail)
{

    if (head == NULL)
    { // if list is empty
        Node *newNode = new Node(data);
        head = tail = newNode;
        return;
    }
    if (position == 0)
    { // insert at head
        insertAtHead(data, head, tail);
        return;
    }
    int len = findLength(head);
    if (position > len)
    { // if position is greater than length of list, insert at tail
        insertAtTail(data, head, tail);
        return;
    }
    int i = 1;
    Node *prev = head;
    while (i < position && head != NULL)
    { // insert at any position in between
        prev = prev->next;
        i++;
    }
    Node *curr = prev->next;

    Node *newNode = new Node(data);
    newNode->next = curr;
    prev->next = newNode;
}

void print(Node *&head)
{
    Node *temp = head;
    while (temp != NULL)
    {
        cout << temp->data << " ";
        temp = temp->next;
    }
    cout << endl;
}
void deleteAtPosition(int position, Node *&head, Node *&tail)
{
    if (head == NULL)
    {
        cout << "List is empty, nothing to delete." << endl;
        return;
    }
    if (position == 1)
    {
        Node *temp = head;
        head = head->next;
        temp->next = NULL;
        delete temp;
        return;
    }
    int len = findLength(head);
    if(position>len){
        cout<<"Position is greater than length of list, nothing to delete."<<endl;
        return;
    }
    if (position == len)
    {
        int i = 1;
        // step1:find previous node
        Node *prev = head;
        while (i < len - 1)
        {
            prev = prev->next;
            i++;
        }
        // step2: prev-Next=NULL;
        prev->next = NULL;
        Node *temp = tail;

        tail = prev;
        // step3: delete tail
        delete temp;
        return;
    }

    //delete at middle
    int i=1;
    Node* prev=head;
    while(i<position-1 && prev!=NULL)
    {
        prev=prev->next;
        i++;
    }
    Node* curr=prev->next;
    prev->next=curr->next;
    curr->next=NULL;
    delete curr;
    return;
}

int main()
{
    Node *head = NULL;
    Node *tail = NULL;

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
    cout << endl;
    insertAtposition(100, 7, head, tail);

    cout << "Printing the Linked List after insert at position call:" << endl;
    print(head);
    cout<<endl;
    deleteAtPosition(9, head, tail);
    // cout << "deleted at position call " << endl;
    print(head);

    return 0;
}
