#include<iostream>
using namespace std;
class node{
    public:
    int data;
    node* left;
    node* right;
    node(int val){
        data=val;
        left=right=NULL;
    }
};
node* binarytree(){
    int x;
    cout<<"Enter the data for the node (-1 for no node): ";
    cin>>x;
    if(x==-1){
        return NULL;
    }
    node* temp=new node(x);
    cout<<"Enter left child of "<<x<<": ";
    temp->left=binarytree();
    cout<<"Enter right child of "<<x<<": ";
    temp->right=binarytree();
    return temp;
}

int main(){
    cout<<"Enter the root Node: ";
    node* root=binarytree();
    return 0;
}