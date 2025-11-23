#include<iostream>
using namespace std;
#include <stack>

void inserSorted(stack<int> &st,int target){
    if(st.empty()){
        st.push(target);
        return;
    } 
    if(st.top()>=target){
        st.push(target);
        return;
    }
    int topEle=st.top();
    st.pop();
    inserSorted(st,target);
    st.push(topEle);
}
void sortstack(stack<int> &s ){
    if(s.empty()){
        return;
    }
    int topele=s.top();
    s.pop();
    sortstack(s);
    inserSorted(s,topele);
}
int main(){
    stack<int> st;
    st.push(1);
    st.push(3);
    st.push(2);
    
   
    st.push(5);
    
    st.push(7);
    
    st.push(10);
    st.push(6);
     st.push(4);
  
    cout<<"print sorted stack";
    sortstack(st);
    while(!st.empty()){
        cout<<st.top()<<" ";
        st.pop();
    }

}