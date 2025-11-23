#include<iostream>
#include<queue>
using namespace std;

class node{
    public:
    int data;
    node* left;
    node* right;
    node(int data){
        this->data=data;
        left=right=NULL;
    }
};


int main(){
  int n;
  cout<<"Enter the root element"<<endl;
  cin >> n;
    node* root=new node(n);
    queue<node*> q;
    q.push(root);
    int first,second;
    while(!q.empty()){
        node* curr=q.front();
        q.pop();
        cout<<"Enter the left child of "<<curr->data<<endl;
        cin >> first;
        if(first!=-1){
            curr->left=new node(first);
            q.push(curr->left);
        }
        cout<<"Enter the right child of "<<curr->data<<endl;
        cin>> second;
        if(second!=-1){
            curr->right=new node(second);
            q.push(curr->right);
        }
        }
      
    }

// The code implements a binary tree by taking input from the user for each node's left and right children.
// It uses a queue to facilitate level-order traversal for inserting nodes into the tree.