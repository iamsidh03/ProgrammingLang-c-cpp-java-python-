#include<iostream>
using namespace std;

class node{
    public:
    int data;
    node* next;
    node(int data){
        this->data=data;
        this->next=NULL;
    }
};
void printlist(node* head){
    node* temp=head;
    while(temp!=NULL){
        cout<<temp->data<<" ";
        temp=temp->next;
    }
    cout<<endl;
}
node* sortZeroOneTwo(node* &head){
if(!head ||!head->next) return head;
node* temp=head;
int cntzero=0, cntone=0, cnttwo=0;
while(temp){
    if(temp->data==0) cntzero++;
    if(temp->data==1) cntone++;
    if(temp->data==2) cnttwo++;
    temp=temp->next;

 }
 temp=head;
 int i=0;
 while(i!=cntzero){
    temp->data=0;
    temp=temp->next;
    i++;
 }
 i=0;
 while(i!=cntone){
    temp->data=1;
    temp=temp->next;
    i++;
 }
 i=0;
 while(i!=cnttwo){
    temp->data=2;
    temp=temp->next;
    i++;
 }
 return head;

}
int main(){
    node* first=new node(2);
    node* second=new node(1);
    node* third=new node(1);
    node* forth=new node(0);
    node* fifth=new node(0);
    node* sixth=new node(2);
    node* seventh=new node(1);
    node* head=first;
    first->next=second;
    second->next=third;
    third->next=forth;
    forth->next=fifth;
    fifth->next=sixth;
    sixth->next=seventh;
    seventh->next=NULL;
    printlist(head);
    node* sortedlist=sortZeroOneTwo(head);
    printlist(sortedlist);


}