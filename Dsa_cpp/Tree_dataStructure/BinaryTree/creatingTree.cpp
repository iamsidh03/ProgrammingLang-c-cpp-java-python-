#include<iostream>
using namespace std;
struct TreeNode{
    int data;
    TreeNode* left;
    TreeNode* right;
    TreeNode(int data){
        this->data=data;
        this->left=this->right=NULL;
    }
};
void Inorder(TreeNode* node){ //(le,ro,ri)
    if(node==NULL) return;
    Inorder(node->left);
    cout<<node->data<<" ";
    Inorder(node->right);

}
void levelorder(TreeNode* node){
    
}
int main(){
    TreeNode* root=new TreeNode(1);
    root->left=new TreeNode(2);
    root->right=new TreeNode(3);
    root->left->left=new TreeNode(4);
    root->left->right=new TreeNode(5);
    root->right->left=new TreeNode(6);
    root->right->right=new TreeNode(7);
    Inorder(root);
    return 0;

}